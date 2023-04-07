import DataAccess.StudentDao;
import Entities.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("123456789", "Efe Denizer", "Köprülü", 1, 1);
        Student student2 = new Student("132465798", "Esma Nur", "Kılıç", 2, 1);
        Student student3 = new Student("987654321", "İbrahim", "Yıldırım", 3, 1);

        StudentDao studentManager = new StudentDao();

        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.list();

        System.out.println("------------------------------");

        studentManager.delete(student1);
        studentManager.list();

        System.out.println("------------------------------");

        studentManager.add(student3);
        studentManager.list();
    }
}