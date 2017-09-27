package inheritance;

import superclasses.Person;

public class Baby extends Person {

    public Baby(String name) {
        super(name);
    }

    public void cry(){
        System.out.println("NYAAAA!");
    }

}
