package frc.robot.commands.CatapultCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Catapult;
import frc.robot.tools.PneumaticsControls;

public class CatapultUp extends CommandBase {

  public CatapultUp(Catapult shoot) {
addRequirements(shoot);
  }

  @Override
  public void initialize() {
    PneumaticsControls.catapultUp();
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