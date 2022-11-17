import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Adding {

    Scanner scanner=new Scanner(System.in);
    private String name;
   private  ArrayList<String>phoneList=new ArrayList<>();

   public ArrayList getPhoneList(){
       return this.phoneList;
   }

   private ArrayList<String>partsList=new ArrayList<>();
   private HashMap<Integer,String>partsMap=new HashMap<>();
    public void addPhone(){
        do {
            System.out.println("Wpisz nazwę telefonu");
            System.out.print("> ");
            name = scanner.nextLine();
            phoneList.add( name);
            System.out.println("Czy chcesz dodać następny telefon?");
            System.out.print("> ");
            name = scanner.nextLine();
        }while(name.equals("tak")||name.equals("TAK"));
        System.out.println("Właśnie dodałeś następujące telefony:");
        for(int i=0;i< phoneList.size();i++){
            System.out.println(phoneList.get(i));
        }
    }



    public void addParts() {
        if (phoneList.size() == 0) {
            System.out.println("Najpierw dodaj jakiś telefon");
        } else {
            do {
                System.out.println("Wpisz nazwę Części");
                System.out.print("> ");
                name = scanner.nextLine();
                partsList.add(name);
                System.out.println("Czy chcesz dodać następną część?");
                System.out.print("> ");
                name = scanner.nextLine();
            } while (name.equals("tak") || name.equals("TAK"));
            System.out.println("Wybierz tel z listy, do którego dodane zostaną częsci: ");
            System.out.println("###############");
            for(int i=0;i< phoneList.size();i++){
                System.out.println("  " + phoneList.get(i));
            }
            System.out.println("###############");
            System.out.print("> ");
            name=scanner.nextLine();
            addPartToPhone(name);
        }
    }


    public void addPartToPhone(String putIndex){

        int bufor=0;
        for(int i=0;i<phoneList.size();i++){
            if(phoneList.get(i).equals(putIndex)){
                bufor=i;
            }
        }
        partsMap.put(bufor, String.valueOf(partsList));
        partsList.clear();
        System.out.println(partsMap.get(bufor));


    }

    public void search(String item){
        int buffer=0;
        for(int i=0; i<phoneList.size();i++){
            if(phoneList.get(i).equals(item)){
                buffer=i;
            }
        }
        System.out.println(partsMap.get(buffer));

    }
}
