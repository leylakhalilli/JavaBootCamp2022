package Homework3.overriding;

public class Main {
    public static void main(String[] args) {
//        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
//        teacherCreditManager.calculate(1000);

        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]{new TeacherCreditManager(),
                new AgricultureCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager creditManager : baseCreditManagers) {
            System.out.println(creditManager.calculate(1000));
        }
    }

}
