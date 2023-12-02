package controller;

import dto.Profile;
import util.ScannerUtil;


public class AdminController {
    
    
    public void start(Profile profile){
        boolean k=true;
        while (k){
            showMenu();
            switch (ScannerUtil.getAction()){
                case 1->crateCart();
                case 2->cardList();
                case 3->updateCart();
                case 4->changeCardStatus();
                case 5->deleteCard();
                case 6->createTerminal();
                case 7->terminalList();
                case 8->updateTerminal();
                case 9->changeTerminalStatus();
                case 10->deleteTerminal();
                case 11->profileList();
                case 12->changeProfileStatus();
                case 13->transactionList();
                case 14->companyCardBalance();
                case 15->todayTransactionList();
                case 16->transactionByDay();
                case 17->transactionBetweenDays();
                case 18->balance();
                case 19->transactionByTerminal();
                case 20->transactionByCard();
                case 0->{
                    k=false;
                }
                default -> System.out.println("boshqa raqamni tanladingiz.");
                
                
            }
        }
    }

    private void companyCardBalance() {
    }

    private void transactionList() {
        
    }

    private void changeProfileStatus() {
        
    }

    private void profileList() {
        
    }

    private void deleteTerminal() {
        
    }

    private void changeTerminalStatus() {
        
    }

    private void updateTerminal() {
        
    }

    private void todayTransactionList() {
        
    }

    private void transactionByDay() {
        
    }

    private void transactionBetweenDays() {
    }

    private void balance() {
    }

    private void transactionByTerminal() {
        
    }

    private void transactionByCard() {
        
    }

    private void createTerminal() {
        
    }

    private void terminalList() {
        
    }

    private void deleteCard() {
    }

    private void changeCardStatus() {
    }

    private void updateCart() {
    }

    private void cardList() {
    }

    private void crateCart() {
        
    }

    private void showMenu() {
        System.out.println("************ ADMIN MENU **************");
        System.out.print("""
                1. Create Card.
                2. Card List.
                3. Update Card.
                4. Change Card status.
                5. Delete Card.    
                6. Create Terminal.
                7. Terminal List.
                8. Update Terminal.
                9. Change Terminal Status.
                10. Delete Terminal.
                11. Profile List.
                12. Change Profile Status.
                13. Transaction List. 
                14. Company Card Balance.
                15. Today TransactionList .
                16. transaction By Day.
                17. transaction between days.
                18. Umumiy balance.
                19. Transaction by Terminal.
                20. Transaction By Card.
                0.Exit.
                """);
    }


}
