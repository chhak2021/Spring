package kr.co.ch02.sub1;

import org.springframework.beans.factory.annotation.Autowired;

public class LgTV {
	
	@Autowired
	private Speaker spk;
	
	public void powerOn() {
		System.out.println("LgTV powerOn...");
	}
	
	public void powerOff() {
		System.out.println("LgTV powerOff...");
	}
	
	public void soundUp() {
		//System.out.println("LgTV soundUp...");
		spk.soundUp();
	}
	
	public void soundDown() {
		//System.out.println("LgTV soundDown...");
		spk.soundDown();
	}
	
}
