import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {

        // Normal Array
        String[] lNames = {"Mendoza", "Gulde", "Harper", "Montealegre"};
        // ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        // HashMap
        HashMap<String, String> map = new HashMap<>();


        if(names.isEmpty()){
            System.out.println("Is empty");
        }

        // Adding elements in a normal Array
        lNames[0] = "Orsinger";

        // Adding elements in an ArrayList
        names.add("Ryan");
        names.add("Justin");
        names.add("Ryan");
        names.add("Justin");
        names.add("Zach");
        names.add("Fer");

        // Removing elements in an ArrayList
        names.remove("Ryan");

        // Checks if the ArrayList has Ryan in it
        if(names.contains("Ryan")){
            System.out.println("It is in the list");
        }

        map.put("Ryan", "ryanorsinger");
        map.put("Luis", "MontealegreLuis");
        map.put("Zach", "zgulde");
        map.put("Fernando", "fmendozaro");
        map.put("Justin", "jreich5");

        // Tests
        System.out.println(map.get("Justin"));
        System.out.println(Arrays.binarySearch(lNames, "Harper"));
        System.out.println("Index of zach " +names.indexOf("Zach"));

        // Prints the values for each array
        for(String name : names){
            System.out.println(name);
        }

        for(String lName : lNames){
            System.out.println(lName);
        }

        // Iterating over keys only
        for (String key : map.keySet()) {
            System.out.println("Key = " + key);
        }

        // Iterating over values only
        for (String value : map.values()) {
            System.out.println("Value = " + value);
        }

    }
}
