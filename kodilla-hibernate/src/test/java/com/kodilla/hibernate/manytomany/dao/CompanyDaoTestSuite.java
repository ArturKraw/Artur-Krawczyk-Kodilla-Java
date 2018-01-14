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

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private Employee johnSmith;
    private Employee stephanieClarckson;
    private Employee lindaKovalsky;
    private Employee frankSmith;
    private Company softwareMachine;
    private Company  datsunCorp;
    private Company  generalMotors;
    private Company  generalli;

    public void readEmployees () {
        johnSmith = new Employee("John", "Smith");
        stephanieClarckson = new Employee("Stephanie", "Clarckson");
        lindaKovalsky = new Employee("Linda", "Kovalsky");
        frankSmith = new Employee("Frank", "Smith");
    }

    public void readCompanies () {
        softwareMachine = new Company("Data Projects");
        datsunCorp = new Company("Datsun Corp");
        generalMotors = new Company("General Motors");
        generalli = new Company("Generalli");
    }

    public void companiesGetEmployes () {
        softwareMachine.getEmployees().add(johnSmith);
        datsunCorp.getEmployees().add(stephanieClarckson);
        datsunCorp.getEmployees().add(lindaKovalsky);
        generalMotors.getEmployees().add(johnSmith);
        generalMotors.getEmployees().add(lindaKovalsky);
        generalli.getEmployees().add(stephanieClarckson);
        generalli.getEmployees().add(frankSmith);
        softwareMachine.getEmployees().add(frankSmith);
    }

    public void employeesGetcontractInCompanies () {
        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(generalMotors);
        stephanieClarckson.getCompanies().add(generalli);
        lindaKovalsky.getCompanies().add(datsunCorp);
        lindaKovalsky.getCompanies().add(generalMotors);
        stephanieClarckson.getCompanies().add(datsunCorp);
        frankSmith.getCompanies().add(softwareMachine);
        frankSmith.getCompanies().add(generalli);
    }


        @Before
        public void before() {
            System.out.println("\n" + "Test Case: begin" + "\n");
            employeeDao.deleteAll();
            companyDao.deleteAll();
        }

    @Ignore
    @Test
    public void testSaveManyToMany () {
        //Given
        readEmployees();
        readCompanies();
        companiesGetEmployes();
        employeesGetcontractInCompanies();

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(datsunCorp);
        int datsunCorpId = datsunCorp.getId();
        companyDao.save(generalMotors);
        int generalMotorsId = generalMotors.getId();
        companyDao.save(generalli);
        int generalliId = generalli.getId();

        try {
            Assert.assertNotEquals(0, softwareMachineId);
            Assert.assertNotEquals(0, datsunCorpId);
            Assert.assertNotEquals(0, generalMotorsId);
            Assert.assertNotEquals(0, generalliId);
        } catch (Exception e) {
            //do nothing
        /*
        } finally {
            companyDao.delete(generalliId);
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(generalMotorsId);
            */
        }
    }
    @Ignore
    @Test
    public void testFindEmployees () {
        //Given
        readEmployees();
        readCompanies();
        companiesGetEmployes();
        employeesGetcontractInCompanies();

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(datsunCorp);
        int datsunCorpId = datsunCorp.getId();
        companyDao.save(generalMotors);
        int greyMatterId = generalMotors.getId();
        companyDao.save(generalli);
        int generalliId = generalli.getId();

        List<Employee> employeesWithThisFirstname1 = employeeDao.employeesWithThisFirstname("Smith");
        List<Employee> employeesWithThisFirstname2 = employeeDao.employeesWithThisFirstname("Kovalsky");
        //Then
        Assert.assertEquals(2 , employeesWithThisFirstname1.size());
        Assert.assertEquals(2 , employeesWithThisFirstname2.size());
    }


    @Test
    public void testFindCompanies () {
        //Given
        readEmployees();
        readCompanies();
        companiesGetEmployes();
        employeesGetcontractInCompanies();

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(datsunCorp);
        int datsunCorpId = datsunCorp.getId();
        companyDao.save(generalMotors);
        int greyMatterId = generalMotors.getId();
        companyDao.save(generalli);
        int generalliId = generalli.getId();

        List<Company> companiesWithNamesSpec1 = companyDao.companiesWithThisNamesSpec("Dat");
        List<Company> companiesWithNamesSpec2 = companyDao.companiesWithThisNamesSpec("Gen");

        //Then
        Assert.assertEquals(2 , companiesWithNamesSpec1.size());
        Assert.assertEquals(2 , companiesWithNamesSpec2.size());

    }
}
