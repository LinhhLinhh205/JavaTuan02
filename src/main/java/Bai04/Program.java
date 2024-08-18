/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai04;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Program {
    public static void main(String[] args) {
        DecimalFormat fm=new DecimalFormat("#.##");
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh Tron: ");
        double bankinh=sc.nextDouble();
        HinhTron hinhtron=new HinhTron(bankinh);
        System.out.println("---HINH TRON---");
        System.out.println("Ban kinh: "+hinhtron.getBanKinh());
        System.out.println("Dien tich: "+fm.format(hinhtron.tinhDienTich()));
        System.out.println("Chu vi: "+fm.format(hinhtron.tinhChuVi()));              
    }
    
}
