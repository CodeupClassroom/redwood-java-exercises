package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student fer = new Student("Fer");
        Student zach = new Student("Zach");

        System.out.println(fer.getName());
        System.out.println(zach.getName());

        fer.addGrade(10);
        fer.addGrade(9);
        fer.addGrade(8);
        fer.addGrade(7);

        zach.addGrade(7);
        zach.addGrade(8);
        zach.addGrade(10);
        zach.addGrade(10);

        System.out.println(fer.getGradeAverage());
        System.out.println(zach.getGradeAverage());

        // Add students to the map
        students.put("fmendozaro", fer);
        students.put("zgulde", zach);


        for(String key : students.keySet()){
            Student curStudent = students.get(key);
            System.out.println("Name: "+ curStudent.getName() +" - Gihub Username: "+key+"\n" +
                    "Current Average: "+ curStudent.getGradeAverage() +"\n");
        }



    }

}
