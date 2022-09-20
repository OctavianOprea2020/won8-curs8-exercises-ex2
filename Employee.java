package javacurs.homework.course08.exercises.ex2;

import java.time.LocalDateTime;

public class Employee implements Person {
    LocalDateTime dateOfEmployment;
    String position;

    public Employee() {
        System.out.println("Calling Employee() constructor");
    }

    public void setDateOfEmployment(LocalDateTime dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public LocalDateTime getBirthday() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }
}
