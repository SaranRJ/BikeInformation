package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("Cost of the Bike:2,00,000");
	}
	@Override
	public void speed() {
		System.out.println("Speed of the Bike: 200cc");
	}

	public void cost1() {
		System.out.println("cost of KTM is High");
	}

	public static void main(String[] args) {

		Bike b = new Ktm();
		b.cost();
		b.cost();

		Ktm k = new Ktm();
		k.cost1();
		k.cost();
		k.speed();
  }
}
