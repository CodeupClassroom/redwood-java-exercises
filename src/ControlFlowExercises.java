import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        int i = 5;
        long c = 2;
        Scanner input = new Scanner(System.in);

        while(i <= 15){
            System.out.println(i);
            i++;
        }

        do{
            System.out.println(c);
            c *= c;
        }while(c <= 1000000);


        for(int j = 1; j <= 100; j++){
            if((j % 3 == 0) && (j % 5 == 0)){
                System.out.println("FizzBuzz");
            }else if ((j % 3 == 0)){
                System.out.println("Fizz");
            }else if ((j % 5 == 0)){
                System.out.println("Buzz");
            }else{
                System.out.println(j);
            }
        }



        while(true){

            System.out.println("What number would you like to go up to?");
            int number = input.nextInt();
            input.nextLine();

            System.out.println("number | squared | cubed\n" +
                    "------ | ------- | -----");

            for(int j = 1; j <= number; j++){
                System.out.printf("%-7s| ", j);
                System.out.printf("%-8s| ", (j * j));
                System.out.printf("%-5s", (j * j * j));
                System.out.println();
            }

            System.out.println("Do you want to continue? y/n");
            String option = input.nextLine();

            if(!option.equalsIgnoreCase("y")){
                System.out.println("Ok, good bye");
                break;
            }

        }


        while(true) {

            System.out.println("Give me the grade");
            int grade = input.nextInt();
            input.nextLine();

            if (grade <= 100 && grade >= 88) {
                System.out.println("A");
            } else if (grade <= 87 && grade >= 80) {
                System.out.println("B");
            } else if (grade <= 79 && grade >= 67) {
                System.out.println("C");
            } else if (grade <= 66 && grade >= 60) {
                System.out.println("D");
            } else if (grade <= 59) {
                System.out.println("F");
            }

            System.out.println("Do you want to continue? y/n");
            String option = input.nextLine();

            if(!option.equalsIgnoreCase("y")){
                System.out.println("Ok, good bye");
                break;
            }
        }

    }

}