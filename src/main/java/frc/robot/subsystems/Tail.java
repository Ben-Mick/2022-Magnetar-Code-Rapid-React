package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Defaults.TailDefault;
import frc.robot.tools.MotorControls;

public class Tail extends SubsystemBase {

public void init() {
  MotorControls.setTailPercent(0.0);
  setDefaultCommand(new TailDefault(this));
}

  @Override
  public void periodic() {}

public double getTailCurrent() {
  return MotorControls.tailMotor.getStatorCurrent();
}

}
