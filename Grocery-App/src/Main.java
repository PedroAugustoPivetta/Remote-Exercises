import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> GroceryList = new ArrayList<>();

        boolean statment = true;
        while(statment){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("CHOOSE ONE OF THE FOLLOWING OPTIONS");
        System.out.println("1 - CLOSE SOFTWARE");
        System.out.println("2 - ADD ITEM TO THE LIST");
        System.out.println("3 - REMOVE AN ITEM FROM THE LIST");
        System.out.println("====================================");

        String option = sc.nextLine();

        if (Objects.equals(option, "1")){
            System.exit(0);
        }else if (Objects.equals(option, "2") ){
            System.out.println(" ");
            System.out.println("====================================");
            System.out.println("WRITE THE ITEM TO BE ADDED TO THE LIST, MORE ITEM SEPARATED BY COMMA");
            String item = sc.nextLine();
            String[] itemExtracted = item.split("\\s*,\\s*");
            System.out.println("====================================");
            Collections.addAll(GroceryList, itemExtracted);
            GroceryList.sort(Comparator.naturalOrder());

            for (String listItem : GroceryList){
                System.out.println("Item:" + listItem);
            }
        }else if (Objects.equals(option, "3")){
            System.out.println(" ");
            System.out.println("====================================");
            System.out.println("WRITE THE ITEM TO BE DELETED FROM THE LIST");
            String item = sc.nextLine();
            System.out.println("====================================");
            String[] itemExtracted = item.split("\\s*,\\s*");
            for (String listItem : itemExtracted){
                GroceryList.remove(listItem);
            }
            GroceryList.sort(Comparator.naturalOrder());
            for (String listItem : GroceryList){
                System.out.println("Item:" + listItem);
            }

        }
    }

    }
}