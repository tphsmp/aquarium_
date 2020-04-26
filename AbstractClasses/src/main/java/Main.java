import epam.task.AbstractStudent;
import epam.task.AbstractStudentGroup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AbstractStudentGroup g1 = new AbstractStudentGroup(){};

        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте количество студентов в группе");
        int groupValue = scan.nextInt();

        while (groupValue > 0) {

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Введите ФИО студента");
            String newStudent = scan2.nextLine();

            Scanner scan3 = new Scanner(System.in);
            System.out.println("Введите возраст студента");
            int newStudentAge = scan3.nextInt();

            Scanner scan4 = new Scanner(System.in);
            System.out.println("Введите пол студента");
            String newStudentMale = scan4.nextLine();

            AbstractStudent stud = new AbstractStudent(newStudent, newStudentAge, newStudentMale) {};

            g1.addStudent(stud);

            groupValue--;

        }

        g1.printAllStudents();









    }
}


//AbstractStudent s1 = new AbstractStudent("Ivanov", 19, "male"){};

