package oop06.inter01;

public interface TV {
	public void turnOn();//abstract붙여도 되고 안붙여도 됨, 알아서 abstract 추상메서드로 인식한다.
	public void turnOff();
	public void channelUp(); 
	public void channelDown(); 
	public void soundUp();
	public void soundDown();
}
