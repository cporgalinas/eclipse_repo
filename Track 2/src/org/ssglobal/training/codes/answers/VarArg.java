package org.ssglobal.training.codes.answers;

public class VarArg {
	
	public void printNums(int... nums) {
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[3]);
		
//		for (int lookup: nums) {
//			System.out.println(lookup);
		
		if(nums.length == 0) {
			System.out.println("Empty list");
		}else {
			// do transactions
		}
		
		for (int i : nums) {
			System.out.println(i);
		}
		
	}
	
	public void acceptComplextData(int x, int... y) {
		
	}
	
	
	

}
