package Bai_61_QuanLySinhVien;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        danhSachSinhVien dssv = new danhSachSinhVien();
        do {
            System.out.println("MENU ----------");
            System.out.println(
                    "Vui long chon chuc nang:\n"
                            + "1. Them sinh vien vao danh sach.\n"
                            + "2. In danh sach sinh vien ra man hinh.\n "
                            + "3. Kiem tra danh sach co rong hay khong.\n"
                            + "4. Lay ra so luong sinh vien trong danh sach.\n"
                            + "5. Lam rong danh sach sinh vien.\n"
                            + "6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien.\n"
                            + "7. Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\n"
                            + "8. Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim.\n"
                            + "9. Xuat ra danh sach sinh vien co diem tu cao den thap.\n"
                            + "0. Thoat khoi chuong trinh.");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println(" Nhap ma sinh vien :"); String maSinhVien = sc.nextLine();
                System.out.println(" Nhap ho va ten :"); String hoVaTen = sc.nextLine();
                System.out.println(" Nhap nam sinh :"); int namSinh = sc.nextInt();
                System.out.println(" Nhap diem trung binh :"); float diemTrungBinh = sc.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);

            } else if (luaChon == 2) {
                dssv.inDanhSachSinhVien();

            } else if (luaChon == 3) {
                System.out.println("Danh Sach rong : " +dssv.kiemTraDanhSachRong());

            } else if (luaChon == 4) {
                System.out.println("So luong Sinh vien trong danh sach la: "+dssv.soLuongSinhVientrongDanhSach());

            } else if (luaChon == 5) {
                dssv.lamRongDanhSach();
                System.out.println("da lam rong danh sach sinh vien: ");

            } else if (luaChon == 6) {
                System.out.print("Nhap ma Sinh vien muon kiem tra : ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);


            } else if (luaChon == 7) {
                System.out.println("Nhap ma sinh vien muon xoa : ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println(dssv.xoaSinhVien(sv));

            } else if (luaChon == 8) {
                System.out.println("Ten sv muon tim kiem : ");
                String tensinhVien = sc.nextLine();
               dssv.timSinhVien(tensinhVien);


            } else if (luaChon == 9) {

            }
        }while (luaChon!=0);
        //luaChon == 1 || luaChon == 2 || luaChon == 3 || luaChon == 4 || luaChon == 5 || luaChon == 6 || luaChon == 7 || luaChon == 8 || luaChon == 9
        }
    }

