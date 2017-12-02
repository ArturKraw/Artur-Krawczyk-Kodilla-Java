package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("Test Suite: end");
    }

 }