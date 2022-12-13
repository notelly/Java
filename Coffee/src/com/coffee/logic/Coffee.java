package com.coffee.logic;

public class Coffee {
	//Coffee에 대한 정보를 담고 출력할 때만 사용.
	//DTO = DATA TRANSFER OBJECT
	//VO = VALUE OBJECT (정보 + 기능 살짝 추가)
	//Beans = DTO, VO 같은 의미
	
	//카페에 대한 정보를 적어야함
	//DB에서 정한 컬럼명 알아내는 법
	private int coffeeId; //coffe_id 명명법이 다르기 때문에 이렇게 설정, 명명법을 지키면서 컬럼명과 필드명이 똑같아야한다.
	private String coffeeMenu;
	private int coffeePrice;
	private String coffeeExplain;
	private int coffeeSales;
	
	
	
	public int getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}
	public String getCoffeeMenu() {
		return coffeeMenu;
	}
	public void setCoffeeMenu(String coffeeMenu) {
		this.coffeeMenu = coffeeMenu;
	}
	public int getCoffeePrice() {
		return coffeePrice;
	}
	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
	public String getCoffeeExplain() {
		return coffeeExplain;
	}
	public void setCoffeeExplain(String coffeeExplain) {
		this.coffeeExplain = coffeeExplain;
	}
	public int getCoffeeSales() {
		return coffeeSales;
	}
	public void setCoffeeSales(int coffeeSales) {
		this.coffeeSales = coffeeSales;
	}
	
	
	
}
