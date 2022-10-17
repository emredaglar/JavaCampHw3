package dataAccess.Jdbc;

import dataAccess.CourseDao;
import entities.Course;

public class JCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi ");
    }
}
