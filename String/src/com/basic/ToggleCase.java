package com.basic;

import java.util.Arrays;

public class ToggleCase {

	public static void main(String[] args) {

		String str = "sUdARShan";

		char[] p = str.toCharArray();
		System.out.println(Arrays.toString(p));
		//String str1 = "";
		
		for (int i = 0; i < p.length; i++) {

			if (p[i] >= 'A' && p[i] <= 'Z') {
				p[i] = (char) (p[i] + 32);
			}

			else if (p[i] >= 'a' && p[i] <= 'z') {
				p[i] = (char) (p[i] - 32);
			}
		}

		System.out.println(Arrays.toString(p));

	}

}
