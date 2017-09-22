import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        factorial(getInteger(1, 10));

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

    public static int getInteger(int min, int max){

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an Integer between " + min + " and  " + max);
        int input = Integer.parseInt(scan.nextLine());

        if(input < min || input > max){
            System.out.println("Outside of the limit");
            getInteger(min, max);
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

}
