package com.hcl.simplilearn;

public class EmailAddress {

	String[] emailIDs;

	int nextIndex = 0;
	int arraySize = 0;

	public EmailAddress(int size) {
		this.arraySize = size;
		this.emailIDs = new String[size];
	}

	public void addEmailID(String emailID) {
		this.emailIDs[this.nextIndex] = emailID;
		this.nextIndex++;
		if (this.nextIndex >= this.arraySize) {
			this.nextIndex = 0;
		}

	}

	public void printEmails() {
		for (String emailID : this.emailIDs) {
			if (null == emailID) {
				continue;
			}
			System.out.println(emailID);
		}
	}

	public boolean foundMatch(String input) {
		for (String emailID : this.emailIDs) {
			if (null == emailID) {
				continue;
			}
			if (emailID.equalsIgnoreCase(input)) {
				return true;
			}
		}
		return false;
	}
}
