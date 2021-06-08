package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // khai báo số dòng và số cột của ma trận
        int m, n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();
        // khai báo ma trận A có m dòng, n cột
        int[][] arr = new int[m][n];
        System.out.println("enter number in arr:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "]= ");
                arr[i][j] = scanner.nextInt();
            }
        }
        // tìm phần tử có giá trị nhỏ nhất trong ma trận
        // giả sử phần tử tại vị trí (0,0) là phần tử nhỏ nhất
        int min = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("min in  arr = " + min);
    }
}
