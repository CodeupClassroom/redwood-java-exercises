package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student fer = new Student("Fer");
        Student zach = new Student("Zach");
        Student ben = new Student("Ben");
        Student ryan = new Student("Ryan");

        fer.addGrade(10);
        fer.addGrade(9);
        fer.addGrade(8);
        fer.addGrade(7);

        zach.addGrade(7);
        zach.addGrade(8);
        zach.addGrade(10);
        zach.addGrade(10);

        ben.addGrade(10);
        ben.addGrade(5);
        ben.addGrade(10);
        ben.addGrade(10);

        ryan.addGrade(10);
        ryan.addGrade(10);
        ryan.addGrade(10);
        ryan.addGrade(6);

        // Add students to the map
        students.put("fmendozaro", fer);
        students.put("zgulde", zach);
        students.put("ryanh", ryan);
        students.put("bens", ben);

        while(true){

            System.out.println("1.- View all info students");
            System.out.println("2.- View all names");
            System.out.println("3.- Which student:");
            System.out.println("4.- Exit");

            int option = input.getInt(1, 4);

            switch (option){
                case 1:
                    printAll(students, "info");
                    break;
                case 2:
                    printAll(students, "names");
                    break;
                case 3:
                    // view names
                    System.out.println("Give me the username:");
                    printOne(students, input.getString());
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

            System.out.println("Would you like to continue?");
            if(!input.yesNo()){
                break;
            }
        }

    }

    public static void printAll(HashMap<String, Student> students, String option){

        for(String key : students.keySet()){

            Student curStudent = students.get(key);

            if(option.equals("info")){
                System.out.println("Name: "+ curStudent.getName() +" - Gihub Username: "+key+"\n" +
                        "Current Average: "+ curStudent.getGradeAverage() +"\n");
            }else if(option.equals("names")){
                System.out.print("|" + curStudent.getName() + "| ");
            }

        }
        System.out.println();
    }

    public static void printOne(HashMap<String, Student> students, String username){
        Student one = students.get(username);

        System.out.println("Name: "+ one.getName() +" - Gihub Username: "+username+"\n" +
                "Current Average: "+ one.getGradeAverage() +"\n");

    }

}
