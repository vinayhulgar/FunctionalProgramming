package com.lambdas.src;

import java.util.function.Function;
import java.util.stream.Stream;

public class Camera {
	
	private Function<Color, Color> filter;
	
	public Camera() {
		setFilters();
	}
	public Color capture (final Color inputColor) {
		final Color processedColor = filter.apply(inputColor);
		return processedColor;
	}
	
	public void setFilters(final Function<Color, Color>...filters) {
		filter =
				Stream.of(filters)
				.reduce((filter, next) -> filter.compose(next))
				.orElse(color -> color);
	}
}
