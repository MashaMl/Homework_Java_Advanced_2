package Task5;

import com.sun.nio.sctp.SctpChannel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void fill(ArrayList<String> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings:");
        String temp = scanner.nextLine();
        while (!temp.equals("end")) {
            arrayList.add(temp);
            System.out.println("Next string:");
            temp = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        fill(arrayList);
        System.out.println(arrayList);

    }
}
