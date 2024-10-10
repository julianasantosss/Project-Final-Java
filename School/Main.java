package School;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        School schoolObj = new School();
        Student student;

        System.out.println(" ------- List of Students -------");
        int menu;
        String productName;
        do {
            System.out.println("------ 1. Add a student. -------------");
            System.out.println("------ 2. Look for a student. --------");
            System.out.println("------ 3. Update a student. ----------");
            System.out.println("------ 4. Remove a student. ----------");
            System.out.println("------ 5. Exit. ----------------------");
            System.out.print("Select a valid option: ");
            menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu){
                case 1:
                    System.out.print("Enter the id of the student: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the name of the student: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the score of the student: ");
                    double score = scanner.nextDouble();
                    while(score < 0 || score > 10){
                        System.out.println("Score goes from 1 to 10!");
                        System.out.print("Enter the score of the student: ");
                        score = scanner.nextDouble();
                    }
                    student = new Student(id, name, score);
                    schoolObj.addStudent(student);
                    break;
                case 2:
                    System.out.print("Enter the id of the student: ");
                    id = scanner.nextInt();
                    schoolObj.searchStudent(id);
                    break;
                case 3:
                    System.out.print("Enter id of the student: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the new name of the student: ");
                    name = scanner.nextLine();
                    System.out.print("Enter the new score of the student: ");
                    score = scanner.nextDouble();
                    while(score < 0 || score > 10){
                        System.out.println("Score goes from 1 to 10!");
                        System.out.print("Enter the new score of the student: ");
                        score = scanner.nextDouble();
                    }
                    schoolObj.updateStudent(id, name, score);
                    break;
                case 4:
                    System.out.print("Enter id of the student: ");
                    id = scanner.nextInt();
                    schoolObj.removeStudent(id);
                    break;
                case 5:
                    System.out.println("Thanks for visiting our List of Students, bye!");
                    break;
                default:
                    System.out.println("That's not an option!");
            }
        }while (5 != menu);
    }
}