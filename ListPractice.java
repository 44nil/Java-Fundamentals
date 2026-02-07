import java.util.ArrayList;

public class ListPractice{
    public static void main(String[] args) {
        //1. Definition:Creating a dynamic list of strings
        ArrayList<String> cities = new ArrayList<>(); // key is on stack, box is in Heap!

        //2. Adding elements (.add)
        cities.add("Aydin");
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Izmir");

        //3. Accesing elements (.get)
        System.out.println("First city in the list: " + cities.get(0));
        System.out.println("Total number of cities: " + cities.size());

        //4. Removing an element
        //We can remove by index or by object name
        cities.remove("Istanbul");
        System.out.println("Status: Istanbul has been removed.");

        //5. Updating an elemenet (.set)
        cities.set(0,"London"); //Replacing Aydın with London

        //6. Looping
        System.out.println("\n--- Current City List ---");
        for (String city: cities) {
            System.out.println("City name: " + city);
        }

        //7. check if a city exist
        if (cities.contains("Ankara")) {
            System.out.println("\nAnkara is still in the list! ✅");
        }

        //cities.add(35);
        // 8. Listeyi tamamen boşaltma
        cities.clear();
        System.out.println("\nAll cities cleared. Current size: " + cities.size());

    }
}
