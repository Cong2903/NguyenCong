package bai_57_taiXiu;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class taiXiu {
    public static void main(String[] args) {
        int a = 0;
        double datCuoc = 0;
        double taiKhoanNguoiChoi = 50000000;
        NumberFormat num = NumberFormat.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println(" ..........Tai - Xiu .........");
        do {
            System.out.println(" ------Moi ban nua chon-------");
            System.out.println("    Chon 1 de tiep tuc choi    ");
            System.out.println("   Chon phim bat ki de thoat   ");
            a = sc.nextInt();
            if (a == 1) {
                System.out.println(" --------Bat dau choi--------");
                System.out.println(" Tai khoan cua ban co : " + num.format(taiKhoanNguoiChoi));
                System.out.println(" Ban muon dat cuoc bao nhieu?");
                do {
                    System.out.println("        Dat cuoc : ");
                    datCuoc = sc.nextDouble();

                } while (datCuoc <= 0 || datCuoc >= taiKhoanNguoiChoi);

                taiKhoanNguoiChoi = taiKhoanNguoiChoi - datCuoc;

                int luaChonTaiXiu = 0;
                do {
                    System.out.println(" Chon 1<=> Tai hoac 2<=> Xiu ");
                    luaChonTaiXiu = sc.nextInt();
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int giaTri1 = xucXac1.nextInt(5) + 1;
                int giaTri2 = xucXac2.nextInt(5) + 1;
                int giaTri3 = xucXac3.nextInt(5) + 1;


                int e = 0;

                if ((giaTri1 + giaTri3 + giaTri2) == 3 || (giaTri1 + giaTri3 + giaTri2) == 8) {
                    System.out.println(">>>> Cái ăn hết  >> Bạn đã thua");

                } else {
                    if ((giaTri1 + giaTri3 + giaTri2) >= 4 && (giaTri1 + giaTri3 + giaTri2) <= 10) {
                        e = 1;
                    } else {
                        e = 2;
                    }
                }
                if (luaChonTaiXiu == e) {
                    System.out.println(">>>>>>> Ban da thang <<<<<<");
                    System.out.println("Tien tai khoan cua ban la : " + num.format(taiKhoanNguoiChoi + 2 * datCuoc));

                } else {
                    System.out.println(">>>>>>> Ban da thua <<<<<< ");
                    System.out.println("Tien tai khoan cua ban la : " + num.format(taiKhoanNguoiChoi));
                }
                e = 0;
            }
        } while (a == 1);


    }
}




