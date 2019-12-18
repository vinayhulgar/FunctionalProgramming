package com.lambdas.src;
import java.math.BigDecimal;
import java.util.function.Function;
/**
 * @author Vinay.G01
 *
 */
public class CalculateNAV {
	private Function<String, BigDecimal> priceFinder;
	/**
	 * @param aPriceFinder
	 */
	public CalculateNAV(final Function<String, BigDecimal> aPriceFinder) {
		priceFinder = aPriceFinder;
	}
	public static void main(String [] args) {
		final CalculateNAV calculateNAV = new CalculateNAV(YahooFinance::getPrice);
		System.out.println(String.format("100 shares of Google worth: $%.2f", 
				calculateNAV.computeStockWorth("G00G", 100)));
	}
	/**
	 * @param ticker
	 * @param shares
	 * @return
	 */
	public BigDecimal computeStockWorth(final String ticker, final int shares) {
		return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
	}
}