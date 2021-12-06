package Programming;

import Programming.org.opentutorials.iot.DimmingLights;
import Programming.org.opentutorials.iot.Elevator;
import Programming.org.opentutorials.iot.Lighting;
import Programming.org.opentutorials.iot.Security;

import javax.swing.*;

public class OkJavaGoinHomeInput {

    public static void main(String[] args) {

        String id = JOptionPane.showInputDialog("Enter a ID");
        String bright = JOptionPane.showInputDialog("Enter a Bright Level");

        //String id = args[0];
        //String bright = args[1];

        // Elevator call
        Elevator myElevator = new Elevator(id);

        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(id);

        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorlLamp = new Lighting(id + " / Floor Lamp");
        floorlLamp.on();

        DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
    }

}
