package week3.business;

import week3.core.logging.Logger;
import week3.dataAccess.BaseDao;
import week3.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private BaseDao baseDao;
    List<Logger> loggerList;

    public CourseManager(BaseDao baseDao, List<Logger> loggerList) {
        this.baseDao = baseDao;
        this.loggerList = loggerList;
    }

    public void add(Course newCourse) throws Exception {
        if (newCourse.getCoursePrice() < 0) {
            throw new Exception("The price of the course cannot be less than 0.");
        }

        List<Course> courseList = new ArrayList<>();
        for (Course course : courseList) {
            if (course.getCourseName().equals(newCourse.getCourseName())) {
                throw new Exception("Course name cannot be repeated");
            }
        }

        baseDao.addCourse(newCourse);
        for (Logger logger : loggerList) {
            logger.log(newCourse.getCourseName());
        }

    }
}
