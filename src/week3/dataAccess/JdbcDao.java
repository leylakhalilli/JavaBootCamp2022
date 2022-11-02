package week3.dataAccess;

import week3.entity.Category;
import week3.entity.Course;
import week3.entity.Instructor;

public class JdbcDao implements BaseDao{
    @Override
    public void addCourse(Course course) {
        System.out.println("Course added with JDBC: " + course.getCourseName());
    }

    @Override
    public void addInctructor(Instructor instructor) {
        System.out.println("Instructor added with JDBC: " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("Category added with JDBC: " + category.getCategoryName());
    }
}
