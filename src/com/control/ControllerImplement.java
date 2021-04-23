package com.control;

import java.util.List;

import test.backend.Bank;

public class ControllerImplement implements Controller {
	private List<Bank> bankz;

	@Override
	public List<Bank> getBanks() {
		return bankz;
	}
}
