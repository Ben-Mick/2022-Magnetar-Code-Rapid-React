
package frc.robot.commands.AutonomousCommands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;
import frc.robot.tools.MotorControls;

public class DriveBackward extends CommandBase {
Drive drive = new Drive();
double runTime = 2.0;
  public DriveBackward(Drive drive, double runTime) {
  this.runTime = runTime;
this.drive = drive;
addRequirements(drive);
  }
double initTime = 0;
  @Override
  public void initialize() {
    initTime = Timer.getFPGATimestamp();
    MotorControls.setDrivePercents(0.5, 0.5);
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {
    MotorControls.stopDrive();
  }

  @Override
  public boolean isFinished() {
    if(Timer.getFPGATimestamp() - initTime > runTime) {
      return true;
    }
    return false;
  }
}
