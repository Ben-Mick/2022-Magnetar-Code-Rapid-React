
package frc.robot.commands.IntakeCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;
import frc.robot.tools.MotorControls;
import frc.robot.tools.PneumaticsControls;

public class StopIntake extends CommandBase {
Intake intake = new Intake();
  public StopIntake(Intake intake) {
this.intake = intake;
addRequirements(intake);
  }

  @Override
  public void initialize() {
    MotorControls.stopIntake();
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
