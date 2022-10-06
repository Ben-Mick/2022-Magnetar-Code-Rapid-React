package frc.robot.tools;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.RobotMisc.Constants;

public class MotorControls{

    public final static TalonSRX tailMotor = new TalonSRX(6);

    private final static TalonSRX IntakeMotor = new TalonSRX(5);
    
    public final static TalonSRX frontRight = new TalonSRX(3);
    public final static TalonSRX frontLeft = new TalonSRX(1);
    public final static TalonSRX backRight = new TalonSRX(4);
    public final static TalonSRX backLeft = new TalonSRX(2);

  public static void setUpDriveMotors() {
    frontRight.setInverted(true);
    backRight.setInverted(true);
    backLeft.set(ControlMode.Follower, 1);
    backRight.set(ControlMode.Follower, 3);
  }

  public static void setDrivePercents(double left, double right) {
    frontRight.set(ControlMode.PercentOutput, right);
    frontLeft.set(ControlMode.PercentOutput, left);
  }

public static void stopDrive() {
  setDrivePercents(0.0, 0.0);
}

  public static void setTailPercent(double power) {
    tailMotor.set(ControlMode.PercentOutput, power);
  }

  public static void tailDown() {
    setTailPercent(Constants.tailDownSpeed);
  }

  public static void tailUp() {
    setTailPercent(Constants.tailUpSpeed);
  }

  public static void tailStop() {
    setTailPercent(0.0);
  }

  public static void setIntakePercent(double power) {
    IntakeMotor.set(ControlMode.PercentOutput, power);
  }
       
  public static void doIntake() {
    setIntakePercent(Constants.intakeSpeed);
  }
       
  public static void doOutake() {
    setIntakePercent(Constants.outakeSpeed);
  }
       
  public static void stopIntake() {
    setIntakePercent(0.0);
  }

}