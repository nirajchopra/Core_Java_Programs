package ConditionalStatement.SwitchStatement;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        int number = sc.nextInt();

        switch (number) {
            case 1:System.out.println("Samosa");
            break;
            case 2: System.out.println("Burgar");
            break;    
            case 3: System.out.println("Sandwich");
            break;
            default:System.out.println("We wake Up.....!!");
                break;
        }
    }
}
