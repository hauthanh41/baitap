package baitap;

import java.util.Scanner;

class Student {

    public String name;
    public float Java_score, C_socre;

    Scanner dt = new Scanner(System.in);

    Student() {
        System.out.print("Nhap ten hoc sinh :");
        name = dt.nextLine();
        System.out.print("Nhap diem Java :");
        Java_score = dt.nextFloat();
        System.out.print("Nhap diem C :");
        C_socre = dt.nextFloat();
    }

    public void displayInfo() {
        System.out.println("Ho ten sinh vien :" + name);
        System.out.println("Diem Java cua hoc sinh :" + Java_score);
        System.out.println("Diem C cua hoc sinh :" + C_socre);
        System.out.println("Diem trung binh :" + (Java_score + C_socre) / 2);
    }
}

class baitap {
    public static void main(String[] args) {
        Student cn = new Student();
        Student cm = new Student();
        cn.displayInfo();
        cm.displayInfo();

    }
}
