package kr.co.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "com")
public class Computer {

	// DI - 생성자 인젝션
	private CPU cpu;
	
	@Autowired
	public Computer(CPU cpu) {
		this.cpu = cpu;
	}
	
	// DI - 세터 인젝션
	private RAM ram;
	
	@Autowired
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
	// DI - 필드 인젝션
	@Autowired
	private HDD hdd;
	
	public void show() {
		cpu.show();
		ram.show();
		hdd.show();
	}
	
}
