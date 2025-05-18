package JavaDenaryConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Please only enter numbers from 0 - 255");
        Scanner scan = new Scanner(System.in);
        while (true){
        System.out.println("Enter a denary number to convert to binary: ");
        String denarynumber = scan.nextLine();
        if (denarynumber.equals("exit")) {
            break;
        }
        int casteddenary = Integer.parseInt(denarynumber);
        System.out.println(denarynumber + " in 8-bit binary is: " + sortarray(converter(casteddenary)));
        Thread.sleep(1000);
        }
    }

    public static ArrayList converter(int denary) {
        int remainder;
        ArrayList remainders = new ArrayList<Integer>();
        while (true) {
            if (denary != 0) {
                remainder = denary % 2;
                remainders.add(remainder);
                denary = denary / 2;
                if (denary < 1) {
                    break;
                }
            } else if (denary <= 1) {
                System.out.println(denary);
                break;
            } else {
                System.out.println("Error");
                break;
            }
        }
        return remainders;
    }

    public static ArrayList sortarray(ArrayList unsortedArray) {
        ArrayList sortedArray = new ArrayList<Integer>(unsortedArray);
        Collections.reverse(sortedArray);
        while (sortedArray.size() != 8) {
            sortedArray.add(0, 0);
        }
        return sortedArray;
    }
}