
package frc.robot.commands.IntakeCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class DoIntake extends CommandBase {
  double runtime = 0.0;
Intake intake = new Intake();
  public DoIntake(Intake intake) {
this.intake = intake;
addRequirements(intake);
  }

  @Override
  public void initialize() {
    intake.setIntakeDown();
    intake.doIntake();
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
