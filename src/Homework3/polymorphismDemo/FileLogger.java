package Homework3.polymorphismDemo;

public class FileLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("logger to file-"+message);
    }
}
