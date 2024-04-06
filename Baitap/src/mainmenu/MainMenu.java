package mainmenu;

import models.Room;

import java.util.Date;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {


        while (true) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Dang nhap");
            System.out.println("2. Dang ki");
            System.out.println("0. Thoat chuong trinh");
            switch (scanner.nextInt()) {
                case 1: {
                    UserMain.login();


                    break;
                }
                case 2: {
                    UserMain.register();
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Khong co lua chon nay moi nhap lai");
                }
            }
        }
    }
}
