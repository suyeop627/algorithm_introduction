package ch1_string.p1_find_string;

import java.util.Scanner;

public class Main_after {
    public int solution1(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==t)answer++;
        }

        return answer;
    }

    public int solution2(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){
            if(x==t)answer++;
        }

        return answer;
    }




    public static void main(String[] args){
        Main_after T = new Main_after();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char c = scan.next().charAt(0);
        System.out.println("solution1 = " + T.solution1(str, c));
        System.out.println("solution2 = " + T.solution2(str, c));
    }
}
