package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMisc.Constants;
import frc.robot.commands.Defaults.TailDefault;

public class Tail extends SubsystemBase {

  public final static TalonSRX tailMotor = new TalonSRX(6);//tail

  public static void setTailPercent(double power) {//tail
    tailMotor.set(ControlMode.PercentOutput, power);
  }


  public static void tailDown() {//tail
    setTailPercent(Constants.tailDownSpeed);
  }

  public static void tailUp() {//tail
    setTailPercent(Constants.tailUpSpeed);
  }

  public static void tailStop() {//tail
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
