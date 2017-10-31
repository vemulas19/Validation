package com.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

		private Pattern pattern;
		private Matcher matcher;
		public boolean validate(final String hex) {
			System.out.println("this is My Second Validation In First Branch");
			matcher = pattern.matcher(hex);
			System.out.println("hi");
			return matcher.matches();

		}
	}

