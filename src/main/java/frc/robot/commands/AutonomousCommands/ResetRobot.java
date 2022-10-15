
package frc.robot.commands.AutonomousCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Catapult;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shift;

public class ResetRobot extends CommandBase {

  public ResetRobot() {

  }

  @Override
  public void initialize() {
Shift.shifterLow();
Intake.setIntakeUp();
Catapult.doLock();
Catapult.catapultDown();
Drive.setDrivePercents(0.0, 0.0);
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
