
package QLSV;

import java.util.Scanner;


public class TestSinhVien {
    public static void menu(){
        System.out.println("1. thêm sv");
        System.out.println("2. Show SV");
        System.out.println("3. tìm kiếm sv");
        System.out.println("4. Xóa sv");
    }
    public static void main(String[] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        int number;
        ManagerSinhVien msv = new ManagerSinhVien();
        while(true){
            System.out.println("Nhập vị trí muốn làm : ");
            number = sc.nextInt();
            switch(number){
                case 1: 
                    msv.addSinhVien(new SinhVien());
                    break;
                case 2: 
                    msv.displaySV();
                    break;
                case 3: 
                    msv.searchSV();
                    break;
                case 4: 
                    msv.editSV();
                    break;
                case 5: 
                    msv.removeSV();
            }
        }
    }
}
