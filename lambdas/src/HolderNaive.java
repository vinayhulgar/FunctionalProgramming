package com.lambdas.src;

public class HolderNaive {
	
	
	private Heavy heavy;
	
	public HolderNaive() {
		System.out.println("Holder Created");
	}
	
	public synchronized Heavy getHeavy() {
		if(heavy == null) {
			heavy = new Heavy();
		}
		return heavy;
	}

	public static void main(String [] args) {
		final HolderNaive holder = new HolderNaive();
		System.out.println("Deferring heavy creation.....");
		System.out.println(holder.getHeavy());
		System.out.println(holder.getHeavy());
	}
}
