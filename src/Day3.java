import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day3 {

    public static void part1() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));
        ArrayList<Character> lower = new ArrayList<>();
        ArrayList<Character> upper = new ArrayList<>();

        HashMap<Character, Integer> lowerCase = new HashMap<>();
        HashMap<Character, Integer> upperCase = new HashMap<>();

        char c;
        int count = 0;

        for (c = 'a'; c <= 'z'; ++c){
            lowerCase.put(c, count);
            count++;
        }
        for (c = 'A'; c <= 'Z'; ++c) {
            upperCase.put(c, count);
            count++;
        }





    }


    public static void main(String[] args) throws FileNotFoundException{
        part1();
    }
}
