/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Rectangle r1;
        Rectangle r2;
        r1=new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double leng=sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double wid=sc.nextDouble();
        r2=new Rectangle(leng, wid);
        
        System.out.println("HCN 1:");
        System.out.println(r1);
        System.out.println("HCN 2");
        System.out.println(r2);
        
    }
}
