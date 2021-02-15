package ua.lviv.lgs.su27;

public abstract class Aircraft {

	int langth;
	int width;
	int waight;

	void enginesStart() {
		int time = (int) (Math.random() * (88 - 20) + 20);

		System.out.println("Time to start  " + time + " min");

	}

	void takeOff() {
		double distance = Math.random() * (4000 - 1000) + 1000;
		System.out.println("The plane will pass kilometers on a full tank of fuel " + distance);
	}

	void landing() {

		System.out.println("Landing the plane ");
	}

}
