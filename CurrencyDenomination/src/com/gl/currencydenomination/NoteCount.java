package com.gl.currencydenomination;

public class NoteCount {

	public void counting(int[] currencyArr, int amount) {
		
		
		int[] noteCount = new int[currencyArr.length];
		int sumofNotes=0;
		for(int i=0;i<currencyArr.length;i++) {
			noteCount[i]=amount / currencyArr[i];
			amount= amount%currencyArr [i];
			sumofNotes+=noteCount[i];
		}
		for (int i = 0; i < noteCount.length; i++) {
			if (noteCount [i]!=0) {
			    System.out.println (currencyArr[i]+" X "+noteCount[i]);
			}
		}
		System.out.println("Total Notes: "+sumofNotes);
	}

}
