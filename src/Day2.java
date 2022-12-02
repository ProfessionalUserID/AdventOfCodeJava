import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day2 {

    public static void part1() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));
        int total = 0;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int loss = 0;
        int draw = 3;
        int win = 6;

        while (scan.hasNext()) {
            String line = scan.nextLine();

            System.out.println(line.charAt(0)+" "+line.charAt(2));

            char first = line.charAt(0);
            char second = line.charAt(2);

            char A = "A".charAt(0);
            char B = "B".charAt(0);
            char C = "C".charAt(0);
            char X = "X".charAt(0);
            char Y = "Y".charAt(0);
            char Z = "Z".charAt(0);


            if (first == A && second == X) {    //Rock + need to lose
                total += (scissors+loss);

            } else if (first == A && second == Y) { //Rock + need to draw
                total += (rock+draw);

            } else if (first == A && second == Z) { //Rock + need to win
                total += (paper+win);

            } else if (first == B && second == X) { //Paper + need to lose
                total += (rock+loss);

            } else if (first == B && second == Y) { //Paper + need to draw
                total += (paper+draw);

            } else if (first == B && second == Z) { //Paper + need to win
                total += (scissors+win);

            } else if (first == C && second == X) { //Scissors + need to lose
                total += (paper+loss);

            } else if (first == C && second == Y) { //Scissors + need to draw
                total += (scissors+draw);

            } else if (first == C && second == Z) { //Scissors + need to win
                total += (rock+win);

            } else {
                System.out.println("Something broke oopsie woopsie");
                break;
            }

        }
        System.out.print(total);
    }
        public static void main(String[] args) throws FileNotFoundException {
            part1();
        }
}
