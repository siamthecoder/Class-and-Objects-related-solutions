
public class Circle extends Shape implements Resize_able, Geometric{
	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		double p = 2 * (3.1416) * radius;
		return p;
	}

	@Override
	public double getArea() {
		double a = 3.1416 * (radius * radius);
		return a;
	}

	@Override
	public void resize(int percent) throws MyException{
		if(percent <= 0) {
			throw new MyException("Can't Allow Zero or Negative. The previous updated size of this circle was: "+radius+"(in radius)");
		}
		else {
			this.setRadius(percent);
		}
		
	}
	
}
