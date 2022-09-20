package javacurs.homework.course08.exercises.ex2;

public class DatabaseAdmin extends Employee {
    String dbTechnology;

    public DatabaseAdmin() {
        System.out.println("Calling DatabaseAdmin() constructor");
    }

    @Override
    public String getPosition() {
        return "DB Admin: " + super.getPosition();
    }
}
