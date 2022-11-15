import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        String details;
        String details1;
        Menu menu = new Menu();
        int szt;



        int c1;
        do {
            System.out.println();
            menu.menu();
            c1 = scanner.nextInt();
            System.out.println();
            switch (c1) {

                case 1:
                    System.out.println("dodaj elementy");
                    menu.wyswietl();
                    System.out.print("Do którego modelu chcesz dodać części: ");
                    details=scanner1.nextLine();
                    menu.iP(details);
                    System.out.println("Która część chcesz edytować?");
                    System.out.print("> ");
                   szt= scanner.nextInt();
                   menu.change=szt;
                    break;
                case 2:
                    System.out.println("Usuń elementy");
                    menu.wyswietl();
                    System.out.print("Z którego modelu chcesz usunąć części: ");
                    break;
                case 3:
                    System.out.println("Oto wszystkie zapisane pozycje:");
                    menu.wyswietl();
                    System.out.print("Do którego modelu chcesz zobaczyć magazyn: ");
                    details=scanner1.nextLine();
                    menu.iP(details);
                    break;
                default:
                    System.out.println("Magazyn zakończył swoje działanie!");
            }
        } while (c1 < 4);


    }
}