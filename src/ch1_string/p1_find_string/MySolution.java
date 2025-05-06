package ch1_string.p1_find_string;

import java.util.Scanner;
/*
 * 1. 문자 찾기
 * 문자열과 특정 문자를 입력받아, 문자열에 해당 문자가 몇 개 존재하는지 알아내는 프로그램 작성
 * 영어 알파벳으로만 구성되어 있으며, 대소문자 구분하지 않음
 */
public class MySolution {
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

