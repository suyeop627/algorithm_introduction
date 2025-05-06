package ch1_string.p2_case_conversion;

import java.util.Scanner;

/*
 * 2. 대소문자 변환
 * 대문자와 소문자가 함께 있는 문자열을 입력받아, 대문자는 소문자로, 소문자는 대문자로 변환하는 프로그램 작성
 * 문자열은 알파벳으로만 구성
 */
public class MySolution {
    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solution(str));
    }
}

