package QLBook;

import java.util.Scanner;

public class Person {

    String name;
    String gioiTinh;
    int ngaySinh;
    String diaChi;

    Scanner sc = new Scanner(System.in);

    public Person() {
    }

    public Person(String name, String gioiTinh, int ngaySinh, String diaChi) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputInfor() {
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextInt();
        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
        if(gioiTinh.equals("")){
            gioiTinh = sc.nextLine();
        }
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    public String toString() {
        return "Thongtin:name=" + name + ", birth= " + ngaySinh + ", gender= " + gioiTinh + ", address= " + diaChi + ",";
    }

    public void showInfor() {
        System.out.println(toString());
    }

}
