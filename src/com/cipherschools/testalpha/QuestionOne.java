package com.cipherschools.testalpha;

import java.util.Scanner;

public class QuestionOne {
    static String S;
    static int CASH, N, A, B;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        N = sc.nextInt ();
        S = sc.next ();
        CASH = sc.nextInt ();
        A = sc.nextInt ();
        B = sc.nextInt ();
        if (A < B) {
            swap();
            flip();
        } else {
            flip();
            swap();
        }
        System.out.println (Integer.parseInt (S, 2));
    }
    static void flip() {
        char s[] = S.toCharArray ();
        int i = 0;
        for (int a = 0; a < s.length; a++)
            if (s[a] == '1') {
                i = a;
                break;
            }
        while (CASH >= B) {
            if (i == s.length)
                break;
            if (s[i] == '1') {
                s[i] = '0';
                i++;
                CASH -= B;
            }
        }
        S = new String (s);
    }
    static void swap() {
        char s[] = S.toCharArray ();
        int i = 0;
        for (int a = 0; a < s.length; a++)
            if (s[a] == '1') {
                i = a;
                break;
            }
        int j = s.length - 1;
        while (j > i) {
            if (CASH < A)
                break;
            if (s[j] == '0') {
                if (s[i] == '0')
                    i++;
                else {
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    CASH -= A;
                    j--;
                }
            }
            else
                j--;
        }
        S = new String (s);
    }
}
