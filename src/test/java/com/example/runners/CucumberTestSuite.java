package com.example.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import java.util.logging.Logger;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = "com.example.stepdefinitions",
        tags ="@Carritodecompras"
)
public class CucumberTestSuite {

    @BeforeClass
    public static void beforeAll(){
        Logger.getLogger(CucumberTestSuite.class.getName()).info("Before all execution >>>");
    }

//    @AfterClass
//    public static void afterAll(){
//        Logger.getLogger(CucumberTestSuite.class.getName()).info("After all execution >>>");
//        JiraXrayOperation.importCucumberResult("/target/build/cucumber.json");
//    }
}
