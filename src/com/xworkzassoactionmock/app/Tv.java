package com.xworkzassoactionmock.app;

public class Tv {
	
	private Speacker speaker;
	
	public Tv() {
		// TODO Auto-generated constructor stub
	}

	public Speacker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speacker speaker) {
		this.speaker = speaker;
	}

	@Override
	public String toString() {
		return "Tv [speaker=" + speaker + "]";
	}

}
