package frc.robot.commands.CatapultCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Catapult;
import frc.robot.subsystems.Intake;

public class ResetCatapult extends CommandBase {

  public ResetCatapult(Catapult shoot, Intake intake) {
addRequirements(shoot);
addRequirements(intake);
  }

  @Override
  public void initialize() {
    Catapult.doLock();
    Intake.setIntakeUp();
    // Catapult.catapultDown();
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

