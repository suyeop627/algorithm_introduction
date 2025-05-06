package ch1_string.p4_reversing_words;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 4. 단어 뒤집기
 * 숫자 n과 n개의 문자열을 입력받아, 각 문자열을 뒤집은 문자열을 출력하는 프로그램 작성
 */

public class SolutionWithLecture {
    private static ArrayList<String> solution1(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    private static ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            //왼쪽 문자와 대응되는 오른쪽 문자를 서로 교환하면서 각 인덱스를 중앙에 가까워지도록 이동
            //lt==rt(배열 길이가 홀수)이거나  lt > rt (배열 길이가 짝수)일 경우 루프 종료
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }

        for (String x : solution1(n, str)) {
            System.out.println(x);
        }

        for (String x : solution2(n, str)) {
            System.out.println(x);
        }
    }
}

