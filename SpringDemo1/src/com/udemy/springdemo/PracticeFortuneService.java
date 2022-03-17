package com.udemy.springdemo;

import java.util.Random;

public class PracticeFortuneService implements FortuneService {

	@Override
	public String getFortune() {	
		String[] randomFortune = {"RandomFortune1", "RandomFortune2", "RandomFortune3"};
		return randomFortune[new Random().nextInt(randomFortune.length)];
	}
}
