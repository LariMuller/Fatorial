package controller;

public class FatorialController {
	public FatorialController() {
		super();
	}
	public int getFat(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * getFat(n-1);
		}
	}
}
