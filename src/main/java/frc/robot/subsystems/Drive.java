package frc.robot.subsystems;

import frc.robot.commands.Defaults.DriveDefault;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  
  public final static TalonSRX frontRight = new TalonSRX(3);//drive
  public final static TalonSRX frontLeft = new TalonSRX(1);//drive
  public final static TalonSRX backRight = new TalonSRX(4);//drive
  public final static TalonSRX backLeft = new TalonSRX(2);//drive

  public static void setUpDriveMotors() {//drive
    frontRight.setInverted(true);
    backRight.setInverted(true);
    backLeft.set(ControlMode.Follower, 1);
    backRight.set(ControlMode.Follower, 3);
  }

  public static void setDrivePercents(double left, double right) {//drive
    frontRight.set(ControlMode.PercentOutput, right);
    frontLeft.set(ControlMode.PercentOutput, left);
  }

public static void stopDrive() {//drive
  setDrivePercents(0.0, 0.0);
}



public void init() {
  setUpDriveMotors();
  setDrivePercents(0.0, 0.0);
  setDefaultCommand(new DriveDefault(this));
}

  @Override
  public void periodic() {}

public void tankDrive(double left, double right) {
  left *= Math.abs(left);
  right *= Math.abs(right);
  setDrivePercents(left, right);
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

  setDrivePercents(left, right);
 
}

}
