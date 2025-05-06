package ch1_string.p3_words_in_a_sentence;

import java.util.Scanner;

/*
 * 1. 문장 속 단어
 * 하나의 문장 속에서 가장 긴 단어를 찾는 프로그램 작성
 * 단어는 공백으로 구분됨
 * 긴 단어가 여러개일 경우 가장 앞에 있는 단어 출력
 */
public class MySolution {
    private static String solution1(String str) {
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
            str = str.substring(pos+1);
        }

        if(str.length() > m) answer = str;

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solution1(str));
        System.out.println(solution2(str));
    }
}

