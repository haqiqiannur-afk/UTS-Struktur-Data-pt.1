package com;

public class Bubble_sort {
    public static void main(String[] args) throws Exception {
        System.out.println("Sebelum diurutkan\t: " + "78, 31, 22, 20, 14, 54, 19, 36, 13, 35");
        System.out.println("====================================================================");
        int[] x = { 78, 31, 22, 20, 14, 54, 19, 36, 13, 35 };
        int n = x.length;
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            System.out.print("Iterasi ke " + (i + 1) + "\t\t: ");
            
            for (int j = 0; j < n - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
            
            for (int o = 0; o < n; o++) {
                System.out.print(x[o] + (o == n - 1 ? "\n" : ", "));
            }
        }
    }
}