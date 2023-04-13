package random;

public class PhatSinhMa {
	public PhatSinhMa() {

	}

	public int randomMaNV() {
		int min = 00000000;
		int max = 99999999;
		int randomNumber = (int) (Math.random() * (max - min + 1) + min);
		return randomNumber;
	}

	public static void main(String[] args) {

	}

}
