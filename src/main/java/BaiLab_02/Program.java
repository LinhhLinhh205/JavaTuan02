/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiLab_02;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Program {

    public static void main(String[] args) {
        Manage ql = new Manage();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("QUAN LY SINH VIEN");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Thoat");
            System.out.print("Ban chon chuc nang: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ql.them();
                    break;
                case 2:
                    ql.xuat();
                    break;
                case 3:
                    ql.xuatGioi();
                    break;
                case 4:
                    ql.sapXep();
                    break;
                case 5:
                    System.out.println("Thoat");

                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }

        } while (chon != 5);

    }

}
