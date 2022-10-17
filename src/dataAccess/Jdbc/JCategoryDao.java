package dataAccess.Jdbc;

import dataAccess.CategoryDao;
import entities.Category;

public class JCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi ");
    }
}
