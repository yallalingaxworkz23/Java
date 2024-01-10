package com.xworkz.omkarsirsecond.java;

import org.springframework.stereotype.Component;

@Component
public class Ajama {
	
	private Scissor scissor;
	public Ajama(Scissor scissor) {
		this.scissor=scissor;
		System.out.println("calling scissor in ajama..."+this.scissor);
	System.out.println("in ajama..");
	}

}
