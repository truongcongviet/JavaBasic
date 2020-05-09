
package QLSV;

import java.awt.BorderLayout;

public class SinhVien {
    
    String ten;
    int tuoi;
    String gioiTinh;
    String lop;
    String giaoVien;
    float toan;
    float ly;
    float hoa;
    public void displaySinhVien(){
        
                System.out.println("Tên SV: "+ten);
                System.out.println("Tuổi SV: "+ tuoi);
                System.out.println("Giới TÍnh: "+ gioiTinh);
                System.out.println("Lớp SV: "+ lop);
                System.out.println("Giáo Viên: "+ giaoVien);
                System.out.println("ĐIểm môn học: "+"/nToan: "+toan+"/n Lý: "+ ly+"/n hóa: "+hoa);
    }
}
