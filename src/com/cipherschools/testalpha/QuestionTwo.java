package com.cipherschools.testalpha;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int M = sc.nextInt ();
        int base= 2;
        while (!convertBase(M, base))
            base++;
        System.out.println (base);
    }
    static boolean convertBase (int M, int base) {
        int remainder = M % base;
        M /= base;
        while (M >= base && (M % base == remainder))
            M /= base;
        return M == remainder;
    }
}
