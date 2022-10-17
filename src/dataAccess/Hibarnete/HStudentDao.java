package dataAccess.Hibarnete;

import dataAccess.StudentDao;
import entities.Student;

public class HStudentDao implements StudentDao {
    @Override
    public void add(Student student) {
        System.out.println("Hibarnete ile veritabanına eklendi ");
    }
}
