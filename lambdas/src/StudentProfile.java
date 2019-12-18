package com.lambdas.src;

import java.util.function.Consumer;

public class StudentProfile {

	private StudentProfile() {}
	
	public StudentProfile firstName (final String studentFirstName) { return this;}
	public StudentProfile lastName (final String studentLastName) { return this;}
	public StudentProfile address (final String studentAddress) { return this;}
	public StudentProfile phoneNumber (final String phoneNumber) { return this;}
	
	public static void add(final Consumer<StudentProfile> batch) {
		StudentProfile studentprofile = new StudentProfile();
		batch.accept(studentprofile);
		System.out.println("Adding... ");
	}
		
	public static void main(String[] args) {
		StudentProfile.add(student ->
		student.firstName("Jack")
		.lastName("Sparrow")
		.address("No 81 HM Building, Capetown")
		.phoneNumber("45-126-35187"));
	}
}
