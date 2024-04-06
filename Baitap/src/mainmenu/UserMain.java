package mainmenu;

import models.User;
import services.UserService;

import java.util.Scanner;

public class UserMain {
    public static UserService userService = new UserService();

    public static Scanner scanner = new Scanner(System.in);

    public static void login() {
        while (true) {
            System.out.println("Ten dang nhap");
            String username = scanner.nextLine();
            System.out.println("Mat khau :");
            String password = scanner.nextLine();
            boolean check = userService.checkLogin(username, password);
            if (check) {
                System.out.println("<<<Dang nhap thanh cong>>> ");
                System.out.println("XIN CHAO " + UserService.user.getUserName());
                try {
                    choiceRoomService();
                    choiceManagement();
                    break;
                } catch (Exception e) {
                    choiceRoomService();
                    choiceManagement();
                }
            } else {
                System.out.println("Ten dang nhap hoac mat khau khong dung");
            }
        }
    }

    public static void choiceRoomService() {
        System.out.println("Moi chon");
        System.out.println("1. Quan ly phong");
        System.out.println("2. Quan ly nha hang");
        System.out.println("3. Quay lai dang nhap");
        System.out.println("4. Quay lai dang ki");
    }

    public static void choiceManagement() {
        Scanner scanner1 = new Scanner(System.in);
        int choice = scanner1.nextInt();
        switch (choice) {
            case 1: {
                RoomMain.addNewRoom();
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                UserMain.login();
            }
            case 4: {
                UserMain.register();
            }
            case 0: {
                System.exit(0);
            }
            default: {
                System.out.println("Co loi xay ra");
            }
        }
    }

    public static void register() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tean dang nhap");
        String username = scanner.nextLine();
        System.out.println("Mat khau");
        String password = scanner.nextLine();
        User user = new User(username, password);
        userService.add(user);
        userService.printList();
    }
}
