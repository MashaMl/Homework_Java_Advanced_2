package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void doubleValues(ArrayList obj) {
        for(int i = 0; i < obj.size(); i++) {
            obj.add(i+1, obj.get(i));
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < 5; ++i) {
            System.out.println("Enter " + (i + 1) + " word:");
            arrayList.add(scanner.nextLine());
        }
        doubleValues(arrayList);
        System.out.println(arrayList);
    }
}
