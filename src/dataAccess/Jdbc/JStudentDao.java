package dataAccess.Jdbc;

import dataAccess.StudentDao;
import entities.Student;

public class JStudentDao implements StudentDao  {

    @Override
    public void add(Student student) {
        System.out.println("JDBC ile veritabanına eklendi ");
    }
}
