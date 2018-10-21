import java.text.NumberFormat;

public class Circle {

	double radius;

	public Circle() {
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}

	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}

	public double getArea() {
		return Math.PI * radius * 2;

	}

	public String getFormattedArea() {
		return formatNumber(getRadius());
	}

	private String formatNumber(double x) {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String format = number.format(x);
		return format;
	}
}
