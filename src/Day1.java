import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day1 {

    public static void part1(){
        System.out.println("Day 1, Part 1!");
        File inputFile = new File("input.txt");
        try {
            ArrayList<Integer> cal = new ArrayList<Integer>();
            ArrayList<Integer> totals = new ArrayList<Integer>();
            Scanner scan = new Scanner(inputFile);
            int placeWithinArrayForCal = 0;  //Place within Array for cal
            int placeWithinArrayForTotals = 0;  //Place within Array for totals
            String o = "";
            int finalTotalNumber = 0;
            while (scan.hasNext()){
                o = scan.nextLine();
                if (o.equals("")){ //When end of block
                    int totalOfSomethingIForgor = 0;
                    for (int i : cal){      //Counts total of each block
                        totalOfSomethingIForgor = totalOfSomethingIForgor + i;
                    }
                    totals.add(totalOfSomethingIForgor);     //Final list of totals
                }
                else {
                    cal.add(placeWithinArrayForCal, Integer.parseInt(o)); //Sets each calorie count
                    placeWithinArrayForCal++;
                }
                for (int p = 0; p < totals.size(); p++){
                    if (totals.get(p) > totals.get(p+1)){
                        finalTotalNumber = totals.get(p);
                    }
                }
                placeWithinArrayForTotals++;
                System.out.println(finalTotalNumber);
            }

            scan.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void part1mk1() throws FileNotFoundException {
        ArrayList<Integer> calories = new ArrayList<Integer>();
        int cal = 0;
        Scanner scan = new Scanner(new File("input.txt"));
        while (scan.hasNext())
        {
            String blah = scan.nextLine();
            if (blah.isBlank())
            {
                calories.add(cal);
                cal = 0;
            }
            else
            {
                cal += Integer.parseInt(blah);

            }

        }
        Collections.sort(calories);
        int x = calories.get(calories.size()-1);
        x += calories.get(calories.size()-2);
        x += calories.get(calories.size()-3);
        System.out.print(x);
    }

    public static void main(String[] args) throws FileNotFoundException {
        part1mk1();
    }
}
