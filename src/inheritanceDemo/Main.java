package inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        TeacherKrediManager teacherKrediManager = new TeacherKrediManager();
//        teacherKrediManager.hesabla();
        KrediUI krediUI=new KrediUI();
        krediUI.krediHesabla(new TeacherKrediManager());
    }
}
