package curso.locadora;

public class Regular extends Movie {

	public Regular(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAmount(int daysRented) {
		// TODO Auto-generated method stub
		double thisAmount = 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;
		return thisAmount;
		
	}


}
