

package frc.robot.commands.ShiftCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shift;
import frc.robot.tools.PneumaticsControls;

public class ShiftHigh extends CommandBase {
  Shift shift;
  public ShiftHigh(Shift shift) {
this.shift = shift;
addRequirements(this.shift);
  }

  @Override
  public void initialize() {
    PneumaticsControls.shifterHigh();
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
