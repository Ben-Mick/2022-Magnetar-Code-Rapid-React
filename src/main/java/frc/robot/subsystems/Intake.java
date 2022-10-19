package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Defaults.IntakeDefault;

import frc.robot.tools.OI;

public class Intake extends SubsystemBase {
  

  private final static DoubleSolenoid intakeSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 5, 2);//intake
  private final static TalonSRX IntakeMotor = new TalonSRX(5);//intake 


  public void setIntakeUp() {//intake
      intakeSolenoid.set(Value.kReverse);
  }

  public void setIntakeDown() {//intake
      intakeSolenoid.set(Value.kForward);
  }

  public void startCompressor() {
    Intake.intakeSolenoid.get();
  }

  
  public void setIntakePercent(double power) {//intake
    IntakeMotor.set(ControlMode.PercentOutput, power);
  }
       
  public void doIntake() {//intake
    setIntakePercent(1.0);
  }
       
  public void doOutake() {//intake
    setIntakePercent(-1.0);
  }
       
  public void stopIntake() {//intake
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
