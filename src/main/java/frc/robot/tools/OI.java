package frc.robot.tools;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class OI {

public static XboxController driverController = new XboxController(0);

public static JoystickButton driverA = new JoystickButton(driverController, 1);
public static JoystickButton driverY = new JoystickButton(driverController, 4);
public static JoystickButton driverX = new JoystickButton(driverController, 3);
public static JoystickButton driverB = new JoystickButton(driverController, 2);
public static JoystickButton driverRB = new JoystickButton(driverController, 6);
public static JoystickButton driverLB = new JoystickButton(driverController, 5);
public static JoystickButton driveMenu = new JoystickButton(driverController, 8);

public static TriggerButton driverRTrig = new TriggerButton(driverController, 3);
public static TriggerButton driverLTrig = new TriggerButton(driverController, 2);

public static double getDriverLeftX() {
    return driverController.getLeftX();
}

public static double getDriverRightX() {
    return driverController.getRightX();
}

public static double getDriverLeftY() {
    return driverController.getLeftY();
}

public static double getDriverRightY() {
    return driverController.getRightY();
}

public static boolean getDriverA() {
    return driverController.getAButton();
}

public static boolean getDriverY() {
    return driverController.getYButton();
}

public static boolean getPressedY() {
    return driverController.getYButtonPressed();
}

public static boolean getPressedA() {
    return driverController.getAButtonPressed();
}

public static double getDriverRightTrigger() {
    return driverController.getRightTriggerAxis();
}
public static double getDriverLeftTrigger() {
    return driverController.getLeftTriggerAxis();
}

}