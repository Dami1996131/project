import java.util.Scanner;

public class Menu {
    Scanner scanner=new Scanner(System.in);
    Scanner scanner1=new Scanner(System.in);
    int selectMain;
    int selectAdd;
    int selectBack;
    String partChois;
    public void mainMenu(){

        System.out.println("#############");
        System.out.println("[1]Dodaj");
        System.out.println("[2]Wyświetl");
        System.out.println("[3]Wyjście");
        System.out.println("#############");
        System.out.print("> ");
        selectMain=scanner.nextInt();
    }

    public void addMenu(){
        System.out.println("#############");
        System.out.println("[1]Dodaj Telefon");
        System.out.println("[2]Dodaj Części");
        System.out.println("[3]Wróć");
        System.out.println("#############");
        System.out.print("> ");
        selectAdd=scanner.nextInt();

    }
 public void displayAll(){
     System.out.println("#############");
     System.out.println("[1]Wyświetl Telefony ");
     System.out.println("[2]Wyświetl części");
     System.out.println("[3]Wróć");
     System.out.println("#############");
     System.out.print("> ");
     selectBack=scanner.nextInt();
 }

 public void displayPartsMenu(){
        System.out.println("Do którego telefonu chcesz wyświetlić części:");
        System.out.print("> ");
        partChois=scanner1.nextLine();
 }
}
