package finalexam.task4;

public class Exhibition {
    // Core attributes of an exhibition
    private String name;
    private String startDate;
    private String endDate;

    // Constructor to initialize all fields
    public Exhibition(String name, String startDate, String endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getter methods for accessing private fields
    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    // Override equals method for proper object comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Exhibition that = (Exhibition) obj;
        return name.equals(that.name) && startDate.equals(that.startDate) && endDate.equals(that.endDate);
    }

    // Override hashCode for consistency with equals method
    @Override
    public int hashCode() {
        return name.hashCode() + startDate.hashCode() + endDate.hashCode();
    }

    // Override toString for meaningful string representation of the object
    @Override
    public String toString() {
        return "Exhibition{" +
                "name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}