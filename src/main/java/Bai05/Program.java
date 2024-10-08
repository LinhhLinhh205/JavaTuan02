/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai05;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {

    public static void main(String[] args) {
        Admissions ad = new Admissions();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("QUAN LY THI SINH");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh va khoi thi");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Ban chon chuc nang:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    them(sc, ad);
                    break;
                case 2:
                    ad.hienThiThongTin();
                    break;
                case 3:
                    timSBD(sc, ad);
                    
                    break;
                case 4:
                    System.out.println("Thoat ");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
                    
            }
        } while (chon != 4);
    }

    private static void them(Scanner sc, Admissions ad) {
        System.out.print("Nhap so bao danh: ");
        String sobaodanh = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap ho ten thi sinh: ");
        String hoten = sc.nextLine();
        System.out.print("Nhap dia chi thi sinh: ");
        String diachi = sc.nextLine();
        System.out.print("Nhap muc uu tien thi sinh:");
        String mucuutien = sc.nextLine();
        System.out.print("Nhap khoi thi: ");
        String khoithi = sc.nextLine();
        
        Candidate cd = null;
        switch (khoithi) {
            case "A":
                cd = new TSKhoiA(sobaodanh, hoten, diachi, mucuutien);
                break;
            case "B":
                cd = new TSKhoiB(sobaodanh, hoten, diachi, mucuutien);
                break;
            case "C":
                cd=new TSKhoiC(sobaodanh, hoten, diachi, mucuutien);
                break;
            default:
                System.out.println("Khoi thi khong ton tai");
        }
        ad.AddTS(cd);
    }

    private static void timSBD(Scanner sc, Admissions ad) {
        System.out.println("Nhap so bao danh can tim: ");
        String timsoBD=sc.nextLine();
        
        Candidate candi=ad.searchSBD(timsoBD);
        if(candi!=null){
            candi.hienThiThongTin();
        }else{
            System.out.println("Khong co thi sinh co so bao danh nay!");
        }
    }
    
}
