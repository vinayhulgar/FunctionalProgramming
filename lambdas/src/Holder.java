package com.lambdas.src;

import java.util.function.Supplier;

public class Holder {

	private Supplier<Heavy> heavy = () -> createAndCacheHeavy();
	
	public Holder() {
		System.out.println("Holder Created");
	}

	private synchronized Heavy createAndCacheHeavy() {
		class HeavyFactory implements Supplier<Heavy>{
			private final Heavy heavyInstance = new Heavy();
			
			@Override
			public Heavy get() {
				return heavyInstance;
			}
		}
		if(!HeavyFactory.class.isInstance(heavy)) {
			heavy = new HeavyFactory();
		}
		return heavy.get();
	}

	public Heavy getHeavy() {
		return heavy.get();
	}
	
}
