package DataAccess;
import Entities.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private List<Student> students = new ArrayList<Student>();

    public void list() {
        for(Student student : students){
            System.out.println("Öğrenci TC: " + student.getNationalityId() +
                    "Öğrenci Adı: " + student.getFirstName() +
                    "Öğrenci Soyadı: " + student.getLastName() +
                    "Öğrencinin Grubu: " + student.getGroup());
        }
    }

    public void add(Student student){
        if(checkStudent(student.getNationalityId(),student.getStudentNo())){
            students.add(student);
        }else{
            System.out.println("Öğrenci zaten mevcut!");
        }
    }

    public void delete(Student student){
        students.remove(student);
    }

    public boolean checkStudent(String id, int studentNo){
        for (Student student1 : students){
            if (student1.getNationalityId() == id && student1.getStudentNo() == studentNo){
                return false;
            }
        }
        return true;
    }
}

