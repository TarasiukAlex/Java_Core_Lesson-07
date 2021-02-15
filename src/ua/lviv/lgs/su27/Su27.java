package ua.lviv.lgs.su27;

public class Su27 extends Aircraft implements Possibility {

	int maxSpeed;
	String color;

	public Su27(int maxSpeed, String color) {
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void turboCharge() {
		int a = (int) (Math.random() * (600 + 1)) + 200;
		int turboSpeed = a + (int) (Math.random() + maxSpeed);
		System.out.println("TurboCharge " + turboSpeed + " km/h");
	}

	@Override
	public void stealth() {
		int a = 20, b = 120;
		int st = a + (int) (Math.random() * ((b - a) + 1));
		System.out.println("the plane is not visible for " + st + " min");
	}

	@Override
	public void nuclearImpact() {
		int a = 1;
		int b = 10;
		int bomb = a + (int) (Math.random() * ((b - a) + 1));
		System.out.println("The number of nuclear warheads that will be dropped " + bomb);

	}

}
