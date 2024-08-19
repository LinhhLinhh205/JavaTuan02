/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai04;

/**
 *
 * @author PC
 */
public class Circle {

    private double banKinh;

    public Circle() {
    }

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    public double tinhDienTich(){
        return Math.PI*banKinh*banKinh;
    }
    public double tinhChuVi(){
        return Math.PI*2*banKinh;
    }        
}

