package com.globant.cristian.services;

import org.springframework.boot.SpringApplication;

import com.globant.cristian.rest.MeetingController;
import com.globant.entities.*;

public abstract class Aplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(MeetingController.class, args);

	}
}
