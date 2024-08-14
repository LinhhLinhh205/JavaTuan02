/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai02;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String id;
    private String name;
    private int balance;
    private String A12345;

    public Account() {
        id= "A1234";
        name="Nguyen Ngoc Linh";
        balance=500;                              
    }
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void credit(int amount){
        if(amount>0){
          balance+=amount;
            System.out.println("Nap tien thanh cong");
        }
    }
    public void debit(int amount){
        if(balance>amount){
            balance-=amount;
            System.out.println("Thanh toan thanh cong");
                  
        }
        else
            System.out.print("Thanh toan khong thanh cong");
    }
    public void tranferTo(Account acc, int amount){
        if(amount<=balance){
            balance-=amount;
            acc.balance+=amount;
            System.out.println("Chuyen tien thnah cong");
        }else
            System.out.println("So du khong du");
    
    }      
}
