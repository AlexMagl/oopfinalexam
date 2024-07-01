package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArtGallery implements LegalEntity {
    private String name;
    private String address;
    private String vatNumber;
    private List<Exhibition> exhibitions;
    private static final String FILE_NAME = "exhibitions.txt";

    public ArtGallery(String name, String address, String vatNumber) {
        this.name = name;
        this.address = address;
        this.vatNumber = vatNumber;
        this.exhibitions = new ArrayList<>();
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addExhibition(Exhibition exhibition) {
        if (exhibition != null && !exhibitions.contains(exhibition)) {
            exhibitions.add(exhibition);
        }
    }

    public boolean removeExhibition(Exhibition exhibition) {
        return exhibitions.remove(exhibition);
    }

    public void printExhibitions() {
        for (Exhibition e : exhibitions) {
            System.out.println(e);
        }
    }

    public int getExhibitionCount() {
        return exhibitions.size();
    }

    public void saveExhibitionsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Exhibition e : exhibitions) {
                writer.write(e.getName() + "," + e.getStartDate() + "," + e.getEndDate());
                writer.newLine();
            }
            System.out.println("Exhibitions saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving exhibitions: " + e.getMessage());
        }
    }

    public void loadExhibitionsFromFile() {
        exhibitions.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    exhibitions.add(new Exhibition(parts[0], parts[1], parts[2]));
                }
            }
            System.out.println("Exhibitions loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading exhibitions: " + e.getMessage());
        }
    }
}