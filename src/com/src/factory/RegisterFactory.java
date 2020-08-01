package com.src.factory;

import com.src.service.RegisterService;
import com.src.serviceimpl.RegisterServiceImpl;

public class RegisterFactory {
	
	private RegisterFactory() {
		
	}
	
	public static RegisterService getRegObj() {
		return new RegisterServiceImpl();
	}

}
