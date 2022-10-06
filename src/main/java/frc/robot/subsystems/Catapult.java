package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.tools.PneumaticsControls;

public class Catapult extends SubsystemBase {

  public Catapult() {

  }

  public void init() {
    PneumaticsControls.catapultDown();
    PneumaticsControls.doLock();
  }
  
  @Override
  public void periodic() {
   
  }
}
