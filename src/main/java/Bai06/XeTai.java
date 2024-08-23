/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai06;

/**
 *
 * @author PC
 */
public class XeTai extends GiaoThong {

    private double trongTai;

    public XeTai(double trongTai, String ID, String HangSX, int NamSX, double gia, String mauXe) {
        super(ID, HangSX, NamSX, gia, mauXe);
        this.trongTai = trongTai;
    }

    @Override
    public void xuat() {

        System.out.println("Xe May: " + ",Id: " + getID() + ",Hang san xuat: " + getHangSX() + ", Nam san xuat: " + super.getNamSX() + ", Gia ban: " + super.getGia()
                + ",Mau xe: " + super.getMauXe() + ",Trong tai: " + trongTai);
    }

}
