package com.kodilla.patterns.com.kodilla.patterns.singleton;

public class Logger {
    private static Logger logger = null;
    private String lastLog = "";

    public Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger ();
        }
        return logger;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "] //Logger log()");
    }

    public String getLastLog() {
        return lastLog;
    }

}