package protectedDesignPattern;

public class Square extends Shape {
	public Square()
	{
		type="Square";
	}

	@Override
	public void draw() {
		System.out.println("type is square");
	}
	

}
