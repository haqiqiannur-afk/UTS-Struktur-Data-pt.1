package com;
public class Selection_sort {
    public static void main(String[] args) throws Exception {
        System.out.println("Sebelum diurutkan\t: " + "78, 31, 22, 20, 14, 54, 19, 36, 13, 35");
        System.out.println("====================================================================");
        int[] x = { 78, 31, 22, 20, 14, 54, 19, 36, 13, 35 };
        int n = x.length;
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            System.out.print("Iterasi ke " + (i + 1) + "\t\t: ");
            
            for (int j = i + 1; j < n; j++) {
                if (x[j] < x[min]) {
                    min = j;
                }
            }
            
            if (min != i) {
                temp = x[i];
                x[i] = x[min];
                x[min] = temp;
            }
            
            for (int o = 0; o < n; o++) {
                System.out.print(x[o] + (o == n - 1 ? "\n" : ", "));
            }
        }
    }
}