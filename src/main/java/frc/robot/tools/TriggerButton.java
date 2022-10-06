package frc.robot.tools;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.button.Button;

public class TriggerButton extends Button {
    private GenericHID joystick;
    private int triggerAxis;

    public TriggerButton(GenericHID joystick, int axisNumber) {
        this.joystick = joystick;
        triggerAxis = axisNumber;
    }

    public boolean get() {
        return joystick.getRawAxis(triggerAxis) >= 0.2;
    }
}