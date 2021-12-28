package com.example.onlinetoyshop.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.onlinetoyshop.entity.UserData;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class IntegrationTest {

	@Autowired
	ApiController apiController;

	@Test
	public void testRead() {
		UserData u = new UserData();

		Iterable<UserData> u1 = apiController.read();
		Assertions.assertThat(u1).first().hasFieldOrPropertyWithValue("id", 1);
		Assertions.assertThat(u1).first().hasFieldOrPropertyWithValue("Name", "");
		Assertions.assertThat(u1).first().hasFieldOrPropertyWithValue("email", "");
		Assertions.assertThat(u1).first().hasFieldOrPropertyWithValue("password", "");
		Assertions.assertThat(u1).first().hasFieldOrPropertyWithValue("gender", null);

	}

	@Test
	public void testCreate() {
		UserData employee = new UserData();

		UserData employeeResult = apiController.create(employee);

		Iterable<UserData> employees = apiController.read();
		Assertions.assertThat(employees).first().hasFieldOrPropertyWithValue("name", "");

	}
}
