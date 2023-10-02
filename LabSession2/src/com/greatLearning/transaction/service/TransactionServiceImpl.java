package com.greatLearning.transaction.service;

import java.util.Scanner;

import com.greatLearning.transaction.interfaces.ITranscationService;

public class TransactionServiceImpl implements ITranscationService {

	@Override
	public void checkTransaction(int[] arr, int targetNo) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		while (targetNo-- != 0) {

			int flag = 0;

			int target;

			System.out.println("enter the value of target");

			target = s.nextInt();

			int sum = 0;

			for (int i = 0; i < arr.length; i++) {

				sum += arr[i];

				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}

		s.close();
	}

}
