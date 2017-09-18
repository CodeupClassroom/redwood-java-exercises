/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class HelloWorld {
    /* psvm
     * Entry point
     */
    public static void main(String[] args) {
        // sout
        // general sytax: type identifier;
        // 3 types of integers
        byte byteNumber;
        byteNumber = 2;
        short shortNumber = 0;
        int intNumber = 1;
        long longNumber = 10;

        // floating point numbers
        float floatNumber = 2.1f;
        double doubleNumber = 10.5;

        char singleCharacter = 'L';

        // Wrapper
        //Boolean booleanValue = true;
        boolean booleanValue = true;

        String name = "Redwwod"; // always double quotes

        // const MY_CONSTANT = 4;
        final int MY_CONSTANT = 4;

        System.out.println(3 + 4);
        System.out.println(3 - 4);
        System.out.println(3 * 4);
        float division = 3.0f / 4;
        System.out.println(division);
        System.out.println(3 % 4);
        int x = 5;
        System.out.println(x++); // 5
        System.out.println(++x); // 7
        System.out.println(x--); // 7
        System.out.println(--x); // 5

        x += 3; // 8
        System.out.println(x);
        x %= 2; //
        System.out.println(x);


        // It is only valid if the value on the right is smaller than the type on the left
        double aDoubleNumber = 10; // from int to double
        System.out.println(aDoubleNumber);

        //explicit type casting
        // type variable = (type) aBiggerTypeVariable
        int aIntegerNumber = (int) aDoubleNumber;


        System.out.println("Hello world!");
        System.out.println("Hello Redwood!");
    }
}
