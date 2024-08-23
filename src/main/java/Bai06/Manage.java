/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai06;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author PC
 */
public class Manage {
    private ArrayList<GiaoThong> ds=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    public void them(){
        System.out.println("Chon loai phuong tien:(1.oto,2.xe may,3.xe tai)");
        int chon=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        System.out.print("Nhap hang san xuat: ");
        String hangSanXuat = sc.nextLine();
        System.out.print("Nhap nam san xuat: ");
        int namSanXuat = sc.nextInt();
        System.out.print("Nhap gia ban: ");
        double giaBan = sc.nextDouble();
        sc.nextLine();  // Xóa buffer
        System.out.print("Nhap mau xe: ");
        String mauXe = sc.nextLine();
        switch (chon) {
            case 1:
                System.out.print("Nhap so cho ngoi: ");
                int soChoNgoi=sc.nextInt();
                sc.nextLine();
                System.out.print("Nhap kieu co dong co: ");
                String kieuDongCo=sc.nextLine();
                Oto oto=new Oto(soChoNgoi, kieuDongCo, id, mauXe, namSanXuat, giaBan, mauXe);
                ds.add(oto);
                break;
            case 2:
                System.out.print("Nhap cong suat: ");
                double congSuat=sc.nextDouble();
                sc.nextLine();
                XeMay xemay=new XeMay(congSuat, id, mauXe, namSanXuat, giaBan, mauXe);
                ds.add(xemay);
            case 3:
                System.out.print("Nhap trong tai: ");
                double trongTai=sc.nextDouble();
                sc.nextLine();
                XeTai xetai=new XeTai(trongTai, id, mauXe, namSanXuat, giaBan, mauXe);
                ds.add(xetai);
            default:
                throw new AssertionError();
        }
    }
    public void xoa(String id){       
        Iterator<GiaoThong> it=ds.iterator();
        while(it.hasNext()){
            GiaoThong gt=it.next();
            if(gt.getID().equals(id)){
                it.remove();
                System.out.println("da xoa phuong tien");
                return;
            }
        }        
    }
    public void tim(String hangSX, String mauXe){
        for(GiaoThong gt:ds){
            if( gt.getHangSX().equalsIgnoreCase(hangSX)&&gt.getMauXe().equalsIgnoreCase(mauXe)){
                gt.xuat();
            }
        }
    }
    public void xuat(){
        for(GiaoThong gt:ds){
            gt.xuat();
        }
    }
    
}
