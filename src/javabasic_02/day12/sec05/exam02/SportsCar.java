package javabasic_02.day12.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {

		speed += 10;
		if (speed == 0) {
			super.stop();
		}
	}

//	public void stop() {
//		stop()' cannot override 'stop()' in 'javabasic_02.day12.sec05.exam02.Car'; overridden method is final
//	}

}