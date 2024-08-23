/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai06;

/**
 *
 * @author PC
 */
public abstract class GiaoThong {
    private String ID;
    private String HangSX;
    private int NamSX;
    private double gia;
    private String mauXe;

    public GiaoThong(String ID, String HangSX, int NamSX, double gia, String mauXe) {
        this.ID = ID;
        this.HangSX = HangSX;
        this.NamSX = NamSX;
        this.gia = gia;
        this.mauXe = mauXe;
    }

    public String getID() {
        return ID;
    }

    public String getHangSX() {
        return HangSX;
    }

    public int getNamSX() {
        return NamSX;
    }

    public double getGia() {
        return gia;
    }

    public String getMauXe() {
        return mauXe;
    }
    public abstract void xuat();
}
