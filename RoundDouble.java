package com.project.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundDouble {

	public double round1(double input, int scale) {
		//Most preferred way!
		BigDecimal bigDecimal = new BigDecimal(input).setScale(scale, RoundingMode.HALF_EVEN);
		return bigDecimal.doubleValue();
	}

	public double round2(double input) {
		return Math.round(input * 100) / 100.0d;
	}

	public static void main(String[] args) {
		RoundDouble rd = new RoundDouble();
		System.out.println(rd.round1(9232.129394d, 2));
		System.out.println(rd.round2(9232.129394d));
	}
}
