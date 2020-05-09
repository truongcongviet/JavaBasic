package QLSV;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerSinhVien {

    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> danhsachsv = new ArrayList<>();

    public void addSinhVien(SinhVien sinhvien) {
        System.out.print("Nhập tên: ");
        sinhvien.ten = sc.nextLine();
        if (sinhvien.ten.equals("")) {
            sinhvien.ten = sc.nextLine();
        }
        System.out.print("Nhập tuổi: ");
        sinhvien.tuoi = sc.nextInt();
        System.out.print("Nhập Giới tính: ");
        sinhvien.gioiTinh = sc.nextLine();
        if (sinhvien.gioiTinh.equals("")) {
            sinhvien.gioiTinh = sc.nextLine();
        }
        System.out.print("Nhập lớp: ");
        sinhvien.lop = sc.nextLine();
        System.out.print("Nhập giáo viên: ");
        sinhvien.giaoVien = sc.nextLine();
        System.out.print("Nhập Điểm 3 môn: ");
        sinhvien.toan = sc.nextFloat();
        sinhvien.ly = sc.nextFloat();
        sinhvien.hoa = sc.nextFloat();

        danhsachsv.add(sinhvien);
    }

    public void displaySV() {
        if (danhsachsv.isEmpty()) {
            System.out.println("Danh sách SV rỗng: ");
        } else {
            for (SinhVien sv : danhsachsv) {
                sv.displaySinhVien();
            }
        }
    }

    public void searchSV() {
        System.out.println("Nhập tên SV cần tìm: ");
        String ten = sc.nextLine();
        for (int i = 0; i < danhsachsv.size(); i++) {
            if (danhsachsv.get(i).ten.contains(ten)) {
                danhsachsv.get(i).displaySinhVien();
            }
        }
    }

    public void removeSV() {
        System.out.println("Nhập tên SV cần xóa: ");
        String ten = sc.nextLine();
        if(ten.equals("")){
            ten = sc.nextLine();
        }
        for (int i = 0; i < danhsachsv.size(); i++) {
            if (danhsachsv.get(i).ten.contains(ten)) {
                danhsachsv.remove(i);
            }
        }
        for (SinhVien sv : danhsachsv) {
            sv.displaySinhVien();
        }
    }

    public void editSV() {
        if (danhsachsv.isEmpty()) {
            System.out.println("Nhập SV vào: ");
        } else {
            System.out.println("Chọn vị trí SV cần chỉnh sửa: ");
            int number = sc.nextInt();
            danhsachsv.get(number).displaySinhVien();
           
                System.out.println("vị trí cần chỉnh sửa: \n 1: tên\n 2: tuổi\n 3: giới tính\n 4: lớp\n 5: giáo viên");
                int number1 = sc.nextInt();
                switch (number1) {
                    case 1:
                        System.out.println("Nhập giá trị cần chỉnh: ");
                        String ten1 = sc.nextLine();
                        if(ten1.equals("")){
                            ten1 =sc.nextLine();
                        }
                        danhsachsv.get(number).ten=ten1;
                        break;
                    case 2:
                        System.out.println("Nhập giá trị cần chỉnh: ");
                        String giotinh1 = sc.nextLine();
                        if(giotinh1.equals("")){
                            giotinh1 =sc.nextLine();
                        }
                        danhsachsv.get(number).gioiTinh = giotinh1;
                        break;
                    case 3:
                        System.out.println("Nhập giá trị cần chỉnh: ");
                        String class1 = sc.nextLine();
                        if(class1.equals("")){
                           class1 =sc.nextLine();
                        }
                        danhsachsv.get(number).lop =class1;
                        break;
                    case 4:
                        System.out.println("Nhập giá trị cần chỉnh: ");
                        String giaoVien1 = sc.nextLine();
                        if(giaoVien1.equals("")){
                            giaoVien1 =sc.nextLine();
                        }
                        danhsachsv.get(number).giaoVien = giaoVien1;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }

            }
        }
    }

