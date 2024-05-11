package com.cpc.dp.builder;

import java.time.LocalDate;

//Abstract builder
// คลาสที่ทำให้เราสร้าง object ของ user
public interface UserDTOBuilder {
	//methods to build "parts" of product at a time
	// การที่ class return ตัวมันเองเพื่อใช้สำหรับการสร้าง method chaining
	UserDTOBuilder withFirstName(String fname) ;

	UserDTOBuilder withLastName(String lname);

	UserDTOBuilder withBirthday(LocalDate date);

	UserDTOBuilder withAddress(Address address);
	//method to "assemble" final product
	// ส่งคืน final object ของ UserDTO
	UserDTO build();
	//(optional) method to fetch already built object
	// สิ่งคืนวัตถุที่ถูกสร้างแล้ว
	UserDTO getUserDTO();
}

