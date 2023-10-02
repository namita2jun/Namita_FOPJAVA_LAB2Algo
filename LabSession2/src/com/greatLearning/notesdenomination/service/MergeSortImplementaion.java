package com.greatLearning.notesdenomination.service;

public class MergeSortImplementaion {

	public void merge(int[] arr, int left, int mid, int right) {
		// find the size of 2 sub Arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;
		/* Create temporary arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		/* Merged temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {

			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}

	}

	public void sort(int[] notes, int left, int right) {

		if (left < right) {
			// find middle of array
			int mid = (left + right) / 2;

			// sort first and second halves
			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			// Merge the sorted halves
			merge(notes, left, mid, right);
		}
	}

}
