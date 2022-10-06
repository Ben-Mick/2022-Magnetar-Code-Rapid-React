
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Defaults.ShiftDefault;
import frc.robot.tools.PneumaticsControls;

public class Shift extends SubsystemBase {

public boolean isGearLow = true;

public void init() {
  PneumaticsControls.shifterLow();
  setDefaultCommand(new ShiftDefault(this));
}

public static void shiftToggle() {
  if(PneumaticsControls.getShift() == Value.kReverse) {
    PneumaticsControls.shifterHigh();
  } else {
    PneumaticsControls.shifterLow();
  }
}

  @Override
  public void periodic() {
   
  }
}
