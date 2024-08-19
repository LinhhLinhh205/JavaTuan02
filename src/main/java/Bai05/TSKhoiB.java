/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai05;

/**
 *
 * @author PC
 */
public class TSKhoiB extends Candidate {

    public TSKhoiB(String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    @Override
    public String getKhoiThi(){
        return "Khoi B: Toan, Hoa, Sinh";
    }
    
}
