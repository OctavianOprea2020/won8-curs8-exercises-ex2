package javacurs.homework.course08.exercises.ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employee():");
        Employee employee = new Employee();
        employee.setPosition("Support Staff");
        System.out.println("Employee's Position is '" + employee.getPosition() + "'");

        System.out.println("");
        System.out.println("Programmer():");
        Programmer programmer = new Programmer();
        System.out.println("Programmer's Position is '" + programmer.getPosition() + "'");

        System.out.println("");
        System.out.println("DatabaseAdmin():");
        DatabaseAdmin databaseAdmin = new DatabaseAdmin();
        databaseAdmin.setPosition("Database Analyst");
        System.out.println("Database Administrator's Position is '" + databaseAdmin.getPosition() + "'");
    }
}
