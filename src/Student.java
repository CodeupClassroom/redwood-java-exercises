/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class Student {
    private String name;
    private String cohort;

    // Guard
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }

    public boolean isEnrolled() {
        return cohort != null;
    }

    public String getCohort() {
        return cohort;
    }
}
