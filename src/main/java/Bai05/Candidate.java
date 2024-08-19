/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai05;

/**
 *
 * @author PC
 */
public class Candidate {

    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String mucUuTien;

    public Candidate() {
    }

    public Candidate(String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    public void hienThiThongTin() {
        System.out.println("So bao danh: " + soBaoDanh);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Muc uu tien: " + mucUuTien);
    }

    public String getKhoiThi() {
        return " ";
    }
}
