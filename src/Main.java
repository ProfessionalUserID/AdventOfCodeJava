import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void task(){
        System.out.println("task1");
        File inputFile = new File("input.txt");
        try {
            int total = 0;
        Scanner scan = new Scanner(inputFile);
        while (scan.hasNext()){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x > y){
                total++;
            }

        }
        System.out.println(total);
        scan.close();
    }
        catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

    }




    public static void main(String[] args) {
        System.out.println("Initialising");
        task();
    }
}