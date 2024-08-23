/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai06;

/**
 *
 * @author PC
 */
public class XeMay extends GiaoThong{
    private double congSuat;

    public XeMay(double congSuat, String ID, String HangSX, int NamSX, double gia, String mauXe) {
        super(ID, HangSX, NamSX, gia, mauXe);
        this.congSuat = congSuat;
    }

    @Override
    public void xuat() {
        System.out.println("Xe May: "+",Id: "+getID()+",Hang san xuat: "+getHangSX()+", Nam san xuat: "+super.getNamSX()+", Gia ban: "+super.getGia()+
                ",Mau xe: "+super.getMauXe()+",Cong suat: "+congSuat);
    }
    
    
}
