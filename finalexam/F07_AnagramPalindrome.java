package finalexam;
import java.util.*;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] freq = new int[26]; 
        countLetters(input.toLowerCase(), 0, freq); 

        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 == 1) oddCount++;
        }

        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }

        sc.close();
    }

    
    public static void countLetters(String str, int index, int[] freq) {
        if (index >= str.length()) return;

        char c = str.charAt(index);
        if (c >= 'a' && c <= 'z') {
            freq[c - 'a']++;
        }

        countLetters(str, index + 1, freq); 
    }
}

