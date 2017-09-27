import superclasses.Person;
import util.Input;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {

        Person[] people;
        people = new Person[4]; // the length, which is 1 greater than the highest index

        people[0] = new Person("Fernando");
        people[1] = new Person("Zach");

        // array initializer
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        // numbers[5]; // ArrayIndexOutOfBounds

        Input input = new Input();
        System.out.println("How many things are you going to have for lunch?");
        int sizeOfTheArray = input.getInt();
        String[] foods = new String[sizeOfTheArray];

        for (int i = 0; i < sizeOfTheArray; i += 1) {
            System.out.print("Enter the item at index " + i + ": ");
            foods[i] = input.getString();
        }

        // enhanced for loop
        for (String food : foods) {
            if (food.equals("coffee")) {
                System.out.println("Hey! That's not food, that's coffee!");
            } else {
                System.out.println(food + " is a good choice!");
            }
        }

        String[] suggestedFoods = new String[]{"broccoli", "carrots", "water"};

        // if what I'm eating for lunch is "good", print a nice message
        if (Arrays.equals(foods, suggestedFoods)) {
            System.out.println("Good job!");
        } else {
            System.out.println("You should eat more broccoli.");
        }

        System.out.println("foods: " + Arrays.toString(foods));
        System.out.println("suggested foods: " + Arrays.toString(suggestedFoods));

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        System.out.println(matrix[1][2]);

        int counter = 0;

        for(int[] number : matrix){
            counter++;
            if(counter == 4){
                number[1] = 20;
                System.out.println(number[1]);
            }

        }

        for(int[] row: matrix){
            for(int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}

