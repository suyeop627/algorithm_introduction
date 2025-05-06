package ch1_string.p1_find_string;

import java.util.Scanner;

public class Main_before {
    private static int solution(String str, String letter) {
        int count = 0;

        char[] charArray = str.toLowerCase().toCharArray();
        char charLetter = letter.toLowerCase().charAt(0);

        for (char c : charArray){
            if (c == charLetter) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String letter = in.nextLine();

        System.out.println(solution(str, letter));
    }
}

