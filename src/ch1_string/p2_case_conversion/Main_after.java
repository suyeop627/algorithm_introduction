package ch1_string.p2_case_conversion;

import java.util.Scanner;

public class Main_after {
    private static String solution1(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }


    //대문자 아스키 넘버 범위 : 65~90
    //소문자 아스키 넘버 범위 : 97~122
    private static String solution2(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (x >= 65 && x <= 90) answer += (char)(x + 32);//대문자 -(아스키넘버 + 32)-> 소문자
            else answer += (char)(x - 32);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solution1(str));
        System.out.println(solution2(str));
    }
}

