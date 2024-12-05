package net.datastructures;

public class SkipListDriver {
    public static void main(String[] args) {
        // Create a SkipList instance
        SkipList skipList = new SkipList();

        // Set the height to 4 
        System.out.println("Adding entries to the SkipList...");

        // Insert some entries
        skipList.put("1", 10);
        skipList.put("2", 20);
        skipList.put("3", 30);
        skipList.put("4", 40);

        // Print the SkipList structure
        System.out.println("\nHorizontal representation of SkipList:");
        skipList.printHorizontal();

        // Search for a specific value (e.g., "3")
        System.out.println("\nSearching for key '3':");
        SkipListEntry result = skipList.findEntry("3");
        if (result != null && result.key.equals("3")) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Key '3' not found.");
        }
    }
}
