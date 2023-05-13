package edu.csp.petdatabase;

/*
This class displays a list of Pet objects in a
nicely formatted table
*/
public class Table {
    public static void printTable(PetList pets) {
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
    private static void printBody(PetList pets) {
        for (int i = 0; i < pets.size(); i++) {
            System.out.printf("| %-3s | %-10s | %4d |%n"
                    , i, pets.get(i).getName()
                    ,  pets.get(i).getAge());
        }
    }
    
    // This method prints the formatted table footer
    private static void printFooter(PetList pets) {
        System.out.println("+-------------------------+");
        System.out.printf("%s rows in set.\n", pets.size());
    }
}