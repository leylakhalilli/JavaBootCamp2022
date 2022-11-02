package week3.dataAccess;

import week3.entity.Category;
import week3.entity.Course;
import week3.entity.Instructor;

public class HibernateDao implements BaseDao{
    @Override
    public void addCourse(Course course) {
        System.out.println("Course added with Hibernate: " + course.getCourseName());

    }

    @Override
    public void addInctructor(Instructor instructor) {

        System.out.println("Instructor added with Hibernate: " + instructor.getFirstName() + " " + instructor.getLastName());

    }

    @Override
    public void addCategory(Category category) {
        System.out.println("Category added with Hibernate: " + category.getCategoryName());

    }
}
