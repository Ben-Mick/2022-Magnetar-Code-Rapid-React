
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Defaults.ShiftDefault;

public class Shift extends SubsystemBase {

  private final static DoubleSolenoid shiftersSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 7, 0);//shift

  public Value getShift() {//shift
   return shiftersSolenoid.get();
  }
  
  public  void shifterLow() {//shift
    shiftersSolenoid.set(Value.kReverse);
  }
  
  public  void shifterHigh() {//shift
    shiftersSolenoid.set(Value.kForward);
  }
  
  public  void toggleShifter() {//shift
    shiftersSolenoid.toggle();
  }

public boolean isGearLow = true;

public void init() {
  shifterLow();
  setDefaultCommand(new ShiftDefault(this));
}

public void shiftToggle() {
  if(getShift() == Value.kReverse) {
    shifterHigh();
  } else {
    shifterLow();
  }
}

  @Override
  public void periodic() {
   
  }
}
