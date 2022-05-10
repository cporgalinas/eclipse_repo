package org.ssglobal.training.codes.modifiers;

public class TestFinalMembers {
	
	public static int num = 0;
	
	public static void main(String... args) {
		FinalMembers fm = new FinalMembers();
		System.out.println(fm.PIE);
		
		fm.accessWithoutOverride();
		fm.accessPoint();
	}
	
	public void accessWithoutOverride() {
		// re-implements
	}
	
	public void accessPoint() {
		accessWithoutOverride();
	}

}
