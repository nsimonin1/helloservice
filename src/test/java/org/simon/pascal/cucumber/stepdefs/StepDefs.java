package org.simon.pascal.cucumber.stepdefs;

import org.simon.pascal.HelloserviceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HelloserviceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
