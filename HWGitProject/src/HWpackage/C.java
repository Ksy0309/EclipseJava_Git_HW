package HWpackage;

import HWpackage.B;

public class C {
	public void printB(B b) {
		System.out.println("x : " + b.x + ", y : " + b.y);
	}
	
	public int getRectH(B b1, B b2) {
		return Math.abs(b1.y - b2.y);
	}
	
	public int getRectW(B b1, B b2) {
	return Math.abs(b1.x - b2.x);
	}
}
