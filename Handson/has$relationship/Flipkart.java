package com.ob.has$relationship;

public class Flipkart {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		Battery battery = new Battery();
		battery.brand="Dell";
		battery.capacity = 20000;
		battery.type="Lithium";
		
		Rom rom = new Rom();
		rom.type="DDR4";
		rom.size=16;
		rom.clockSpeed=2.4;
		
		Screen screen = new Screen();
		screen.brand="Samsung";
		screen.resolution=1080;
		screen.size=32;
		screen.type="oled";
		
		laptop.brand="hp";
		laptop.price =57000;
		laptop.battery=battery;
		laptop.rom =rom;
		laptop.screen=screen;
		
		
		System.out.println(laptop.battery);
		System.out.println(laptop.rom);
		System.out.println(laptop.screen);
	}

	
}
