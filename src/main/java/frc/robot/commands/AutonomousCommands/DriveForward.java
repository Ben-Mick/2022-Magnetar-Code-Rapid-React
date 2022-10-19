
package frc.robot.commands.AutonomousCommands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class DriveForward extends CommandBase {
Drive drive = new Drive();
double runTime = 2.0;
  public DriveForward(Drive drive, double runtime) {
this.drive = drive;
addRequirements(drive);
  }
double initTime = 0;
  @Override
  public void initialize() {
    initTime = Timer.getFPGATimestamp();
    drive.setDrivePercents(-0.5, -0.5);
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {
    drive.stopDrive();
  }

  @Override
  public boolean isFinished() {
    if(Timer.getFPGATimestamp() - initTime > runTime) {
      return true;
    }
    return false;
  }
}
