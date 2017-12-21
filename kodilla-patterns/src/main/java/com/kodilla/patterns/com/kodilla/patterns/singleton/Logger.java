package com.kodilla.patterns.com.kodilla.patterns.singleton;

public class Logger {

    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "] //method log()");
    }

    public String getLastLog() {
        return lastLog;
    }

}
