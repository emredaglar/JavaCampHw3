package dataAccess.Hibarnete;

import dataAccess.CourseDao;
import entities.Category;
import entities.Course;

public class HCourseDao implements CourseDao {


    @Override
    public void add(Course course) {
        System.out.println("Hibarnete ile veritabanına eklendi ");
    }
}
