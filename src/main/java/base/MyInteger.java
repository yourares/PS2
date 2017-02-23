package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

//no static: passing in the iValue we already defined before
	public boolean isEven() {
		if (this.iValue % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		for (int a = 2; a < iValue; a++) {
			if (iValue % a != 0) {
				return true;
			}
		}
		return false;
	}

//use static: passing in integers	
	public static boolean isEven(int num1) {
		if (num1 % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd(int num2) {
		if (num2 % 2 != 0) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int num3) {
		for (int a = 2; a < num3; a++) {
			if (num3 % a != 0) {
				return true;
			}
		}
		return false;
	}

//use static: passing in objects
	public static boolean isEven(MyInteger MI1) {
		if (MI1.iValue % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd(MyInteger MI2) {
		if (MI2.iValue % 2 != 0) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(MyInteger MI3) {
		for (int a = 2; a < MI3.iValue; a++) {
			if (MI3.iValue % a != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean equals(int i) {
		if (i == iValue) {
			return true;
		}
		return false;
	}

	public boolean equals(MyInteger MI) {
		if (MI.iValue == this.iValue){
			return true;
		}
			return false;
		}
}