package com.lambdas.src;

public class Evaluation {
	
	public static boolean evaluate(final int value) {
		System.out.println("evaluating..."+value);
	//	simulateTimeConsummingOp(2000);
		return value > 1000;
	}
	
	public static void eagerEvaluator(final boolean input1, 
			final boolean input2) {
		System.out.println("eagerEvaluator called....");
		System.out.println("accept?: "+ (input1 && input2));
	}

}
