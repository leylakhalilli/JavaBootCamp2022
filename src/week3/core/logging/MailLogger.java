package week3.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("logged to mail: " + data);

    }
}
