package week3.business;

import week3.core.logging.Logger;
import week3.dataAccess.BaseDao;
import week3.entity.Instructor;

import java.util.List;

public class InstructorManager {
    private BaseDao baseDao;
    List<Logger> loggerList;

    public InstructorManager(BaseDao baseDao, List<Logger> loggerList) {
        this.baseDao = baseDao;
        this.loggerList = loggerList;
    }

    public void add(Instructor newInstructor) {

        baseDao.addInctructor(newInstructor);
        for (Logger logger : loggerList) {
            logger.log(newInstructor.getFirstName() + " " + newInstructor.getLastName());
        }
    }
}
