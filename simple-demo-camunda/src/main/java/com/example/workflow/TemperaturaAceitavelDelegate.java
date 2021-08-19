package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class TemperaturaAceitavelDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Activity Name: " + execution.getCurrentActivityName());
        System.out.println("Temperatura atual: " + execution.getVariable( "temp"));
    }
}
