package inheritance2;

public class Manager extends Employee {
    public String work() {
        return "Managing employees";
    }

    public void holdMeeting() {
        System.out.println("holding a meeeting....");
    }
}
