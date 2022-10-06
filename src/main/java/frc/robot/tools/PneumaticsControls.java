package frc.robot.tools;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class PneumaticsControls {

    private final static DoubleSolenoid intakeSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 5, 2);
    private final static DoubleSolenoid lockSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 3);
    private final static DoubleSolenoid catapultSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 6, 1);
    private final static DoubleSolenoid shiftersSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 7, 0);

public static Value getShift() {
 return shiftersSolenoid.get();
}

public static void shifterLow() {
  shiftersSolenoid.set(Value.kReverse);
}

public static void shifterHigh() {
  shiftersSolenoid.set(Value.kForward);
}

public static void toggleShifter() {
  System.out.println("it work seruiwfjdbyuhtidvjnhn");
  shiftersSolenoid.toggle();
}

    public static void catapultUp() {
        catapultSolenoid.set(Value.kReverse);
      }
      
      public static void doLock() {
        lockSolenoid.set(Value.kReverse);
      }
      
      public static void unLock() {
        lockSolenoid.set(Value.kForward);
      }
      
      public static void catapultDown() {
        catapultSolenoid.set(Value.kForward);
      }

    public static void setIntakeUp() {
        intakeSolenoid.set(Value.kReverse);
    }

    public static void setIntakeDown() {
        intakeSolenoid.set(Value.kForward);
    }

public static void startCompressor() {
  intakeSolenoid.get();
}

}