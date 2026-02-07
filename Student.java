/*
 * BREAKING DOWN THE OBJECT CREATION:
 * Student mySelf = new Student();
 * * 1. Student  -> DATA TYPE (The Blueprint): Tells the compiler what kind of object this is.
 * 2. mySelf   -> REFERENCE NAME (The Key): Stored on the STACK. It holds the "address" of the object.
 * 3. =        -> ASSIGNMENT: Connects the key to the box in the warehouse.
 * 4. new      -> MEMORY ALLOCATOR: The most critical word! It commands Java to "Allocate space in the HEAP."
 * 5. Student()-> CONSTRUCTOR: A special method that initializes the new object in the Heap.
 * * RESULT: You have a "Key" on your desk (Stack) that points to a "Box" in the warehouse (Heap).
 */



public class Student {
    String name;
    String university;
    double gpa;
    boolean isSenior;

    public Student(String name, String university, double gpa ) {
    this.name = name;
    this.university = university;
    this.gpa = gpa;
    }

    public void study() {
        System.out.println(name + " is studying for the Engineering exams...");
    }


    public static void main(String[] args) {
        //1. create an object
        Student esra = new Student("Esra Nil", "KGTU", 3.17);

        esra.isSenior = true;
        esra.study();

        Student copyEsra = esra;
        copyEsra.name = "Ayşe";

        System.out.println("Current Name: " + esra.name); //ayşe yazmalı 
        
    }
    

}
