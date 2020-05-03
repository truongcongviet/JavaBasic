package QLBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {

    public static Scanner sc = new Scanner(System.in);

    public static void Menu() {
        System.out.println("1. Nhập vào số lượng SV");
        System.out.println("2. Hiển Thị thong tin");
        System.out.println("3. Hiển Thị DTB Max và DTB Min");
        System.out.println("4 . TÌm Kiếm SV theo mã SV");
        System.out.println("5. Hiển THị dựa theo bảng chữ cái tên SV");
        System.out.println("6. Hiển THị Sinh Viên được HB và sắp xếp từ cao đến thấp");
        System.out.println("7. Thoát");
    }

    public static void main(String[] args) {
        Menu();

        ArrayList<Student> Array = new ArrayList<>();
        Person person = new Person();
        Student student2 = new Student();
        while (true) {
            System.out.println("Nhập vào vị trí cần chạy lệnh:");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println(" nhap so sinh vien can them");
                    int m = sc.nextInt();
                    for (int i = 0; i < m; i++) {
                        Student student1 = new Student();
                        student1.inputInfor();
                        Array.add(student1);
                    }
                    break;
                case 2:
                    System.out.println("Danh sach thong tin sinh vien");
                    for (int i = 0; i < Array.size(); i++) {
                        Array.get(i).showInfor();
                    }
                    break;
                case 3:
                    search(Array);
                    break;
                case 4: 
                    System.out.print("Thông tin SV cần nhập: ");
                    searchMSSV(Array);
                    break;
                case 5: 
                    System.out.print("Danh sách sinh viên được sắp xếp lại: ");
                    outPut(Array);

            }

        }

    }

    public static void search(ArrayList<Student> studentOne) {
        double temp = 0.0; // temporary(Tạm thời)
        double GPmax, GPmin;
        //tìm kiếm isnh viên ddierm cao nhát.
        for (int i = 0; i < studentOne.size(); i++) {
            if (studentOne.get(i).getDtb() > temp) {
                temp = studentOne.get(i).getDtb();
            }

        }
        GPmax = temp;
        for (int i = 0; i < studentOne.size(); i++) {
            if (studentOne.get(i).getDtb() == GPmax) {
                studentOne.get(i).showInfor();
            }
        }
        // tìm kiếm sinh viên có số điểm TB thấp nhất
        for (int i = 0; i < studentOne.size(); i++) {
            if (studentOne.get(i).getDtb() < temp) {
                temp = studentOne.get(i).getDtb();
            }
        }
        GPmin = temp;
        for (int i = 0; i < studentOne.size(); i++) {
            if (studentOne.get(i).getDtb() == temp) {
                studentOne.get(i).showInfor();
            }
        }
    }

    // tìm sinh viên dựa theo mã số sinh viên
    public static void searchMSSV(ArrayList<Student> studentTwo) {
        System.out.print("Nhập mã SV cần tìm:");
        String mssv = sc.nextLine();
        for (int i = 0; i < studentTwo.size(); i++) {
            if (studentTwo.get(i).getMaSV().equalsIgnoreCase(mssv)) {
                studentTwo.get(i).showInfor();
            }
        }
    }

    public static void outPut(ArrayList<Student> studentone) {
        Collections.sort(studentone, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().compareToIgnoreCase(o2.getName()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (int i = 0; i < studentone.size(); i++) {
            studentone.get(i).showInfor();
        }

    }
}
