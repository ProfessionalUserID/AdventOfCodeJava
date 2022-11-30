import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void task(){
        System.out.println("task1");
        File inputFile = new File("input.txt");
        try {
        Scanner scan = new Scanner(inputFile);
        while (scan.hasNext()){
            String x = scan.nextLine();
            System.out.println(x);
        }
        scan.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    }




    public static void main(String[] args) {
        System.out.println("Initialising");
        task();
    }
}