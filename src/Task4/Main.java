package Task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void fill(ArrayList<String> cityAndResident) {
        System.out.println("Enter the size of collection: ");

        Scanner scanner = new Scanner(System.in);
        int size = (scanner.nextInt());
        for(int i = 0; i < size; ++i) {
            System.out.println("Enter the city: ");
            cityAndResident.add(scanner.next());
            System.out.println("Enter the surname of resident:");
            cityAndResident.add(scanner.next());
        }




    }
    public static void printPair(ArrayList<String> cityAndResident) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city to see the resident: ");
        String city = scanner.nextLine();
        int index = 0;
        for(int i = 0; i < cityAndResident.size(); ++i) {
            if(cityAndResident.get(i).equals(city))
                index = i;
            }
        if(index == 0) {
            System.out.println("We can't find this city in collection. Please reenter the city name.");
            printPair(cityAndResident);
        }
        if(index != 0)
            System.out.println("In " + cityAndResident.get(index) + " lives " + cityAndResident.get(index + 1));
    }

    public static void main(String[] args) {
        ArrayList<String> cityAndResident = new ArrayList<>();
        fill(cityAndResident);
        printPair(cityAndResident);

    }
}
