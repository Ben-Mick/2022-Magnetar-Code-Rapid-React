package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Defaults.CatapaltDefault;

public class Catapult extends SubsystemBase {

  private final static DoubleSolenoid lockSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 3);//catapult
  private final static DoubleSolenoid catapultSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 6, 1);//catapult


  public void catapultUp() {//catapult
      catapultSolenoid.set(Value.kReverse);
    }
    
    public void doLock() {//catapult
      lockSolenoid.set(Value.kReverse);
    }
    
    public void unLock() {//catapult
      lockSolenoid.set(Value.kForward);
    }
    
    public void catapultDown() {//catapult
      catapultSolenoid.set(Value.kForward);
    }

  public Catapult() {

  }

  public void init() {
    setDefaultCommand(new CatapaltDefault(this));
  }
  
  @Override
  public void periodic() {
   
  }
}
