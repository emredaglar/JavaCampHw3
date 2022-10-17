import business.StudentManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLoger;
import dataAccess.Jdbc.JStudentDao;
import entities.Student;
import dataAccess.Hibarnete.HCategoryDao;

public class Main {
    public static void main(String[] args) throws Exception{

        Logger[] loggers={new DatabaseLogger(),new MailLoger(),new FileLogger()};

        Student student1=new Student();
        student1.setId(1);
        student1.setName("Emre Dağlar");

        StudentManager studentManager1=new StudentManager(new JStudentDao(),loggers);
        studentManager1.add(student1);


    }
}
