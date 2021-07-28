package View;

import Controller.TeacherManager;
import Model.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeacherManager managerTeacher = new TeacherManager();
        while (true) {
            System.out.println("Application Manager Teacher: ");
            System.out.println("Enter 1: To insert Teacher");
            System.out.println("Enter 2: To show information Teacher");
            System.out.println("Enter 3: To Exit: ");
            String type = scanner.nextLine();
            switch (type) {
                case "1": {
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter home town: ");
                    String homeTown = sc.nextLine();
                    System.out.println("Enter salary: ");
                    double salary = scanner.nextDouble();
                    System.out.println("Enter bonus: ");
                    double bonus = scanner.nextDouble();
                    System.out.println("Enter penaty: ");
                    double penaty = scanner.nextDouble();
                    System.out.println("Real Salary of Teacher: ");
                    double realSalary = salary + bonus - penaty;
                    Teacher teacher = new Teacher(name,age,homeTown,salary,bonus,penaty,realSalary);
                    managerTeacher.addInfoTeacher(teacher);
                    System.out.println(teacher.toString());
                    break;
                    }
                case "2": {
                    managerTeacher.showAll();
                    break;
                }
                case "3": {
                    return;
                }
                default:
                    System.out.println("Invalid - Nhập sai rồi: ");
                    continue;
            }
        }
    }
}
