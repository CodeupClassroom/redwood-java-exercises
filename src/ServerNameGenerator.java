public class ServerNameGenerator {

    static String[] nouns = {"animal", "book", "computer"};
    static String[] adjs = {"pretty", "cold", "delicious"};

    public static void main(String[] args) {
        System.out.println(generateName());
    }

    public static String generateName(){
        int rnd = (int)(Math.random() * ((nouns.length ) ));
        int rnd2 = (int)(Math.random() * ((adjs.length ) ));

        return nouns[rnd] + "-" + adjs[rnd2];
    }



}
