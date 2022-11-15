import java.util.ArrayList;

public class Menu {
    public int change=0;
    public String part=" ";
    public String nameOfAction=" ";


    public void menu(){

       System.out.println("########################");
       System.out.println("   [1] Dodaj");
       System.out.println("   [2] Usuń");
       System.out.println("   [3] Wyświetl");
       System.out.println("   [4] Koniec");
       System.out.println("########################");
       System.out.print(" > ");

   }
   /*[1]*/
   public void iP(String phoneDetail){
        int bufor=0;

       ArrayList<String>partList=new ArrayList<>();
       ArrayList<String>stuckList=new ArrayList<>();
       ArrayList<String>priceList=new ArrayList<>();

       partList.add("LCD");
       partList.add("Buzzer");
       partList.add("Face_ID");

       stuckList.add("20");
       stuckList.add("22");
       stuckList.add("23");

       priceList.add("150");
       priceList.add("50");
       priceList.add("200");

            if(phoneDetail.equals("IP_8")) {
                System.out.print("");
                System.out.println("################################");
                System.out.println("  |  Nazwa   | Szt.| cena/szt |");
                for (int i = 0; i < partList.size(); i++) {
                    for (int s = 0; s < 1; s++) {
                        System.out.print(i + 1);
                    }
                    System.out.print(" |  ");
                    for (int j = 0; j < 1; j++) {
                        System.out.print(partList.get(i));
                        if (partList.get(i).length() < 7) {
                            bufor = partList.get(i).length();
                            for (int d = bufor; d < 7; d++) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.print(" |  ");
                    for (int sl = 0; sl < 1; sl++) {
                        System.out.print(stuckList.get(i));
                    }
                    System.out.print(" | ");
                    for (int pl = 0; pl < 1; pl++) {
                        System.out.print(priceList.get(i));
                        if (priceList.get(i).length() < 9) {
                            bufor = priceList.get(i).length();
                            for (int le = bufor; le < 9; le++) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.print("| ");
                    System.out.println();
                }
                System.out.println("################################");


            }
   }

   /* [3] */
   public void wyswietl(){

       System.out.println("##############");
       System.out.println("  | Nazwa  |");
       System.out.println("> | IP_8   |");
       System.out.println("> | IP_X   |");
       System.out.println("> | IP_XS  |");
       System.out.println("> | IP_XSM |");
       System.out.println("##############");
   }


   

}
