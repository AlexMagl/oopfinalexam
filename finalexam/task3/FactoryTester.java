package finalexam.task3;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        // Add some staff
        factory.addPerson(new Person("John", "Doe", "123456789"));
        factory.addPerson(new Person("Jane", "Smith", "987654321"));

        System.out.println("Initial staff:");
        factory.printStaff();

        // Save staff to file
        factory.saveStaffToFile();

        // Clear the staff and add a new person
        factory.deletePerson(new Person("John", "Doe", "123456789"));
        factory.addPerson(new Person("Alice", "Johnson", "456789123"));

        System.out.println("\nModified staff:");
        factory.printStaff();

        // Load staff from file
        factory.loadStaffFromFile();

        System.out.println("\nStaff after loading from file:");
        factory.printStaff();
    }
}