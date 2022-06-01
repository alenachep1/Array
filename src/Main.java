import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("2");
        strings.add("+");
        strings.add("3");
        strings.add("должно быть");
        strings.add("=");
        strings.add("5");

        strings.remove(3);

        for (String str : strings){
            System.out.println(str);
        }
         int index=strings.indexOf("3");
        System.out.println("3-это элемент массива " +  index);


        LinkedList<String> linkedstrings = new LinkedList<>();
        linkedstrings.add("я");
        linkedstrings.add("устала");
        linkedstrings.add("больше");
        linkedstrings.add("не");
        linkedstrings.add("могу");

        linkedstrings.remove(2);

        for (String str : linkedstrings){
            System.out.println(str);
        }
        int index1 =linkedstrings.indexOf("больше");
        System.out.println("больше-это элемент массива " +  index1);



        ArrayList<Cat>cats= new ArrayList<>();
        Cat cat = new Cat();
        cats.add(1, new Cat ("Барсик"));
        cats.add(2, new Cat ("Васька"));
        cats.add(3, new Cat ("Мурка"));
        CatList catList= new CatList();
        catList.listCats(cats);
        int index2=cats.indexOf("Васька");
        System.out.println(index2 + " Васька" );


        LinkedList<Cat>linkedcats= new LinkedList<>();
        Cat cat = new Cat();
        linkedcats.add(1, new Cat ("Барсик"));
        linkedcats.add(2, new Cat ("Васька"));
        linkedcats.add(3, new Cat ("Мурка"));

        linkedcats.add(3, new Cat ("Киса"));
        System.out.println(cat);
    }

}
