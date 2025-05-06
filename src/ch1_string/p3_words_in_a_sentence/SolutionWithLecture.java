package ch1_string.p3_words_in_a_sentence;

import java.util.Scanner;

/*
 * 3. 대소문자 변환
 * 대문자와 소문자가 함께 있는 문자열을 입력받아, 대문자는 소문자로, 소문자는 대문자로 변환하는 프로그램 작성
 * 문자열은 알파벳으로만 구성
 */
public class SolutionWithLecture {
    private static String solution1(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    private static String solution2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        if (str.length() > m) answer = str;

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solution1(str));
        System.out.println(solution2(str));
    }
}

