package week3.business;

import week3.core.logging.Logger;
import week3.dataAccess.BaseDao;
import week3.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private BaseDao baseDao;
    List<Logger> loggers;

    public CategoryManager(BaseDao baseDao, List<Logger> loggers) {
        this.baseDao = baseDao;
        this.loggers = loggers;
    }

    public void add(Category newCategory) throws Exception {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Java Camp"));

        for (Category category2 : categoryList) {
            if (category2.getCategoryName().equals(newCategory.getCategoryName())) {
                throw new Exception("Category name cannot be repeated");
            }
        }
        baseDao.addCategory(newCategory);

        for (Logger logger : loggers) {
            logger.log(newCategory.getCategoryName());
        }
    }
}
