package com.strings;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 * Print all distinct characters of a string in order (3 Methods)
 * 
 * Input : Geeks for Geeks
 * Output : for
 * 
 * Input : Hello Geek
 * Output : HoGks
 *
 */

public class StringDistinctCharacters {

	public static void main(String[] args) {
		String str = "Geeks for Geeks";
		Set<String> strSet = new LinkedHashSet<String>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				continue;
			}

			if (strSet.contains(String.valueOf(str.charAt(i)))) {
				strSet.remove(String.valueOf(str.charAt(i)));
			} else {
				strSet.add(String.valueOf(str.charAt(i)));
			}
		}

		System.out.println(strSet);

	}

}
