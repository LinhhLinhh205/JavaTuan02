/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiLab_02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Program {

    public static void main(String[] args) {
        ArrayList<Student> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("QUAN LY SINH VIEN");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.print("Ban chon chuc nang: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sinh vien:");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < quantity; i++) {
                        System.out.print("Nhap ho ten sinh vien: ");
                        String hoTen = sc.nextLine();
                        System.out.print("Nhap lop hoc sinh vien (1. IT/2. Biz)");
                        int lop = sc.nextInt();
                        sc.nextLine();                        
                        if (lop == 1) {
                            System.out.print("Nhap diem Java: ");
                            double java = sc.nextDouble();
                            System.out.print("Nhap diem Html: ");
                            double html = sc.nextDouble();
                            System.out.print("Nhap diem Css: ");
                            double css = sc.nextDouble();  
                            sc.nextLine();
                            StudentIT it = new StudentIT(java, css, html, hoTen);
                            ds.add(it);
                        } else {
                            System.out.print("Nhap diem Marketing: ");
                            double marketing = sc.nextDouble();
                            System.out.print("Nhap diem Sales: ");
                            double sales = sc.nextDouble();
                            StudentBiz biz = new StudentBiz(marketing, sales, hoTen);
                            ds.add(biz);

                        }
                    }
                    break;

                case 2:
                    for (Student sv : ds) {
                        sv.hienThiThongTin();
                    }
                    break;
                case 3:
                    for (Student sv : ds) {
                        if (sv.getHocLuc().equals("Gioi")) {
                            sv.hienThiThongTin();
                        }else{
                            System.out.println("Khong co sinh vien");
                        }
                    }
                    break;
                case 4:
                    ds.sort((sp1, sp2) -> Double.compare(sp2.getDiem(), sp1.getDiem()));
                    System.out.println("Danh sach san pham sau khi sap xep ");
                    for (Student sv : ds) {
                        System.out.println(sv);
                    }
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh");

                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }

        } while (chon != 5);

    }

}
