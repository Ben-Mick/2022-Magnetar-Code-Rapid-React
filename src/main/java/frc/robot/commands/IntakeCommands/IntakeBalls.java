
package frc.robot.commands.IntakeCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;
import frc.robot.tools.OI;

public class IntakeBalls extends CommandBase {
  Intake intake;
  public IntakeBalls(Intake intake) {
    this.intake = intake;
    addRequirements(this.intake);
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
    intake.setIntakeUp();
    intake.stopIntake();
  }

  @Override
  public boolean isFinished() {
    if(OI.getDriverRightTrigger() < 0.02) {
      return true;
    } else {
      return false;
    }
}

}
