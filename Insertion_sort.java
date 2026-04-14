package com;

public class Insertion_sort {
    public static void main(String[] args) throws Exception {
        System.out.println("Sebelum diurutkan\t: " + "78, 31, 22, 20, 14, 54, 19, 36, 13, 35");
        System.out.println("====================================================================");
        int[] x = { 78, 31, 22, 20, 14, 54, 19, 36, 13, 35 };
        int n = x.length;
        int temp = 0;

        for (int i = 1; i < n; i++) {
            System.out.print("Iterasi ke " + i + "\t\t: ");
            
            temp = x[i];
            int j = i - 1;
            
            while (j >= 0 && x[j] > temp) {
                x[j + 1] = x[j];
                j--;
            }
            x[j + 1] = temp;
            
            for (int o = 0; o < n; o++) {
                System.out.print(x[o] + (o == n - 1 ? "\n" : ", "));
            }
        }
    }
}    