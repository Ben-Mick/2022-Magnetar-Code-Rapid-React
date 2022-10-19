
package frc.robot.commands.ShiftCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shift;

public class ShiftToggle extends CommandBase {

  Shift shift;
  public ShiftToggle(Shift shift) {
this.shift = shift;
addRequirements(this.shift);
  }

  @Override
  public void initialize() {
    shift.shiftToggle();
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
