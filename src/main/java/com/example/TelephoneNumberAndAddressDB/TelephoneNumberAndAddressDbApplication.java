package com.example.TelephoneNumberAndAddressDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//docker run --name TelephoneNumberAndAddressContainer -e MYSQL_ROOT_PASSWORD=Przemek123 -e MYSQL_DATABASE=telephoneAndAddressDB -d -p 3307:3306 mysql
@SpringBootApplication
public class TelephoneNumberAndAddressDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelephoneNumberAndAddressDbApplication.class, args);
	}

}
