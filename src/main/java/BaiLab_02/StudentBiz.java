/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiLab_02;

/**
 *
 * @author PC
 */
public class StudentBiz extends Student{
    public double diemMarketing;
    public double diemSales;

    public StudentBiz(double diemMarketing, double diemSales, String hoTen) {
        super(hoTen, "KD");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    

    @Override
    public double getDiem() {
       return (2*diemMarketing+diemSales)/3;
    }
    
}
