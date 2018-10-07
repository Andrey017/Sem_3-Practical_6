package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student: ");
        int n = in.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++){
            students[i] = new Student(0, " ", " ");
            System.out.println("Enter id student: ");
            students[i].setId(in.nextInt());
            System.out.println("Enter surname student: ");
            students[i].setSurname(in.next());
            System.out.println("Enter name student: ");
            students[i].setName(in.next());
        }

        Student.quick_Sort(n-1, students);

        for (int i = 0; i < n; i++){
            students[i].show();
        }
    }

}
