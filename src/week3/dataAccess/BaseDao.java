package week3.dataAccess;

import week3.entity.Category;
import week3.entity.Course;
import week3.entity.Instructor;

public interface BaseDao {
    void addCourse(Course course);

    void addInctructor(Instructor instructor);

    void addCategory(Category category);
}
