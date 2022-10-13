
public class DistanceConverter extends Converter{

	//constructor
	public DistanceConverter(double distance) {
		super(distance);
	}
	
	//overridden parent method to convert input to new unit of measure
	public double converter(double distance) {
			double newDistance = (distance * 1.609);
			return newDistance;
		}
}
