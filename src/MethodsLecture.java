public class MethodsLecture {

    public static void main(String[] args) {
        System.out.println(add(1,2));
        sayHello("Luis", 27);
        sayHello("Fer", "01/01/1999");


//        for(int i = 0; i < 10 ; i++){
//            System.out.println("i = " + i);
//        }

        counter(0);

    }

    public static void counter(int i){

        System.out.println("i = " + i);

        i++;

        if(i == 10){
            return;
        }

        counter(i);
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static void sayHello(String name, int age){
        System.out.println("Hello " + name + " age " + age);
    }

    public static void sayHello(){
        System.out.println("Hi there,");
    }

    public static void sayHello(String name, String dob){
        System.out.println("Hello " + name + " DOB: " + dob);
    }

}