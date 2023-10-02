package com.greatLearning.notesdenomination.main;

import java.util.Scanner;

import com.greatLearning.notesdenomination.service.MergeSortImplementaion;
import com.greatLearning.notesdenomination.service.NotesCount;

class NoteCountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeSortImplementaion mergeSort = new MergeSortImplementaion();
		NotesCount notesCount = new NotesCount();
		System.out.println("enter the size of currency denominations");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");

		for (int i = 0; i < notes.length; i++) {
			notes[i] = s.nextInt();
		}

		System.out.println("enter the amount you want to pay");
		int amount = s.nextInt();
		mergeSort.sort(notes, 0, notes.length - 1);
		notesCount.notesCountImplementation(notes, amount);
		s.close();

	}

}
