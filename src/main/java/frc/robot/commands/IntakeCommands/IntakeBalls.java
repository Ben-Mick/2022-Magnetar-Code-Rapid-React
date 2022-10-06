
package frc.robot.commands.IntakeCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotMisc.OI;
import frc.robot.subsystems.Intake;
import frc.robot.tools.MotorControls;
import frc.robot.tools.PneumaticsControls;

public class IntakeBalls extends CommandBase {
  Intake intake;
  public IntakeBalls(Intake intake) {
    this.intake = intake;
    addRequirements(this.intake);
  }

  @Override
  public void initialize() {
    PneumaticsControls.setIntakeDown();
    MotorControls.doIntake();
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {
    PneumaticsControls.setIntakeUp();
    MotorControls.stopIntake();
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
