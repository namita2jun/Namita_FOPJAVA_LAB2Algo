package com.greatLearning.notesdenomination.service;

public class NotesCount {

	public void notesCountImplementation(int[] notes, int amount) {

		int[] notesCounter = new int[notes.length];
		
		try {

			for (int i = 0; i < notes.length; i++) {

				if (amount >= notes[i]) {

					notesCounter[i] = amount / notes[i];

					amount = amount - notesCounter[i] * notes[i];

					if (amount == 0)
						break;

				}

			}
			if (amount > 0) {
				System.out.println("exact amount can't be given in highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min number of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(notes[i] + ":" + notesCounter[i]);
					}
				}
			}

		} catch (ArithmeticException ex) {
			System.out.println(ex + " notes of 0 denomination is invalid");
		}
	}
}
