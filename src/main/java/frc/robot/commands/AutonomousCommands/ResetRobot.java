
package frc.robot.commands.AutonomousCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.tools.MotorControls;
import frc.robot.tools.PneumaticsControls;

public class ResetRobot extends CommandBase {

  public ResetRobot() {

  }

  @Override
  public void initialize() {
PneumaticsControls.shifterLow();
PneumaticsControls.setIntakeUp();
PneumaticsControls.doLock();
PneumaticsControls.catapultDown();
MotorControls.setDrivePercents(0.0, 0.0);
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
