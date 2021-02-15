package ua.lviv.lgs.su27;

public class Main {

	public static void main(String[] args) {

		Su27 su_27 = new Su27(1100, "GREY");
		su_27.enginesStart();
		su_27.takeOff();
		Su27Control.moveUp();
		Su27Control.moveLeft();
		Su27Control.moveDown();
		Su27Control.moveRight();
		su_27.stealth();
		su_27.nuclearImpact();
		su_27.turboCharge();
		su_27.landing();

	}

}
