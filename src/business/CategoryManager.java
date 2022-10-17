package business;

import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;
import core.logging.Logger;


public class CategoryManager {
    CategoryDao categoryDao;
    Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    List<String> categoryNames=new ArrayList<String>();

    public void Add(Category category) throws Exception{
        for (String categoryName:categoryNames){
            if (categoryName==category.getName()){
                throw new Exception("Bu isimde bir kategori mevcut");
            }

        }
        categoryNames.add(category.getName());
        categoryDao.add(category);

        for (Logger logger : loggers) {

            logger.log(category.getName()+"kategorisi");
        }
    }


}
