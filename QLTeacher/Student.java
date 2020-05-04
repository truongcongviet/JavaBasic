/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    String maSV;
    double dtb;
    String email;
    Scanner sc = new Scanner(System.in);

    public Student() {
        super();
    }

    public Student(String maSV, float dtb, String email) {
        this.maSV = maSV;
        this.dtb = dtb;
        this.email = email;
    }

    public Student(String maSV, double dtb, String email, String name, String gioiTinh, int ngaySinh, String diaChi) {
        super(name, gioiTinh, ngaySinh, diaChi);
        this.maSV = maSV;
        this.dtb = dtb;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        do {
            System.out.println("Nhập mã SInh Viên");
            maSV = sc.nextLine();
        } while (maSV.length() < 0 || maSV.length() > 8);
        do {
            System.out.println("Nhập điểm trung bình: ");
            dtb = sc.nextFloat();
        } while (dtb < 0 || dtb > 10);
        do {
            System.out.println("Nhập Email: ");
            email = sc.nextLine();
            if(email.equals("")){
                email = sc.nextLine();
            }
        } while (email.contains("@") || email.contains(" "));
        
    }

    @Override
    public void showInfor() {
        super.showInfor();
        System.out.println("Mã SV: " + maSV);
        System.out.println("ĐTB: " + dtb);
        System.out.println("Email: " + email);
    }
    boolean hocBong = false;

    public boolean check(ArrayList<Student> student, int count) {
        if (student.get(count).getDtb() >= 8.0) {
            return true;
        }

        return false;
    }

}
