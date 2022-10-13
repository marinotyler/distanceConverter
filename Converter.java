
public class Converter {

	//attributes
	protected double input;
	
	//default constructor
	public Converter() {
		this.input = Double.NaN;
	}
	
	//overloaded constructor for double input
	public Converter(double input) {
		this.input = input;
	}
	
	public double getInput() {
		return input;
	}	
	public void setInput(double newInput) {
		this.input = newInput;
	}
	
	//method to convert input
	public double convert(double input) {
		return input;
	}
}