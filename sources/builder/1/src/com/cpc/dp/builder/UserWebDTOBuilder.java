package com.cpc.dp.builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder {
	
	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO userWebDTO;

	@Override
	public UserDTOBuilder withFirstName(String fname) {
		this.firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		this.lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		this.age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() + ", " + address.getStreet();
		return this;
	}

	@Override
	public UserDTO build() {
		this.userWebDTO = new UserWebDTO(this.firstName + " " + this.lastName, this.address, this.age);
		return this.userWebDTO;
	}

	@Override
	public UserDTO getUserDTO() {
		return this.userWebDTO;
	}
	
	
}
