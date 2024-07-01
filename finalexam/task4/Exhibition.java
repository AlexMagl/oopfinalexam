package finalexam.task4;

public class Exhibition {
    private String name;
    private String startDate;
    private String endDate;

    public Exhibition(String name, String startDate, String endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Exhibition that = (Exhibition) obj;
        return name.equals(that.name) && startDate.equals(that.startDate) && endDate.equals(that.endDate);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + startDate.hashCode() + endDate.hashCode();
    }

    @Override
    public String toString() {
        return "Exhibition{" +
                "name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}