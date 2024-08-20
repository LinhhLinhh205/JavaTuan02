/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiLab_02;

/**
 *
 * @author PC
 */
public class StudentIT extends Student{
    public double diẹmJava;
    public double diemCss;
    public double diemHtml;

    public StudentIT(double diẹmJava, double diemCss, double diemHtml, String hoTen) {
        super(hoTen, "CNTT");
        this.diẹmJava = diẹmJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    @Override
    public double getDiem() {
        return (2*diẹmJava+diemHtml+diemCss)/4;
    }
    
    
}
    
    