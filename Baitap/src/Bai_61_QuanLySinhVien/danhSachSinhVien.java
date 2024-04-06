package Bai_61_QuanLySinhVien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class danhSachSinhVien  {
    private ArrayList<SinhVien> danhSach;//tao mang chua class SinhVien

    public danhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public danhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }



    public void inDanhSachSinhVien(){
        for (SinhVien sinhVien: danhSach) {//foreach quet taat car cac phaan tu trong mang
            System.out.println(sinhVien);


        }

    }
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
    public int soLuongSinhVientrongDanhSach(){
        return this.danhSach.size();
    }
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }


    @Override
    public String toString() {
        return "danhSachSinhVien{" +
                "danhSach=" + danhSach +
                '}';
    }

    public boolean xoaSinhVien(SinhVien maSinhVien){
        return this.danhSach.remove(maSinhVien);
}
public void timSinhVien(String ten){
    for (SinhVien sinhVien: danhSach) {
        if(sinhVien.getHoVaTen().indexOf(ten)>=0){
            System.out.println(sinhVien);
        }

    }
}




}




