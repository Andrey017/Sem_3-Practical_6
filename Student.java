package ru.mirea;

public class Student {
    public int id;
    public String surname;
    public String name;

    public Student(){
        this.id = 0;
        this.surname = "surname";
        this.name = "name";
    }

    public Student(int id, String surname, String name){
        this.id = id;
        this.surname = surname;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("id: " + getId());
        System.out.println("Surname: " + getSurname());
        System.out.println("Name: " + getName());
    }

    public static void quick_Sort(int n, Student[] students){
        int start_Index = 0;
        int end_Index = n;
        do_Sort(start_Index, end_Index, students);
    }

    private static void do_Sort(int start, int end, Student[] students) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j){
            while (i < cur && (students[i].id <= students[cur].id)){
                i++;
            }
            while (j > cur && (students[cur].id <= students[j].id)){
                j--;
            }
            if (i < j){
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                if (i == cur){
                    cur = j;
                }else if (j == cur){
                    cur = i;
                }
            }
            do_Sort(start, cur, students);
            do_Sort(cur+1, end, students);
        }
    }
}
