package HWpackage;

import HWpackage.B;

public class C {
	public void printB(B b) {
		System.out.println("x : " + b.x + ", y : " + b.y);
	}
	
	public double getDis(B b1, B b2) {
		double dx = b1.x - b2.x;
		double dy = b1.y - b2.y;
		double dis = Math.sqrt(dx * dx + dy * dy);
		return dis;
	}
}
