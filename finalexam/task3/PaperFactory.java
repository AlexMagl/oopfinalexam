package finalexam.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();
    private static final String FILE_NAME = "staff.txt";

    public void addPerson(Person p) {
        if (p != null && !staff.contains(p)) {
            staff.add(p);
        }
    }

    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    public void printStaff() {
        for (Person p : staff) {
            System.out.println(p);
        }
    }

    public int getStaffCount() {
        return staff.size();
    }

    public void saveStaffToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Person p : staff) {
                writer.write(p.name + "," + p.surname + "," + p.personalNumber);
                writer.newLine();
            }
            System.out.println("Staff list saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving staff list: " + e.getMessage());
        }
    }

    public void loadStaffFromFile() {
        staff.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    staff.add(new Person(parts[0], parts[1], parts[2]));
                }
            }
            System.out.println("Staff list loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading staff list: " + e.getMessage());
        }
    }
}