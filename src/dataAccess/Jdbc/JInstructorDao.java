package dataAccess.Jdbc;

import dataAccess.InstructorDao;
import entities.Instructor;

public class JInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi ");
    }
}
