package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Defaults.TailDefault;


public class Tail extends SubsystemBase {

  public final static TalonSRX tailMotor = new TalonSRX(6);//tail

  public void setTailPercent(double power) {//tail
    tailMotor.set(ControlMode.PercentOutput, power);
  }


  public void tailDown() {//tail
    setTailPercent(0.5);
  }

  public void tailUp() {//tail
    setTailPercent(-0.5);
  }

  public void tailStop() {//tail
    setTailPercent(0.0);
  }

public void init() {
  setDefaultCommand(new TailDefault(this));
}

  @Override
  public void periodic() {}

public double getTailCurrent() {
  return tailMotor.getStatorCurrent();
}

}
