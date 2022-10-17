package dataAccess.Hibarnete;

import dataAccess.InstructorDao;
import entities.Instructor;

public class HInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibarnete ile veritabanına eklendi ");
    }
}
