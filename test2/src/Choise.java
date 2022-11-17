import java.util.ArrayList;

public class Choise {
    Menu menu=new Menu();
    Adding adding=new Adding();



    public void choiseMainMenu(){
        do {
            menu.mainMenu();
            switch (menu.selectMain) {
                case 1:
                    choiseAddMenu();
                    break;
                case 2:
                    choiseDisplayMenu();
                    break;

            }
        }while (menu.selectMain<3);
    }



    public void choiseAddMenu() {
        do {
            menu.addMenu();
            switch (menu.selectAdd){
                case 1:
                    adding.addPhone();
                    break;
                case 2:
                    adding.addParts();
                    break;

            }
        }while (menu.selectAdd<3);
    }

    public void choiseDisplayMenu(){
       do{
            menu.displayAll();
            switch (menu.selectBack){
                case 1:
                    System.out.println(adding.getPhoneList());
                    break;
                case 2:
                    displayPartsMenu();
                default:
                    break;
            }

        }while (menu.selectBack<3);
    }

    public void displayPartsMenu(){
        menu.displayPartsMenu();
        adding.search(menu.partChois);
    }
}
