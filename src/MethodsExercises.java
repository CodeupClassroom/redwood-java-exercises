import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        game101(scan);
//
//        System.out.print("Provide the number of sides; ");
//        rollDice(getInteger(1,10, scan), scan);

//        factorial(getInteger(1, 10, scan));

//        getInteger(1, 10);

        double sumResult = add(2.5,4);
        System.out.println(sumResult);

        System.out.println(sub(sumResult, 5));
        System.out.println(multiply(sumResult, 5));
        System.out.println(divide(sumResult, 5));



    }

    public static double add(double n, double m){
        return n + m;
    }

    public static double sub(double n, double m){
        return n - m;
    }

    public static double multiply(double n, double m){
        return n * m;
    }

    public static double divide(double n, double m){
        return n / m;
    }

    public static int getInteger(int min, int max, Scanner scan){

        System.out.println("Give me an Integer between " + min + " and  " + max);
        int input = Integer.parseInt(scan.nextLine());

        if(input < min || input > max){
            System.out.println("Outside of the limit");
            getInteger(min, max, scan);
        }else{
            System.out.println("Valid input");
            return input;
        }

        return 0;
    }

    public static void factorial(int number){
        int acum = 1;
        String details = "";
        for(int i = 1; i <= number; i++){
            details += (i == 1) ? i : " x " + i;
            System.out.println( i +"! = " + details + " = " + ( acum *= i ) );
        }

    }

    public static void rollDice(int sides, Scanner input){

        while(true){
            System.out.println("Type roll to start");
            String usersInput = input.nextLine();

            if(usersInput.trim().equalsIgnoreCase("roll")){
                System.out.println("dices: " + generateRandom(1, sides) + " " + generateRandom(1, sides));
            }else{
                System.out.println("Not a valid option, exiting...");
                break;
            }
        }

    }

    public static int generateRandom(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static void game101(Scanner scan){

        int random = generateRandom(1, 100);
        int number = 0;
        System.out.println("random" + random);

        while(true){

            number = getInteger(1, 100, scan);

            if(number < random){
                System.out.println("Higher");
            }else if(number > random){
                System.out.println("Lower");
            }else if(number == random){
                System.out.println("You guessed right!");
                break;
            }

        }


    }

}
