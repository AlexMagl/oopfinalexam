package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArtGallery implements LegalEntity {
    // Core attributes of an art gallery
    private String name;
    private String address;
    private String vatNumber;
    private List<Exhibition> exhibitions;
    private static final String FILE_NAME = "exhibitions.txt";

    // Constructor to initialize the gallery with legal entity information
    public ArtGallery(String name, String address, String vatNumber) {
        this.name = name;
        this.address = address;
        this.vatNumber = vatNumber;
        this.exhibitions = new ArrayList<>();
    }

    // Implementation of LegalEntity interface methods
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    // Method to add a new exhibition to the gallery
    public void addExhibition(Exhibition exhibition) {
        if (exhibition != null && !exhibitions.contains(exhibition)) {
            exhibitions.add(exhibition);
        }
    }

    // Method to remove an exhibition from the gallery
    public boolean removeExhibition(Exhibition exhibition) {
        return exhibitions.remove(exhibition);
    }

    // Method to print all exhibitions in the gallery
    public void printExhibitions() {
        for (Exhibition e : exhibitions) {
            System.out.println(e);
        }
    }

    // Method to get the total number of exhibitions
    public int getExhibitionCount() {
        return exhibitions.size();
    }

    // Method to save all exhibitions to a file
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

    // Method to load exhibitions from a file
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