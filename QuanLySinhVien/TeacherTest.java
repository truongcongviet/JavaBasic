package QLBook;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherTest {

    public static void main(String[] args) {
        Teacher teacherOne = new Teacher();
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teacher = new ArrayList<>();
        int number;
        while (true) {
            System.out.println("Chọn số cần nhập: ");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Nhập số giảng viên: ");
                    int gv = sc.nextInt();
                    for (int i = 0; i < gv; i++) {
                        teacherOne.inputInfor();
                        teacher.add(teacherOne);
                        teacherOne.RealSalary(teacher, i);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách GV: ");
                    for (int i = 0; i < teacher.size(); i++) {
                        teacher.get(i).showInfor();
                    }
                    break;
                case 3:
                    System.out.println("Giảng viên có lương cao nhất: ");
                    float temp = 0;
                    for (int i = 0; i < teacher.size(); i++) {
                        if (teacher.get(i).getSalary() < temp) {
                            temp = teacher.get(i).getSalary();
                        }
                    }
                    for (Teacher teacher2 : teacher) {
                        if (teacher2.getSalary() == temp) {
                            teacher2.showInfor();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.err.println(" vui long nhap lai");
            }
        }
    }
}
