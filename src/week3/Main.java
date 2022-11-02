package week3;

import week3.business.CategoryManager;
import week3.business.CourseManager;
import week3.business.InstructorManager;
import week3.core.logging.DatabaseLogger;
import week3.core.logging.FileLogger;
import week3.core.logging.Logger;
import week3.core.logging.MailLogger;
import week3.dataAccess.HibernateDao;
import week3.dataAccess.JdbcDao;
import week3.entity.Category;
import week3.entity.Course;
import week3.entity.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Logger> loggerList = new ArrayList<>();
        loggerList.add(new DatabaseLogger());
        loggerList.add(new FileLogger());
        loggerList.add(new MailLogger());


        CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggerList);
        categoryManager.add(new Category(2, "Java Camp"));

        System.out.println("--------------------------------------------");
        Course course = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı", 1000);

        CourseManager courseManager = new CourseManager(new JdbcDao(), loggerList);
        courseManager.add(course);

        System.out.println("--------------------------------------------");

        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggerList);
        instructorManager.add(instructor);
    }
}
