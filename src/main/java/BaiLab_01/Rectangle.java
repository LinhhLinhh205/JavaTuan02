/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiLab_01;

/**
 *
 * @author PC
 */
public class Rectangle {

    public double rong;
    public double dai;

    public Rectangle(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("HINH CHU NHAT: Chieu rong: " + rong + " Chieu dai: " + dai + " Dien tich: " + getDienTich() + " Chu vi: " + getChuVi());
    }
}
