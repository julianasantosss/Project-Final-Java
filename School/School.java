package School;

import java.util.HashSet;
import java.util.Set;

public class School extends Student{

    private Set<Student> studentsList;

    public School() {
        studentsList = new HashSet<>();
    }

    public void addStudent(Student student){
        for (Student e : studentsList) {
            if (e.getId() == student.getId()) {
                System.out.printf("The student with an Id: %d already exists!\n", student.getId());
                return;
            }
        }
        studentsList.add(student);
        System.out.println("Student added successfully!");
    }

    public void searchStudent(int id){
        boolean found = false;
        for (Student e : studentsList){
            if (e.getId() == id) {
                System.out.println(e.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("That student does not exist!");
        }
    }

    public void updateStudent(int id, String newName, double newScore){
        for (Student e : studentsList){
            if (e.getId() == id) {
                e.setName(newName);
                e.setScore(newScore);
                System.out.println(e.toString());
            }else {
                System.out.println("We could not find the student");
            }
        }
    }

    public void removeStudent(int id){
        for (Student e : studentsList){
            if (e.getId() == id) {
                studentsList.remove(e);
                System.out.println("Student removed succesfully!");
            }else {
                System.out.println("We could not find the student to remove it!");
            }
        }
    }
}
