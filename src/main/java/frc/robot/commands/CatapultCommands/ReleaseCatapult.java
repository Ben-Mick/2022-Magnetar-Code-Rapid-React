
package frc.robot.commands.CatapultCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Catapult;

public class ReleaseCatapult extends CommandBase {

  public ReleaseCatapult(Catapult shoot) {
addRequirements(shoot);
  }

  @Override
  public void initialize() {
    Catapult.unLock();
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


