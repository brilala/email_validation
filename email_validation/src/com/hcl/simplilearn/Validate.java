package com.hcl.simplilearn;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {

		EmailAddress emailAddress = new EmailAddress(10);
		emailAddress.addEmailID("bob@belcher.com");
		emailAddress.addEmailID("linda@belcher.com");
		emailAddress.addEmailID("tina@belcher.com");
		emailAddress.addEmailID("gene@belcher.com");
		emailAddress.addEmailID("louise@belcher.com");
		emailAddress.addEmailID("homer@simpson.com");
		emailAddress.addEmailID("marge@simpson.com");
		emailAddress.addEmailID("lisa@simpson.com");
		emailAddress.addEmailID("bart@simpson.com");
		emailAddress.addEmailID("maggie@simpson.com");

		System.out.println("Enter your email address: ");
		Scanner scanner = new Scanner(System.in);
		String searchFor = scanner.nextLine();

		boolean foundMatch = emailAddress.foundMatch(searchFor);
		if (foundMatch) {
			System.out.println(searchFor + ": Verified!");
		} else {
			System.out.println(searchFor + ": email address NOT verified");
		}

	}

}
