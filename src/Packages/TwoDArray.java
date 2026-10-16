package Packages;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] Bikes = { { "Yamaha", "Suzuki", "Hero" }, { "Honda", "Bajaj", "Tvs" } };
		for (int i = 0; i < Bikes.length; i++) {
			System.out.println();
			for (int j = 0; j < Bikes[i].length; j++) {
				System.out.print(Bikes[i][j] + " ");
			}
		}
	}

}
