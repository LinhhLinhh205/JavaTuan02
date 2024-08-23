/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai06;

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
            System.out.println("QUAN LY GIAO THONG");
            System.out.println("1. Them phuong tien");
            System.out.println("2. Xoa phuong tien");
            System.out.println("3. Timphuong tien theo hang va mau");
            System.out.println("4. Xuat danh sach");
            System.out.println("5. Thoat");
            System.out.print("Ban chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    ql.them();
                    break;
                case 2:
                    System.out.print("Nhap id can xoa: ");
                    String idXoa = sc.nextLine();
                    ql.xoa(idXoa);
                    break;
                case 3:
                    System.out.print("Nhap hang san xuat: ");
                    String hangSX = sc.nextLine();
                    System.out.print("Nhap mau xe: ");
                    String mauXe = sc.nextLine();
                    ql.tim(hangSX, mauXe);
                    break;
                case 4:
                    ql.xuat();
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
