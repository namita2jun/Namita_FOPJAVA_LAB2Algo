package com.greatLearning.transaction.main;

import java.util.Scanner;

import com.greatLearning.transaction.service.TransactionServiceImpl;

public class TransactionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");

		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the value of array");
		for (int i = 0; i < size; i++)

			array[i] = sc.nextInt();

		System.out.println("Enter the total no of targets that needs to be achieved ");
		int targetNo = sc.nextInt();
		TransactionServiceImpl transactionService = new TransactionServiceImpl();
		transactionService.checkTransaction(array, targetNo);
		sc.close();

	}

}
