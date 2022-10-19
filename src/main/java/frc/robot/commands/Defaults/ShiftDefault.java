
package frc.robot.commands.Defaults;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shift;

public class ShiftDefault extends CommandBase {
 
private static Shift shift;

  public ShiftDefault(Shift shift) {
    ShiftDefault.shift = shift;
    addRequirements(ShiftDefault.shift);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
