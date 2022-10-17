package dataAccess.Hibarnete;

import dataAccess.CategoryDao;
import entities.Category;

public class HCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibarnete ile veritabanına eklendi ");
    }
}
