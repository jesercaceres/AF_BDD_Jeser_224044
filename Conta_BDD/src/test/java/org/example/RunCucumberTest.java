package org.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Classe que executa os testes do Cucumber com TestNG.
 */
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.example",
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json"}
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}