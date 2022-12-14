
package frc.robot.commands.IntakeCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;
import frc.robot.tools.OI;

public class OutakeBalls extends CommandBase {
  Intake intake;
  public OutakeBalls(Intake intake) {
    this.intake = intake;
    addRequirements(this.intake);
  }

  @Override
  public void initialize() {
    intake.doOutake();
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {
    intake.stopIntake();
  }

  @Override
  public boolean isFinished() {
    if(OI.getDriverLeftTrigger() < 0.02) {
      return true;
    } else {
      return false;
    }
  }
}
