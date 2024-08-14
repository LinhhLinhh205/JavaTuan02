/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai02;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Account A;
        Account B;
        DecimalFormat fm= new DecimalFormat("#,##0");
        A=new Account("A123", "Nguyen Ngoc Linh", 500000);
        B=new Account("B123", "Nguyen Thuy Kieu", 10000000);
        System.out.println("THONG TIN BAN DAU");
        System.out.println("My Account {" +" ID:" +A.getId()+", Name:"+A.getName()+" , Balance: "+fm.format(A.getBalance())+'}');
        System.out.println("My Friend Account {" +" ID:" +B.getId()+", Name:"+B.getName()+" , Balance: "+fm.format(B.getBalance())+'}');
        
        A.credit(500);
        System.out.println("THONG TIN SAU KHI GUI TIEN");
        System.out.println("My Account {" +" ID:" +A.getId()+", Name:"+A.getName()+" , Balance: "+fm.format(A.getBalance())+'}');
        
        A.debit(100000);
        System.out.println("THONG TIN SAU KHI RUT TIEN");                
        System.out.println("My Account {" +" ID:" +A.getId()+", Name:"+A.getName()+" , Balance: "+fm.format(A.getBalance())+'}');
        
        B.tranferTo(A, 200000);
        System.out.println("THONG TIN SAU KHI CHUYEN TIEN");        
        System.out.println("My Account {" +" ID:" +A.getId()+", Name:"+A.getName()+" , Balance: "+fm.format(A.getBalance())+'}');
        System.out.println("My Friend Account {" +" ID:" +B.getId()+", Name:"+B.getName()+" , Balance: "+fm.format(B.getBalance())+'}');
        
        
    }
}
