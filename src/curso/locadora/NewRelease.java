package curso.locadora;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getAmount(int daysRented) {
		return daysRented * 3;
		
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		// TODO Auto-generated method stub
		if (daysRented > 1)
			return 2;
		return 1;
	}


}