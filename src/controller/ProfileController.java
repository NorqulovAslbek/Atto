package controller;

import util.ScannerUtil;

public class ProfileController {

    public void start(){
        boolean k=true;
        while (k){
            showMenu();
            switch (ScannerUtil.getAction()){
                case 1->login();
                case 2->registration();
                case 0-> {
                    k=false;
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


    }

    private void login() {


    }


}
