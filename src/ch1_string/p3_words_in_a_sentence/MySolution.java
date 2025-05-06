package ch1_string.p3_words_in_a_sentence;

import java.util.Scanner;

/*
 * 3. 문장 속 단어
 * 하나의 문장 속에서 가장 긴 단어를 찾는 프로그램 작성
 * 단어는 공백으로 구분됨
 * 긴 단어가 여러개일 경우 가장 앞에 있는 단어 출력
 */
public class MySolution {
    private static String solution(String str) {
        String[] strArray = str.split(" ");
        int maxLength = 0;
        int index = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxLength) {
                maxLength = strArray[i].length();
                index = i;
            }
        }
        return strArray[index];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solution(str));
    }
}

