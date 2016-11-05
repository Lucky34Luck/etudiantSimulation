package org.etudiant;

public class Etudiant {
	private String lastName;
	private String firstName;
	private String school;
	private int age;
	private boolean partner;
	private boolean social;
	
	public Etudiant(String lastName, String firstName, String school, int age, boolean partner, boolean social) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.school = school;
		this.age = age;
		this.partner = partner;
		this.social = social;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isPartner() {
		return partner;
	}

	public void setPartner(boolean partner) {
		this.partner = partner;
	}

	public boolean isSocial() {
		return social;
	}

	public void setSocial(boolean social) {
		this.social = social;
	}
	
	
	
    

}
