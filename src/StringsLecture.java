public class StringsLecture {
    public static void main(String[] args) {
        String name = " Fernando ";
        name = name.trim();

        if(name.equalsIgnoreCase("fernando")){
            System.out.println("They are the same");
        }else{
            System.out.println("They are not the same");
        }

        char letter = 'T';

        if(name.startsWith(String.valueOf(letter))){
            System.out.println("Starts with F");
        }else{
            System.out.println("Doesn't start with " + letter);
        }

        String lastTwo = "do";

        if(name.endsWith(lastTwo)){
            System.out.println("ends with " + lastTwo);
        }

        int index = name.indexOf('n');
        System.out.println("index of n is " + index);

        System.out.println(name.charAt(index));
        System.out.println(name);

        // Looks for how many 'n' they are in the String
        int counter = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'n'){
                counter++;
            }
        }
        System.out.println("Counter: " + counter);

        String newName = name.replace('n', 'N');
        System.out.println(newName);

        String nickName = name.substring(3, name.length());
        System.out.println(nickName.toUpperCase());



    }
}
