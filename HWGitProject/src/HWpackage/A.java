package HWpackage;

import HWpackage.C;

public class A {
	public static void main(String[] args) {
		System.out.println("Hello Git!!!");

		B point1 = new B(1,1);

		C c = new C();
		B b1 = new B(0, 0);
		B b2 = new B(0, 0);
		b2.setX(2);
		b2.setY(3);
		System.out.println("rect height : " + c.getRectH(b1, b2) + ", rect weight : " + c.getRectW(b1, b2));

	}
}
