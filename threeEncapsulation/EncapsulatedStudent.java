package threeEncapsulation;

public class EncapsulatedStudent {
    private String name;
    private double gpa;
    private int year;

    // Constructor: Initializes the object using setters to ensure data integrity
    public EncapsulatedStudent(String name, double gpa, int year) {
        setName(name); // Validates name before assignment
        setGpa(gpa);
        setYear(year);
    }

    public void setName(String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
        } else {
            System.out.println("ERROR: Name cannot be empty!");
        }
    }

    public void setGpa(double newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            this.gpa = newGpa;
        } else {
            System.out.println("ERROR: Invalid note!");
        }
    }

    public void setYear(int newYear) {
        if (newYear >= 1 && newYear <= 6) {
            this.year = newYear;
        } else {
            System.out.println("ERROR: Invalid year");
        }
    }

    public static void main(String[] args) {
        EncapsulatedStudent esra = new EncapsulatedStudent("Esra Nil", 3.17, 4);

        //We now use getter to fetch data
        System.out.println("Student: " + esra.getName());
        System.out.println("Current GPA: " + esra.getGpa());

    }
    // Getters: Public "read-only" access to private fields
    
    // 1. name reading key
    public String getName() {
        return this.name;
    }

    // 2. GPA reading key
    public double getGpa() {
        return this.gpa;
    }

    // 3rd Grade (Year) reading key
    public int getYear() {
        return this.year;
    }
    
}


