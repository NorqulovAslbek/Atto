package controller;

import dto.Profile;
import enums.GeneralStatus;
import enums.ProfileRole;
import service.ProfileService;
import util.ScannerUtil;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ProfileController {
    ProfileService profileService = new ProfileService();


    public void start() {
        boolean k = true;
        while (k) {
            showMenu();
            switch (ScannerUtil.getAction()) {
                case 1 -> login();
                case 2 -> registration();
                case 0 -> {
                    k = false;
                }
                default -> System.out.println("Boshqa menu tanlang!");
            }
        }
    }

    private void showMenu() {
        System.out.print("""
                1.login.
                2.registration.
                0.exit.
                """);
    }


    private void registration() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = scanner.next();
        System.out.print("Enter surname:");
        String surname = scanner.next();
        System.out.print("Enter phone:");
        String phone = scanner.next();
        System.out.print("Enter password:");
        String password = scanner.next();
        Profile profile = new Profile();
        profile.setName(name);
        profile.setSurname(surname);
        profile.setPhone(phone);
        profile.setPassword(password);
        profile.setCreated_date(LocalDateTime.now());
        profile.setStatus(GeneralStatus.ACTIVE);
        profile.setRole(ProfileRole.USER);
        profileService.registrationService(profile);
    }

    private void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone:");
        String phone = scanner.next();
        System.out.print("Enter password:");
        String password = scanner.next();
        profileService.getByPhoneAndPassword(phone, password);

    }


}
