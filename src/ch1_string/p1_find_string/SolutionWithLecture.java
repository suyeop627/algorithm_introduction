package ch1_string.p1_find_string;

import java.util.Scanner;

/*
 * 1. 문자 찾기
 * 문자열과 특정 문자를 입력받아, 문자열에 해당 문자가 몇 개 존재하는지 알아내는 프로그램 작성
 * 영어 알파벳으로만 구성되어 있으며, 대소문자 구분하지 않음
 */
public class SolutionWithLecture {
    public int solution1(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) answer++;
        }

        return answer;
    }

    public int solution2(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        SolutionWithLecture T = new SolutionWithLecture();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char c = scan.next().charAt(0);
        System.out.println("solution1 = " + T.solution1(str, c));
        System.out.println("solution2 = " + T.solution2(str, c));
    }
}
