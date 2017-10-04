/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilesLecture {
    public static void main(String[] args) throws IOException {
        // Path to resources/info.txt
        Path path = Paths.get("resources", "info.txt"); // files
        System.out.println(path.toAbsolutePath());

        if (!Files.exists(path.getParent())) {
            Files.createDirectory(path.getParent());
        }
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        // Helper methods // static methods
        //List<String> groceries = Arrays.asList("coffee,3", "tea,5", "sugar,6");
        List<String> groceries = new ArrayList<>();
        groceries.add("coffee,3");
        groceries.add("tea,4");
        groceries.add("sugar,5");

        // serialization  object -> text / deserialization text -> object

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you need from the grocery store?");
        String groceryItem = scanner.nextLine();
        System.out.println("How many do you need?");
        String quantity = scanner.nextLine();
        groceries.add(groceryItem + "," + quantity);

        Files.write(path, groceries, StandardOpenOption.APPEND);  // write several lines to a file

        List<String> mySavedGroceries = Files.readAllLines(path); // read all the lines from a file

        for (String grocery: mySavedGroceries) {
            String[] parts = grocery.split(",");

            System.out.println("Item: " + parts[0] + ", Quantity: " + parts[1]);
            //System.out.println(grocery.replace(",", " - "));
        }
    }
}
