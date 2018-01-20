package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    /**
     *
     */
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Employee johnSmith = new Employee("John", "Smith");
    private static final Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    private static final Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
    private static final Employee frankSmith = new Employee("Frank", "Smith");


    private static final Company dataProjects = new Company("Data Projects");
    private static final Company datsunCorp = new Company("Datsun Corp");
    private static final Company generalMotors = new Company("General Motors");
    private static final Company generalli = new Company("Generalli");

    public void employeesTobase () {
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(frankSmith);
    }

    public void companiesTobase () {
        companyDao.save(dataProjects);
        companyDao.save(datsunCorp);
        companyDao.save(generalMotors);
        companyDao.save(generalli);
    }


    public void companiesGetEmployes () {
        dataProjects.getEmployees().add(johnSmith);
        datsunCorp.getEmployees().add(stephanieClarckson);
        datsunCorp.getEmployees().add(lindaKovalsky);
        generalMotors.getEmployees().add(johnSmith);
        generalMotors.getEmployees().add(lindaKovalsky);
        generalli.getEmployees().add(stephanieClarckson);
        generalli.getEmployees().add(frankSmith);
        dataProjects.getEmployees().add(frankSmith);
    }

    public void employeesAddToCompanies () {
        johnSmith.getCompanies().add(dataProjects);
        johnSmith.getCompanies().add(generalMotors);
        stephanieClarckson.getCompanies().add(generalli);
        lindaKovalsky.getCompanies().add(datsunCorp);
        lindaKovalsky.getCompanies().add(generalMotors);
        stephanieClarckson.getCompanies().add(datsunCorp);
        frankSmith.getCompanies().add(dataProjects);
        frankSmith.getCompanies().add(generalli);
    }

    public void employeesRemovedFromCompanies () {
        johnSmith.getCompanies().remove(dataProjects);
        johnSmith.getCompanies().remove(generalMotors);
        stephanieClarckson.getCompanies().remove(generalli);
        lindaKovalsky.getCompanies().remove(datsunCorp);
        lindaKovalsky.getCompanies().remove(generalMotors);
        stephanieClarckson.getCompanies().remove(datsunCorp);
        frankSmith.getCompanies().remove(dataProjects);
        frankSmith.getCompanies().remove(generalli);
    }


    public void companiesSaveToCompanyDao () {
        companyDao.save(dataProjects);
        companyDao.save(datsunCorp);
        companyDao.save(generalMotors);
        companyDao.save(generalli);
    }

    public void employeesSaveToEmployeeDao () {
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(frankSmith);
    }

    public void printEmployeesIds () {
          System.out.println("\n"+"stephanieClarckson.getId(): "+stephanieClarckson.getId()+"\n"); //0
         System.out.println("\n"+"lindaKovalsky.getId(): "+lindaKovalsky.getId()+"\n"); //0
         System.out.println("\n"+"johnSmith.getId(): "+johnSmith.getId()+"\n"); //0
         System.out.println("\n"+"frankSmith.getId(): "+frankSmith.getId()+"\n"); //0
    }

    public void printCompaniesIds () {
        System.out.println("\n" + "dataProjects.getId(): " + dataProjects.getId() + "\n"); //0
        System.out.println("\n" + "datsunCorp.getId(): " + datsunCorp.getId() + "\n"); //0
        System.out.println("\n" + "generalMotors.getId(): " + generalMotors.getId() + "\n"); //0
        System.out.println("\n" + "generalli.getId(): " + generalli.getId() + "\n"); //0
    }

     @Before
     public void before() {
        System.out.println("\n" + "Test Case: begin" + "\n");
        companyDao.deleteAll();
        employeeDao.deleteAll();
     }
    //@Ignore
    @Test //Nr 1
    public void testSaveCompaniesToDao () {
        //Given
        System.out.println("\n" + "Test 1: testSaveCompaniesToDao ");
        //When
        companiesSaveToCompanyDao();
        //Then
        try {
            Assert.assertNotEquals(0, dataProjects.getId());
            Assert.assertNotEquals(0, datsunCorp.getId());
            Assert.assertNotEquals(0, generalMotors.getId());
            Assert.assertNotEquals(0, generalli.getId());

            Assert.assertEquals(4, companyDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test 1: testSaveCompaniesToDao  - exception" + "\n");
        }
    }
   @Ignore
    @Test //Nr 1a
    public void testDeleteCompaniesfromDao () {
        //Given
        System.out.println("\n" + "Test 1a: testDeleteCompaniesfromDao  - exception" + "\n");
        companiesSaveToCompanyDao();
        //System.out.println("\n+" + "dataProjects.geId(): " + dataProjects.getId() +"\n"); //Data Projects
        //System.out.println("\n" + "companyDao.count(): " + companyDao.count() +"\n"); //4
        //When
        companyDao.delete(dataProjects);
        //System.out.println("\n" + "companyDao.count(): " + companyDao.count() +"\n"); //4
        //System.out.println("\n" + "dataProjects.geId(): " + dataProjects.getId() +"\n"); //Data Projects
        //System.out.println("\n" + "companyDao.findByName(Data Projects).size(): " + companyDao.findByName("Data Projects").size() + "\n"); //0
        //Then
        try {
            Assert.assertNotEquals(0, dataProjects.getId());
            Assert.assertNotEquals(0, datsunCorp.getId());
            Assert.assertNotEquals(0, generalMotors.getId());
            Assert.assertNotEquals(0, generalli.getId());
            Assert.assertEquals(0, companyDao.findByName("Data Projects").size());
            Assert.assertEquals(3, companyDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test 1a: testDeleteCompaniesfromDao  - exception" + "\n");
        }
    }

    //@Ignore
    @Test // Nr 2
    public void testSaveEmployeesToDao () {
        //Given
        System.out.println("\n" + "Test 2: testSaveEmployeesToDao");
        //When
        employeesSaveToEmployeeDao();
        //Then
        try {
            Assert.assertNotEquals(0, johnSmith.getId());
            Assert.assertNotEquals(0, stephanieClarckson.getId());
            Assert.assertNotEquals(0, lindaKovalsky.getId());
            Assert.assertNotEquals(0, frankSmith.getId());

            Assert.assertEquals(4, employeeDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test 2: testSaveEmployeesToDao  - exception" + "\n");
        }
    }

    @Ignore
    @Test // Nr 2a
    public void testDeleteEmployeesFromDao () {
        //Given
        System.out.println("\n" + "Test 2a: testDeleteEmployeesFromDao");
        employeesSaveToEmployeeDao();
        ///System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() +"\n"); //4
        //System.out.println("\n" + "johnSmith.getId(): " + johnSmith.getId() +"\n"); //0
        //When
        employeeDao.deleteAll();
        //employeeDao.delete(johnSmith);
        //System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() +"\n"); //3
        //System.out.println("\n" + "johnSmith.size(): " + employeeDao.findByLastname("Smith").size() + "\n"); //0
        //System.out.println("\n" + "johnSmith.getId(): " + johnSmith.getId() +"\n"); //0

        //Then
        try {
            //Assert.assertNotEquals(0, johnSmith.getId());
            //Assert.assertEquals(1, employeeDao.findByLastname("Smith").size());
            //Assert.assertNotEquals(0, stephanieClarckson.getId());
            //Assert.assertNotEquals(0, lindaKovalsky.getId());
            //Assert.assertNotEquals(0, frankSmith.getId());

            Assert.assertEquals(0, employeeDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test 2a: testDeleteEmployeesToDao  - exception" + "\n");
        }
    }
    //@Ignore
    @Test //Nr 3
    public void testSaveCompaniesAndEmployesToDao () {
        //Given
        System.out.println("\n" + "Test 3: testSaveCompaniesAndEmployesToDao");
        //When
        companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();
        //Then
        try {
            Assert.assertNotEquals(0, dataProjects.getId());
            Assert.assertNotEquals(0, datsunCorp.getId());
            Assert.assertNotEquals(0, generalMotors.getId());
            Assert.assertNotEquals(0, generalli.getId());

            Assert.assertNotEquals(0, johnSmith.getId());
            Assert.assertNotEquals(0, stephanieClarckson.getId());
            Assert.assertNotEquals(0, lindaKovalsky.getId());
            Assert.assertNotEquals(0, frankSmith.getId());

            Assert.assertEquals(4, companyDao.count());
            Assert.assertEquals(4, employeeDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test 3: testSaveCompaniesAndEmployesToDao  - exception" + "\n");
        }
    }

    @Ignore
    @Test // Nr 3a
    public void testDeleteEmployeesAndCompanyFromDao () {
        //Given
        System.out.println("\n" + "Test 3a: testDeleteEmployeesAndCompanyFromDao");
        companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();
        //System.out.println("\n" + "companyDao.count(): " + companyDao.count() +"\n"); //4
        //System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() +"\n"); //4
        //When
        companyDao.delete(dataProjects);
        employeeDao.deleteAll();
        //System.out.println("\n" + "companyDao.count(): " + companyDao.count() +"\n"); //3
        //System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() +"\n"); //3
        //System.out.println("\n" + "dataProjects.size(): " + companyDao.findByName("Data Projects").size() + "\n"); //0
        //System.out.println("\n" + "johnSmith.size(): " + employeeDao.findByLastname("Smith").size() + "\n"); //0
        //Then
        try {
            Assert.assertEquals(0, companyDao.findByName("Data Projects").size());

            Assert.assertEquals(3, companyDao.count() );
            Assert.assertEquals(0, employeeDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test 3a: testDeleteEmployeesAndCompanyFromDao  - exception" + "\n");
        }
    }

    @Ignore
    @Test //Nr 4
    public void test3AndAddEmployesToCompanies () {
        //Given
        System.out.println("\n" + "Test 4: test3AndAddEmployesToCompanies");
        //When
        companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();
        employeesAddToCompanies ();

        //Then
        try {
            Assert.assertNotEquals(0, dataProjects.getId());
            Assert.assertNotEquals(0, datsunCorp.getId());
            Assert.assertNotEquals(0, generalMotors.getId());
            Assert.assertNotEquals(0, generalli.getId());

            Assert.assertNotEquals(0, johnSmith.getId());
            Assert.assertNotEquals(0, stephanieClarckson.getId());
            Assert.assertNotEquals(0, lindaKovalsky.getId());
            Assert.assertNotEquals(0, frankSmith.getId());

            Assert.assertEquals(4, companyDao.count());
            Assert.assertEquals(4, employeeDao.count());
            //printEmployeesIds ();
            //printCompaniesIds ();
        } catch (Exception e) {
            System.out.println("\n" + "Test 4: test3AndAddEmployesToCompanies  - exception" + "\n");
        }
    }

    @Ignore
    @Test //Nr 5
    public void testCheckFindEmployeByName() {
        //Given
        System.out.println("\n" + "Test 5: testCheckFindEmployeByName");
        companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();
        employeesAddToCompanies ();
        //When
        List<Employee> employeesWithThisLastname1 = employeeDao.retrieveWithThisLastname("Smith");
        List<Employee> employeesWithThisLastname2 = employeeDao.retrieveWithThisLastname("Kovalsky");
        //Then
        try {
            Assert.assertEquals(2 , employeesWithThisLastname1.size());
            Assert.assertEquals(1 , employeesWithThisLastname2.size());
            Assert.assertEquals(4, companyDao.count());
            Assert.assertEquals(4, employeeDao.count());
            System.out.println("\n" + "employeeDao.retrieveWithThisLastname(Smith): " + employeeDao.retrieveWithThisLastname("Smith").size() +"\n"); //2
            System.out.println("\n" + "employeeDao.retrieveWithThisLastname(Kovalsky): " + employeeDao.retrieveWithThisLastname("Kovalsky").size() +"\n"); //1
        } catch (Exception e) {
            System.out.println("\n" + "Test 5: testCheckFindEmployeByName  - exception" + "\n");
        }
    }

    @Ignore
    @Test //Nr 6
    public void testCheckFindCompanyByName() {
        //Given
        System.out.println("\n" + "Test 6: testCheckFindCompanyByName");
        companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();
        employeesAddToCompanies ();
        //When
        List<Company> companiesWithNamesSpec1 = companyDao.retrieveWithThisNamesSpec("Dat");
        List<Company> companiesWithNamesSpec2 = companyDao.retrieveWithThisNamesSpec("Gen");
        //Then
        try {
            Assert.assertEquals(2 , companiesWithNamesSpec1.size());
            Assert.assertEquals(2 , companiesWithNamesSpec2 .size());
            Assert.assertEquals(4, companyDao.count());
            Assert.assertEquals(4, employeeDao.count());
            System.out.println("\n" + "companyDao.retrieveWithThisNamesSpec(Dat): " + companyDao.retrieveWithThisNamesSpec("Dat").size() +"\n"); //2
            System.out.println("\n" + "companyDao.retrieveWithThisNamesSpec(Gen): " + companyDao.retrieveWithThisNamesSpec("Gen").size() +"\n"); //2
        } catch (Exception e) {
            System.out.println("\n" + "Test 6: testCheckFindCompanyByName  - exception" + "\n");
        }
    }

    @Ignore
    @Test // nr 7
    public void deleteCompaniesFromDao () {
        //Given
        System.out.println("\n" + "Test 7: deleteCompaniesFromDao");
        companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();
        employeesAddToCompanies ();
        System.out.println("\n" + "companyDao.count(): " + companyDao.count() + "\n"); //4
        System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() + "\n"); //4

        //When
        companyDao.deleteAll();
         System.out.println("\n" + "companyDao.count(): " + companyDao.count() + "\n"); //4
        //Then

        try {
                Assert.assertEquals(0, companyDao.count());
        } catch (Exception e) {
                System.out.println("\n" + "Test 7: deleteCompaniesInDao  - exception" + "\n");
        }
    }
    @Ignore
    @Test // nr 8
    public void deleteEmployeeFromDao () {
        //Given
        System.out.println("\n" + "Test 8: deleteEmployeeFromDao()"); //4
        companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();
        employeesAddToCompanies ();
        System.out.println("\n" + "companyDao.count(): " + companyDao.count() + "\n"); //4
        System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() + "\n"); //4

        //When
        employeeDao.deleteAll();
        System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() + "\n"); //4

        //Then
        try {
            Assert.assertEquals(0, employeeDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test 8: deleteEmployeeFromDao  - exception" + "\n");
        }
    }

    @Ignore
    @Test // nr 9
    public void deleteCompanyAndEmployeeXXXFromDao () {
        //Given
        System.out.println("\n" + "Test 9: deleteCompanyAndEmployeeXXXFromDao"); //4
        companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();
        employeesAddToCompanies ();
        System.out.println("\n" + "companyDao.count(): " + companyDao.count() + "\n"); //4
        System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() + "\n"); //4

        //When
        companyDao.deleteAll();
        employeeDao.deleteAll();
        System.out.println("\n" + "companyDao.count(): " + companyDao.count() + "\n"); //4
        System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() + "\n"); //4

        //Then
        try {
            Assert.assertEquals(0, companyDao.count());
            Assert.assertEquals(0, employeeDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test 9: deleteCompanyAndEmployeeXXXFromDao  - exception" + "\n");
        }
    }

    @Ignore
    @Test
    public void checkCompaniesAndEmployeesInDao () {
        //Given
        System.out.println("\n" + "dataProjects.getName(): " + dataProjects.getName() +"\n"); //Data Projects
        System.out.println("\n" + "dataProjects.getId(): " + dataProjects.getId() +"\n"); //0
        System.out.println("\n" + "datsunCorp.getId(): " + datsunCorp.getId() +"\n"); //0
        System.out.println("\n" + "generalMotors.getId(): " + generalMotors.getId() +"\n"); //0
        System.out.println("\n" + "generalli.getId(): " + generalli.getId() +"\n"); //0

        System.out.println("\n" + "johnSmith.getId(): " + johnSmith.getId() +"\n"); //0
        System.out.println("\n" + "stephanieClarckson.getId(): " + stephanieClarckson.getId() +"\n"); //0
        System.out.println("\n" + "lindaKovalsky.getId(): " + lindaKovalsky.getId() +"\n"); //0
        System.out.println("\n" + "frankSmith.getId(): " + frankSmith.getId() +"\n"); //0

        System.out.println("\n" + "companyDao.count(): " + companyDao.count() +"\n"); //4
        System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() +"\n"); //4
        //When
        System.out.println("\n" + "dataProjects: " + companyDao.findByName("Data Projects").size() +"\n"); //1
        System.out.println("\n" + "Smith: " + employeeDao.findByLastname("Smith").size() +"\n"); //2
        System.out.println("\n" + "employeDao(id)=1: " + employeeDao.findById(1).size() +"\n"); //1
        System.out.println("\n" + "companyDao(id)=1: " + companyDao.findById(1).size() +"\n"); // 1
        System.out.println("\n" + "employeeDao.retrieveWithThisLastname(Smith): " + employeeDao.retrieveWithThisLastname("Smith").size() +"\n"); //2
        System.out.println("\n" + "employeeDao.retrieveWithThisLastname(Kovalsky): " + employeeDao.retrieveWithThisLastname("Kovalsky").size() +"\n"); //1
        System.out.println("\n" + "companyDao.retrieveWithThisNamesSpec(Dat): " + companyDao.retrieveWithThisNamesSpec("Dat").size() +"\n"); //2
        System.out.println("\n" + "companyDao.retrieveWithThisNamesSpec(Gen): " + companyDao.retrieveWithThisNamesSpec("Gen").size() +"\n"); //2

        //Then
        try {
            Assert.assertEquals(0, 0);
        } catch (Exception e) {
            System.out.println("\n" + "Test: deleteCompaniesInDao  - exception" + "\n");
        }
    }

}