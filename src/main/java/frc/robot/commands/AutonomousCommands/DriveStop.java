
package frc.robot.commands.AutonomousCommands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class DriveStop extends CommandBase {
Drive drive = new Drive();
double initTime = 0;
  public DriveStop(Drive drive) {
this.drive = drive;
addRequirements(drive);
  }

  @Override
  public void initialize() {
    initTime = Timer.getFPGATimestamp();
    drive.stopDrive();
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
