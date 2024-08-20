/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiLab_01;

/**
 *
 * @author PC
 */
public class Square extends Rectangle {

    public Square(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("HINH VUONG: Canh: " + dai + " Dien tich: " + super.getDienTich() + " Chu vi: " + super.getChuVi());
    }

}
