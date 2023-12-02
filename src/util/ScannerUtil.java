package util;

import java.util.Scanner;

public class ScannerUtil {
    public static int getAction(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter choose menu:");
        return scanner.nextInt();
    }
}
