package org.ssglobal.training.codes.modifiers;

public class StaticMembers {
	
	public static double pie = 3.14;
	public double e = 2.17;
	
	public static boolean even(int value) {
		StaticMembers sm = new StaticMembers();
		int x = 0;
		return value % 2 == 0;
		
//		if(true) {
//			int y = 5;
//		}
//		return value % 2 == 0;
	}
	
	public boolean isZero(int value) {
		return value == 0;
	}
	
	

}
