package ch1_string.p4_reversing_words;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 4. 단어 뒤집기
 * 숫자 n과 n개의 문자열을 입력받아, 각 문자열을 뒤집은 문자열을 출력하는 프로그램 작성
 */

public class MySolution {
    private static String[] solution(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        in.nextLine();
        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            words[i] = in.nextLine();
        }

        Arrays.stream(solution(words)).forEach(System.out::println);
    }
}

