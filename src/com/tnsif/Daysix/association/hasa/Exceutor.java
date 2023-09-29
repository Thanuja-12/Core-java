package com.tnsif.Daysix.association.hasa;

public class Exceutor {
	public static void main(String[] args) {
		Address address = new Address("109 sai Enclave, Nehuru Colony", "Guntur", "Andhra pradesh", "517561");
		Person person = new Person("Mani Naidu", address);
		person.displayInfo();
	}

}
