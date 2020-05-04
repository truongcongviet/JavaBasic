package QLBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person {

    String apteachTeacher;
    float Salary;
    int hours;
    float realSalary;

    public String getApteachTeacher() {
        return apteachTeacher;
    }

    public void setApteachTeacher(String apteachTeacher) {
        this.apteachTeacher = apteachTeacher;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        System.out.print("Nhập tên lớp day: ");
        apteachTeacher = sc.nextLine();
        System.out.print("Nhập lương: ");
        Salary = sc.nextFloat();
        System.out.print("Nhập số giờ dạy/tháng: ");
        hours = sc.nextInt();

    }

    public String toString() {
        return "Thông Tin GV: tên lớp " + apteachTeacher + ", lương: " + Salary + ", giờ làm: " + hours;
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }

    public float RealSalary(ArrayList<Teacher> teacher, int count) {

        String s = teacher.get(count).getApteachTeacher();
        if (s.contains("H") || s.contains("K") || s.contains("L") || s.contains("I")) {
            realSalary = Salary * hours;
            return realSalary;
        }
        if (s.contains("M") || s.contains("V")) {
            realSalary = Salary * hours + 200000;
            return realSalary;
        }
        return 0;

    }

}

