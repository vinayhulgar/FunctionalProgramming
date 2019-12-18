package com.lambdas.src;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import com.lambdas.src.Asset.AssetType;
/**
 * We are dealing with 3 concerns here
 * How to iterate
 * What to Total
 * How to Total
 * Using Lambda expression to realize Strategy pattern
 */
public class AssetUtil {
	final static List<Asset> assets = Arrays.asList(
			new Asset(Asset.AssetType.BOND,1000),
			new Asset(Asset.AssetType.BOND,2000),
			new Asset(Asset.AssetType.STOCK,3000),
			new Asset(Asset.AssetType.STOCK,4000)
			);
	public static int totalAssetValues(final List<Asset> assets, 
			final Predicate<Asset> assetSelector) {
		return assets.stream()
				.filter(assetSelector)
				.mapToInt(Asset:: getValue)
				.sum();
	}
	public static int totalBONDValues(final List<Asset> assets) {
		return assets.stream()
				.mapToInt(asset -> 
				asset.getType() == AssetType.BOND ? asset.getValue() : 0)
				.sum();
	}
	public static int totalSTOCKValues(final List<Asset> assets) {
		return assets.stream()
				.mapToInt(asset -> 
				asset.getType() == AssetType.STOCK ? asset.getValue() : 0)
				.sum();
	}
	public static void main(String [] args) {
		System.out.println("Total Of All Assets:: "+totalAssetValues(assets, asset -> true));
		System.out.println("Total Of Bond Assets:: "+totalAssetValues(assets, asset -> asset.getType() == AssetType.BOND));
		System.out.println("Total Of Stock Assets:: "+totalAssetValues(assets, asset -> asset.getType() == AssetType.STOCK));
	}
}