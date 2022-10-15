package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMisc.Constants;
import frc.robot.RobotMisc.OI;
import frc.robot.commands.Defaults.IntakeDefault;

public class Intake extends SubsystemBase {
  

  private final static DoubleSolenoid intakeSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 5, 2);//intake


  public static void setIntakeUp() {//intake
      intakeSolenoid.set(Value.kReverse);
  }

  public static void setIntakeDown() {//intake
      intakeSolenoid.set(Value.kForward);
  }

  public static void startCompressor() {
    Intake.intakeSolenoid.get();
  }

  private final static TalonSRX IntakeMotor = new TalonSRX(5);//intake 

  public static void setIntakePercent(double power) {//intake
    IntakeMotor.set(ControlMode.PercentOutput, power);
  }
       
  public static void doIntake() {//intake
    setIntakePercent(Constants.intakeSpeed);
  }
       
  public static void doOutake() {//intake
    setIntakePercent(Constants.outakeSpeed);
  }
       
  public static void stopIntake() {//intake
    setIntakePercent(0.0);
  }


public void init() {
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
