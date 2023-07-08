package factory_Method;

//create abstract class
abstract class Plan {
	protected double rate;
	
	//create abstract method
	abstract void getRate();

	public void calculateBill(int unit)
	{
		System.out.println("bill is: "+unit*rate);

	}

}
