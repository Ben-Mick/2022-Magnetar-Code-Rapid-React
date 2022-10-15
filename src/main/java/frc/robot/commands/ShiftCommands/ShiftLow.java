

package frc.robot.commands.ShiftCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shift;

public class ShiftLow extends CommandBase {
  Shift shift;
  public ShiftLow(Shift shift) {
this.shift = shift;
addRequirements(this.shift);
  }

  @Override
  public void initialize() {
    Shift.shifterLow();
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return true;
  }
}
