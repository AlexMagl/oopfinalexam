package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        Person person1 = new Person("John", "Doe", "123456789");
        Person person2 = new Person("Jane", "Smith", "987654321");

        factory.addPerson(person1);
        factory.addPerson(person2);

        System.out.println("Factory staff:");
        factory.printStaff();

        System.out.println("\nDeleting John Doe:");
        if (factory.deletePerson(person1)) {
            System.out.println("Person deleted successfully");
        } else {
            System.out.println("Person not found");
        }

        System.out.println("\nUpdated factory staff:");
        factory.printStaff();
    }
}