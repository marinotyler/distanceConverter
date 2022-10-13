
public class TemperatureConverter extends Converter{

	//constructor
	public TemperatureConverter(double input) {
		super(input);
	}
	
	//overridden parent method to convert input to new unit of measure
	public double convert(double input) {
			double newInput = (((input-32)*5)/9);
			return newInput;
	}
}	