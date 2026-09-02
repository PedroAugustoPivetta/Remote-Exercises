import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        LinkedList<Town> townList = new LinkedList<>();

        townList.add(new Town("Sydney", 0));
        townList.add(new Town("Melbourne", 877));
        townList.add(new Town("Brisbane", 917));
        townList.add(new Town("Adelaide", 1374));
        townList.add(new Town("Alice Springs", 2771));
        townList.add(new Town("Perth", 3923));
        townList.add(new Town("Darwin", 3972)) ;

        boolean run = true;
        Scanner scan = new Scanner(System.in);
        var it = townList.listIterator();
        Town adress = null;
        while (run) {

            printMenu();
            String option = scan.nextLine();
            //var townIterator = townList.listIterator();

            if (Objects.equals(option.toLowerCase(), "f") || Objects.equals(option.toLowerCase(), "forward")) {
                if (it.hasNext()) {
                    adress = it.next();
                    System.out.println(adress.getName() + " | " + adress.getDistance());
                }else {
                    System.out.println("There are no more remaining places, try to backwards");
                }
            } else if ((Objects.equals(option.toLowerCase(), "b") || Objects.equals(option.toLowerCase(), "backward"))) {
                if (it.hasPrevious()) {
                    adress = it.previous();
                    System.out.println(adress.getName() + " | " + adress.getDistance());
                }else {
                    System.out.println("There are no more previous places, try to forwards");
                }
            } else if ((Objects.equals(option.toLowerCase(), "la") || Objects.equals(option.toLowerCase(), "list all places"))) {
                var listAll = townList.listIterator();
                while (listAll.hasNext()) {
                    adress = listAll.next();
                    System.out.println(adress.getName() + " | " + adress.getDistance());
                }
            } else if ((Objects.equals(option.toLowerCase(), "lr") || Objects.equals(option.toLowerCase(), "list remaining places"))) {
                if (it.hasNext()){
                while (it.hasNext()) {
                    adress = it.next();
                    System.out.println(adress.getName() + " | " + adress.getDistance());
                }
                }else {
                    System.out.println("There are no more remaining places, try to backwards");
                }
            }
                else if ((Objects.equals(option.toLowerCase(), "q") || Objects.equals(option.toLowerCase(), "quit"))) {
                run = false;
            } else {
                System.out.println("You must choose one of the given options");
            }
        }


    }

    public static void printMenu(){
        System.out.println("  ");
        System.out.println("Available action (select word or letter)");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(LA)List All Places");
        System.out.println("(LR)List remaining Places");
        System.out.println("(Q)uit");
        System.out.println("  ");
    }

}