/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiLab_02;

/**
 *
 * @author PC
 */
public abstract class Student {

    public String hoTen;
    public String nganh;

    public String getHoTen() {
        return hoTen;
    }        

    public String getNganh() {
        return nganh;
    }
    
    public Student(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {        
        double diem = getDiem();
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }       
    }

    public void hienThiThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Nghanh: "+nganh);
        System.out.println("Diem: "+getDiem());
        System.out.println("Hoc luc: "+getHocLuc());
    }

    @Override
    public String toString() {
        return "Student {" + " Ho Ten=" + hoTen + ", Diem: "+getDiem()+" Hoc Luc: "+getHocLuc()+ '}';
    }
    
    
    
}
