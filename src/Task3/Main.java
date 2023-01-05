package Task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static LinkedList<Integer> getIntegerList(LinkedList linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of LinkedList:");
        int N = scanner.nextInt();
        for(int i = 0; i < N; ++i) {
            System.out.println("Enter " + (i + 1) + " number:");
            linkedList.add(scanner.nextInt());
        }
        return linkedList;
    }
    public static int getMinimum(LinkedList<Integer> linkedList) {
        int min = linkedList.get(0);
        for(int i = 0; i < linkedList.size(); ++i) {
            if(min > linkedList.get(i))
                min = linkedList.get(i);
        }
        return min;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        getIntegerList(linkedList);
        System.out.println(linkedList);
        System.out.println(getMinimum(linkedList));

    }
}
