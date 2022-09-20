package javacurs.homework.course08.exercises.ex2;

public class Programmer extends Employee {
    String language;

    public Programmer() {
        System.out.println("Calling Programmer() constructor");
    }

    @Override
    public String getPosition() {
        return "Programmer";
    }
}
