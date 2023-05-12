package edu.csp.petdatabase;

// This class will print a formatted table displaying
// 
public class Table {
    public static void printTable(Pet[] pets) {
        System.out.println();
        
        printHeader();
        
        printBody(pets);
        
        printFooter(pets);
        
        System.out.println();
    }
    
    // This method prints the formatted table header
    private static void printHeader() {
        System.out.println("+-------------------------+");
        System.out.printf("| %-3s | %-10s | %4s |%n",
                "ID", "NAME", "AGE");
        System.out.println("+-------------------------+");
    }
    
    // This method prints the formatted table rows
    // that make up the table body
    private static void printBody(Pet[] pets) {
        for (int i = 0; i < pets.length; i++) {
            System.out.printf("| %-3s | %-10s | %4d |%n"
                    , i, pets[i].getName()
                    ,  pets[i].getAge());
        }
    }
    
    // This method prints the formatted table footer
    private static void printFooter(Pet[] pets) {
        System.out.println("+-------------------------+");
        System.out.printf("%s rows in set.\n", pets.length);
    }
}