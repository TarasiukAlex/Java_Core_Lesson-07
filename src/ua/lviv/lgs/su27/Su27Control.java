package ua.lviv.lgs.su27;

public class Su27Control {

	public static void moveUp() {
		double move = Math.random() * 1000;
		System.out.println("The plane flies up " + move + " km");

	}

	public static void moveDown() {
		double move = Math.random() * 1000;

		System.out.println("The plane flies down " + move + " km");

	}

	public static void moveLeft() {
		double move = Math.random() * 1000;

		System.out.println("The plane flies to the left " + move + " km");

	}

	public static void moveRight() {
		double move = Math.random() * 1000;

		System.out.println("The plane flies to the right " + move + " km");

	}
}
