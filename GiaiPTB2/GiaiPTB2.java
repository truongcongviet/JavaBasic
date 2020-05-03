package PTB2;

import java.util.Scanner;

public class GiaiPTB2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Nhập a: ");
            float a = sc.nextFloat();
            System.out.print("Nhập b: ");
            float b = sc.nextFloat();
            System.out.print("Nhập c: ");
            float c = sc.nextFloat();
            phuongtrinh(a, b, c);
            System.out.println("Bạn có muốn chơi nũa không: c/k");
            String choose = sc.nextLine();
            if(choose.equalsIgnoreCase("")){
                choose = sc.nextLine();
            }
            if (choose.equalsIgnoreCase("k")) {
                break;
            }
            
        }
        System.out.println("Xin chào");
    }

    public static void phuongtrinh(float a, float b, float c) {
        float delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vô nghiệm");
            } else {
                System.out.println("Phương trình có 1 nghiệm: " + -c / b);
            }
            return;
        }
        float x1, x2;
        if (delta < 0) {
            System.out.println("PT vô nghiệm");
        } else if (delta == 0) {
            System.out.println("PT có 2 nghiệm x1=x2= " + -b / 2 * a);
        } else {
            x1 = (float) ((-b + Math.sqrt(delta)) / 2 * a);
            x2 = (float) ((-b - Math.sqrt(delta)) / 2 * a);
            System.out.println("PT có 2 nghiệm phân biệt: ");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);

        }

    }

}
