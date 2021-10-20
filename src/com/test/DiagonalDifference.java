package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
	public static void main(String[] args) {
		List<List<Integer>> abc = new ArrayList<List<Integer>>();
		abc.add(List.of(11,2,4));
		abc.add(List.of(4,5,6));
		abc.add(List.of(10,8,-12));
		
		System.out.println(diagonalDifference(abc));
		
	}

	 public static int diagonalDifference(List<List<Integer>> arr) {
		 
		 int primaryDiagonal = 0;
		 int secondaryDigonal = 0;
		 for (int i = 0 ; i < arr.size() ; i++ ) {
			 List<Integer> row = arr.get(i);
			 for(int j = 0 ; j < row.size(); j++) {
				 if(i==j) {
					 primaryDiagonal+=row.get(j);
				 } if(i+j == row.size()-1) {
					 secondaryDigonal+=row.get(j);
				 }
			 }
		
		}
		return Math.abs(primaryDiagonal-secondaryDigonal);
		    // Write your code here

		    }
}
