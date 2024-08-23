/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai06;

/**
 *
 * @author PC
 */
public class Oto extends GiaoThong{
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto(int soChoNgoi, String kieuDongCo, String ID, String HangSX, int NamSX, double gia, String mauXe) {
        super(ID, HangSX, NamSX, gia, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void xuat() {
        System.out.println("O to: "+",Id: "+getID()+",Hang san xuat: "+getHangSX()+", Nam san xuat: "+super.getNamSX()+", Gia ban: "+super.getGia()+
                ",Mau xe: "+super.getMauXe()+",So cho ngoi: "+soChoNgoi+",Kieu dong co: "+kieuDongCo);
    }
    
    
}
