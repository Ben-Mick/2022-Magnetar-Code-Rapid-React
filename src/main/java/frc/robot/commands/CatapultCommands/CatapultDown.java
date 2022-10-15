package frc.robot.commands.CatapultCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Catapult;

public class CatapultDown extends CommandBase {

  public CatapultDown(Catapult shoot) {
addRequirements(shoot);
  }

  @Override
  public void initialize() {
    Catapult.catapultDown();
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