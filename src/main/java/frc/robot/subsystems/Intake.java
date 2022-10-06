package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMisc.OI;
import frc.robot.commands.Defaults.IntakeDefault;
import frc.robot.tools.MotorControls;

public class Intake extends SubsystemBase {
  
public void init() {
  MotorControls.setIntakePercent(0.0);
  setDefaultCommand(new IntakeDefault(this));
}

public double getRightTrigger() {
  return OI.getDriverRightTrigger();
}

public double getLeftTrigger() {
  return OI.getDriverLeftTrigger();
}

  @Override
  public void periodic() {}

}
