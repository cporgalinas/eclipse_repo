package org.ssglobal.training.codes.operators;

public class TestUnary {
	
	public static void main(String[] args) {
		Unary unary = new Unary();
		System.out.println("_--------POST INCREMENT---_-----");
//		unary.loopWithoutCounterVarPost();
//		unary.loopWithCounterVarPost();
//		unary.loopWithoutCounterVarPre();
		unary.loopWithCounterVarPre();
		System.out.println("--------------------------------");
	}

}
