/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Program {
    
    public static ArrayList<Product> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }
    
    private static void menu() {
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("QUAN LY SAN PHAM");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Xuat va sap xep giam dan theo gia");
            System.out.println("3. Xoa san pham theo ten");
            System.out.println("4. Gia trung binnh cua cac san pham");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuatSapXep();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    xuatTB();
                    break;
                default:
                    System.out.println("Bye");                
            }
        } while (chon != 0);
    }
    
    private static void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap thong tin san pham");
            System.out.print("Ten: ");
            String ten = sc.nextLine();
            System.out.print("Gia: ");
            double gia = Double.parseDouble(sc.nextLine());
            ds.add(new Product(ten, gia));
            System.out.print("Ban muon tiep tuc? (y/n)");
            String tieptuc = sc.nextLine();
            if (!tieptuc.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);
    }
    
    private static void xuatSapXep() {
        ds.sort((sp1, sp2) -> Double.compare(sp2.getGia(), sp1.getGia()));
        System.out.println("Danh sach san pham sau khi sap xep ");
        for (Product sp : ds) {
            System.out.println(sp);
        }
    }
    
    private static void xoa() {
        System.out.println("Nhap ten san pham can xoa: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean a = false;
        for (int i = 0; i < ds.size(); i++) {
            Product sp = ds.get(i);
            if (sp.getTen().equalsIgnoreCase(name)) {
                ds.remove(i);
                a = true;
                break;
            }
        }
        if (a) {
            System.out.println("San pham duoc xoa");
            
        } else {
            System.out.println("Khong co san pham nay");
        }
        
    }
    
    private static void xuatTB() {
        double tong = 0;
        for (Product sp : ds) {
            tong += sp.getGia();
        }
        double tongTB = tong / ds.size();
        System.out.println("Trung binh cac san pham: " + tongTB);
    }
}
