import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
/*Tyler Marino  |  CMIS 242  |  November 30th, 2021
 * This is a short program that implements a GUI which allows a user to select a function and perform a conversion on their input. 
 */
public class GUIConverter{
//event handlers
	
	public static class ExitHandler implements ActionListener{
		//action listener for exit button
		public void actionPerformed(ActionEvent e) {
			System.out.println("Thank you for using this program. Goodbye.");
			System.exit(0);
		}
	}
	//distance converter action handler
	public static class DistanceConvertHandler implements ActionListener{
		private JFrame window = null;
		public DistanceConvertHandler(JFrame window) {
			this.window = window;	
		}
		//creates action listener for distance converter button
		public void actionPerformed(ActionEvent e) {	
			String initialDistance = JOptionPane.showInputDialog("Input miles to distance to convert");
			double newDistance = Double.parseDouble(initialDistance);
			DistanceConverter distanceConverter = new DistanceConverter(newDistance);
			double finalDistance = distanceConverter.converter(newDistance);
			String displayDistance = newDistance + " mi equals " + finalDistance + " km";
			JOptionPane.showMessageDialog(window, displayDistance);
		}
	}
	
	public static class TemperatureConvertHandler implements ActionListener{
		private JFrame window = null;
		public TemperatureConvertHandler(JFrame window) {
			this.window = window;
		}
		//creates action listener for temperature convert button
		public void actionPerformed(ActionEvent e) {
			String initialTemp = JOptionPane.showInputDialog("Input Fahrenheit Temperature to convert");
			double newTemperature = Double.parseDouble(initialTemp);
			TemperatureConverter temperatureConverter = new TemperatureConverter(newTemperature);
			double finalTemperature = temperatureConverter.convert(newTemperature);
			String displayTemperature = newTemperature + " F equals " + finalTemperature + " C";
			JOptionPane.showMessageDialog(window, displayTemperature);
		}
	}
	public static void main(String[] args) {
			System.out.println("Tyler Marino  |  CMIS 242  |  Nov. 30th, 2021");
			
			//initiates buttons as variables
			JButton distanceConvert = new JButton("Distance Converter");
			JButton temperatureConvert = new JButton("Temperature Converter");
			JButton exit = new JButton ("Exit");
			
			//initiates the JFrame
			JFrame window =  new JFrame ("Welcome to Converter");
			
			//initiates Jpanel to input content into
			JPanel content = new JPanel();
			
			//sets premade layout for content
			content.setLayout(new BorderLayout());
			
			//initiates action handlers and adds action listeners to buttons
			DistanceConvertHandler distanceListener = new DistanceConvertHandler(window);
			distanceConvert.addActionListener(distanceListener);
			TemperatureConvertHandler temperatureListener = new TemperatureConvertHandler(window);
			temperatureConvert.addActionListener(temperatureListener);
			ExitHandler exitListener = new ExitHandler();
			exit.addActionListener(exitListener);
			
			//adds buttons to content pane
			content.add(distanceConvert, BorderLayout.WEST);
			content.add(temperatureConvert, BorderLayout.EAST);
			content.add(exit, BorderLayout.SOUTH);
			
			//sets Jpanel in JFrame
			window.setContentPane(content);
			
			//enable jframe parameters
			window.setSize(400,400);
			window.setVisible(true);
			window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
		}
	}
