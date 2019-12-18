package com.lambdas.src;

public class Mailer {
	
	public void from(final String address) {}
	public void to(final String address) {}
	public void subject(final String line) {}
	public void body(final String message) {}
	public void send() {System.out.println("Sending...");}
	
	
	public static void main(String [] args) {
		Mailer mailer = new Mailer();
		mailer.from("build@agiledeveloper.com");
		mailer.to("venkats@agiledeveloper.com");
		mailer.subject("build Notification");
		mailer.body("... Your Code Sucks...");
		mailer.send();
	}
	
}
