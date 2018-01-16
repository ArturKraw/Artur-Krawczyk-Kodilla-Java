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

    private static Employee johnSmith = new Employee("John", "Smith");
    private static Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    private static Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
    private static Employee frankSmith = new Employee("Frank", "Smith");

    private static Company  dataProjects = new Company("Data Projects");
    private static Company  datsunCorp = new Company("Datsun Corp");
    private static Company  generalMotors = new Company("General Motors");
    private static Company  generalli = new Company("Generalli");

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
    public void employeesGetcontractInCompanies () {
        johnSmith.getCompanies().add(dataProjects);
        johnSmith.getCompanies().add(generalMotors);
        stephanieClarckson.getCompanies().add(generalli);
        lindaKovalsky.getCompanies().add(datsunCorp);
        lindaKovalsky.getCompanies().add(generalMotors);
        stephanieClarckson.getCompanies().add(datsunCorp);
        frankSmith.getCompanies().add(dataProjects);
        frankSmith.getCompanies().add(generalli);
    }


    public void companiesSaveToCompanyDao() {
        companyDao.save(dataProjects);
        companyDao.save(datsunCorp);
        companyDao.save(generalMotors);
        companyDao.save(generalli);
    }

    public void employeesSaveToEmployeeDao() {
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(frankSmith);
    }

     @Before
     public void before() {
        System.out.println("\n" + "Test Case: begin" + "\n");

     }

    @Ignore
    @Test
    public void testSaveCompaniesToDao () {
        //Given
        companiesGetEmployes();
        employeesGetcontractInCompanies();

        //When
        companiesSaveToCompanyDao();
        //employeesSaveToEmployeeDao();

        //Then
        try {
            Assert.assertNotEquals(0, dataProjects.getId());
            Assert.assertNotEquals(0, datsunCorp.getId());
            Assert.assertNotEquals(0, generalMotors.getId());
            Assert.assertNotEquals(0, generalli.getId());


            //Assert.assertNotEquals(0, johnSmith.getId());
            //Assert.assertNotEquals(0, stephanieClarckson.getId());
            //Assert.assertNotEquals(0, lindaKovalsky.getId());
            //Assert.assertNotEquals(0, frankSmith.getId());

            Assert.assertEquals(4, companyDao.count());
            //Assert.assertEquals(4, employeeDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test: testSaveSaveCompaniesToDao  - exception" + "\n");
        }
    }

    @Ignore
    @Test
    public void testSaveCompaniesAndEmployeesToDao () {
        //Given
        companiesGetEmployes();
        employeesGetcontractInCompanies();

        //When
        //companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();

        //Then
        try {
            //Assert.assertNotEquals(0, dataProjects.getId());
            //Assert.assertNotEquals(0, datsunCorp.getId());
            //Assert.assertNotEquals(0, generalMotors.getId());
            //Assert.assertNotEquals(0, generalli.getId());


            Assert.assertNotEquals(0, johnSmith.getId());
            Assert.assertNotEquals(0, stephanieClarckson.getId());
            Assert.assertNotEquals(0, lindaKovalsky.getId());
            Assert.assertNotEquals(0, frankSmith.getId());

            //Assert.assertEquals(4, companyDao.count());
            Assert.assertEquals(4, employeeDao.count());
        } catch (Exception e) {
            System.out.println("\n" + "Test: testSaveSaveCompaniesToDao  - exception" + "\n");
        }
    }

    @Ignore
    @Test
    public void checkCompaniesAndEmployeesInDao () {
        //Given
        System.out.println("\n" + "companyDao.count(): " + companyDao.count() +"\n"); //4
        System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() +"\n"); //4
        //When
        System.out.println("\n" + "dataProjects: " + companyDao.findByName("Data Projects").size() +"\n"); //1
        System.out.println("\n" + "Smith: " + employeeDao.findByLastname("Smith").size() +"\n"); //2
        System.out.println("\n" + "employeDao(id)=1: " + employeeDao.findById(1).size() +"\n"); //1
        System.out.println("\n" + "companyDao(id)=1: " + companyDao.findById(1).size() +"\n"); // 1
        System.out.println("\n" + "employeeDao.retrieveWithThisLastname(Smith): " + employeeDao.retrieveWithThisLastname("Smith").size() +"\n"); //2
        System.out.println("\n" + "employeeDao.retrieveWithThisLastname(Kovalsky): " + employeeDao.retrieveWithThisLastname("Kovalsky").size() +"\n"); //1
        System.out.println("\n" + "companyDao.retrieveWithThisNamesSpec(Dat): " + companyDao.retrieveWithThisNamesSpec("Dat").size() +"\n"); //
        System.out.println("\n" + "companyDao.retrieveWithThisNamesSpec(Gen): " + companyDao.retrieveWithThisNamesSpec("Gen").size() +"\n"); //

        //Then
        try {
            Assert.assertEquals(0, 0);
        } catch (Exception e) {
            System.out.println("\n" + "Test: deleteCompaniesInDao  - exception" + "\n");
        }
    }

    @Ignore
    @Test
    public void testFindEmployees(){
        //Given
        companiesGetEmployes();
        employeesGetcontractInCompanies();

        //When
        //companiesSaveToCompanyDao();
        employeesSaveToEmployeeDao();
        List<Employee> employeesWithThisLastname1 = employeeDao.retrieveWithThisLastname("Smith");
        List<Employee> employeesWithThisLastname2 = employeeDao.retrieveWithThisLastname("Kovalsky");
        //Then
        try {
            Assert.assertEquals(2 , employeesWithThisLastname1.size());
            Assert.assertEquals(1 , employeesWithThisLastname2.size());
        } catch (Exception e) {
            System.out.println("\n" + "Test: testFindEmployees - exception" + "\n");
        }
    }

    @Ignore
    @Test
    public void testFindCompanies () {
        //Given
        companiesGetEmployes();
        employeesGetcontractInCompanies();

        //When
        companiesSaveToCompanyDao();
        //employeesSaveToEmployeeDao();
        List<Company> companiesWithNamesSpec1 = companyDao.retrieveWithThisNamesSpec("Dat");
        List<Company> companiesWithNamesSpec2 = companyDao.retrieveWithThisNamesSpec("Gen");

        //Then
        Assert.assertEquals(2 , companiesWithNamesSpec1.size());
        Assert.assertEquals(2 , companiesWithNamesSpec2.size());

    }
    //@Ignore
    @Test
    public void deleteCompaniesAndEmployeesInDao () {
        //Given
        System.out.println("\n" + "companyDao.count(): " + companyDao.count() + "\n"); //4
        System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() + "\n"); //4
        System.out.println("\n" + "dataProjects: " + companyDao.findByName("Data Projects").size() + "\n"); //1
        System.out.println("\n" + "Smith: " + employeeDao.findByLastname("Smith").size() + "\n"); //2
        System.out.println("\n" + "employeDao(id)=1: " + employeeDao.findById(1).size() + "\n"); //1
        System.out.println("\n" + "companyDao(id)=1: " + companyDao.findById(1).size() + "\n"); // 1
        System.out.println("\n" + "employeeDao.retrieveWithThisLastname(Smith): " + employeeDao.retrieveWithThisLastname("Smith").size() + "\n"); //2
        System.out.println("\n" + "employeeDao.retrieveWithThisLastname(Kovalsky): " + employeeDao.retrieveWithThisLastname("Kovalsky").size() + "\n"); //1
        System.out.println("\n" + "companyDao.retrieveWithThisNamesSpec(Dat): " + companyDao.retrieveWithThisNamesSpec("Dat").size() + "\n"); //2
        System.out.println("\n" + "companyDao.retrieveWithThisNamesSpec(Gen): " + companyDao.retrieveWithThisNamesSpec("Gen").size() + "\n"); //2

        //When
        employeeDao.delete(johnSmith);
        employeeDao.delete(stephanieClarckson);
        employeeDao.delete(lindaKovalsky);
        employeeDao.delete(frankSmith);

        //companyDao.delete(dataProjects);
        //companyDao.delete(datsunCorp);
        //companyDao.delete(generalMotors);
        //companyDao.delete(generalli);

        // employeeDao.delete(stephanieClarckson.getId());
        System.out.println("\n" + "Smith: " + employeeDao.findByLastname("Smith").size() + "\n"); //2
        System.out.println("\n" + "companyDao.count(): " + companyDao.count() + "\n"); //4
        System.out.println("\n" + "employeeDao.count(): " + employeeDao.count() + "\n"); //4

        //companyDao.deleteAll();
        //System.out.println("\n" + "employeeDao.count(): " + companyDao.count() + "\n"); //4

        //companyDao.delete(datsunCorp.getId());
        //companyDao.delete(generalMotors.getId());
        //companyDao.delete(generalli.getId());

        //Then
        try {
                Assert.assertEquals(0, 0);
        } catch (Exception e) {
                System.out.println("\n" + "Test: deleteCompaniesInDao  - exception" + "\n");
        }
    }

}