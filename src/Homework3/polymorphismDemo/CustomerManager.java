package Homework3.polymorphismDemo;

public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add() {
        System.out.println("added");
        this.baseLogger.log("log message-");

    }
}
