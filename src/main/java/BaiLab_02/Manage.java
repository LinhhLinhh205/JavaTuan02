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
public class Manage {

    private ArrayList<Student> ds = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void them() {
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
    }

    public void xuat() {
        for (Student sv : ds) {
            sv.xuat();
        }
    }

    public void xuatGioi() {
        for (Student sv : ds) {
            if (sv.getHocLuc().equals("Gioi")) {
                sv.xuat();
            }
        }
    }

    public void sapXep() {
        ds.sort((sp1, sp2) -> Double.compare(sp2.getDiem(), sp1.getDiem()));
        System.out.println("Danh sach san pham sau khi sap xep ");
        for (Student sv : ds) {
            System.out.println(sv);
        }
    }
}
