package controller;

import dto.Profile;
import util.ScannerUtil;

public class UserController {
    public void start(Profile profile) {
        boolean k = true;
        while (k) {
            showMenu();
            switch (ScannerUtil.getAction()) {
                case 1 -> addCard();
                case 2 -> cardList();
                case 3 -> cardChangeStatus();
                case 4 -> deleteCard();
                case 5 -> reFill();
                case 6 -> transactionList();
                case 7 -> makePayment();

                case 0 -> k = false;
                default -> {
                    System.out.println("boshqa menyuni tanladingiz.");
                }


            }
        }
    }

    private void makePayment() {
    }

    private void transactionList() {

    }

    private void reFill() {

    }

    private void deleteCard() {

    }

    private void cardChangeStatus() {

    }

    private void cardList() {
    }

    private void addCard() {

    }

    private void showMenu() {
        System.out.println("************ USER MENU **************");
        System.out.print("""
                1. Add Card .
                2. Card List .
                3. Card Change Status.
                4. Delete Card .
                5. ReFill .
                6. Transaction List.
                7. Make Payment.
                """);
    }
}
