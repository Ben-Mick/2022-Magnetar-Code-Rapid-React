package frc.robot.subsystems;

import frc.robot.commands.Defaults.DriveDefault;
import frc.robot.tools.MotorControls;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  
public void init() {
  MotorControls.setUpDriveMotors();
  MotorControls.setDrivePercents(0.0, 0.0);
  setDefaultCommand(new DriveDefault(this));
}

  @Override
  public void periodic() {}

public void tankDrive(double left, double right) {
  left *= Math.abs(left);
  right *= Math.abs(right);
  MotorControls.setDrivePercents(left, right);
}

public void arcadeDrive(double throttle, double turn) {
  throttle *= Math.abs(throttle);
  turn *= Math.abs(turn);
  turn *= -1; 

  double right = throttle - turn;
  double left = throttle + turn;
  double factor;

if(right > 1) {
  factor = right;
} else if(left > 1) {
  factor = left;
} else {
	factor = 1;
}

  right = right / factor;
  left = left / factor;

  MotorControls.setDrivePercents(left, right);
 
}

}
