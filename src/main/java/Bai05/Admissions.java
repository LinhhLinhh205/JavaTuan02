/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai05;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Admissions {
    public static ArrayList<Candidate> ds = new ArrayList<>();
    
    public void AddTS(Candidate thisinh){
        ds.add(thisinh);
    }
    public void hienThiThongTin(){
        for(Candidate thisinh:ds){
            thisinh.hienThiThongTin();
            System.out.println("Khoi thi: "+thisinh.getKhoiThi());
        }
        
    }
    public Candidate searchSBD(String soBD){
        for(Candidate thisinh:ds){
            if(thisinh.getSoBaoDanh().equalsIgnoreCase(soBD));
            return thisinh;
        }       
        return null;
    }
}
