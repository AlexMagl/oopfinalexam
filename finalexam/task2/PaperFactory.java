package finalexam.task2;

import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

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
}