package com.gl.paymoney;

import java.util.Arrays;
import java.util.Scanner;

public class PayMoneyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the transaction array:");
        int size = sc.nextInt();
        
        System.out.println("Enter the values of the array:");
        int[] transactions = new int[size];
        for (int i = 0; i < size; i++) {
            transactions[i] = sc.nextInt();
        }
        System.out.println("Given Transactional Array: "+Arrays.toString(transactions));
        System.out.println("Enter the total number of targets that need to be achieved:");
        int numTargets = sc.nextInt();
        
        for (int t = 0; t < numTargets; t++) {
            System.out.println("Enter the value of target:");
            int target = sc.nextInt();
            
            int sum = 0;
            for (int j = 0; j < transactions.length; j++) {
                sum += transactions[j];
                 
                if (sum >= target) {
                    System.out.println("Target achieved after " + (j+1) + " transactions");
                    break;
                }
            }
            
            if (sum < target) {
                System.out.println("Given target is not achieved");
            }
        }
        
        sc.close();
    }
    
} 
