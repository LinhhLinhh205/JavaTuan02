/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai04;

/**
 *
 * @author PC
 */
public class Cylinder extends Circle{
    private double chieuCao;

    public Cylinder() {
    }

    public Cylinder(double chieuCao, double banKinh) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    @Override
    public double tinhDienTich(){
        return 2*super.tinhDienTich()+super.tinhChuVi()*chieuCao;
    }
    public double tinhTheTich(){
        return super.tinhDienTich()*chieuCao;
    }
    
}
