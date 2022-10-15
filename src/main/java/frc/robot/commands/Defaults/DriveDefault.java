
package frc.robot.commands.Defaults;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;
import frc.robot.tools.OI;
public class DriveDefault extends CommandBase {

  private static Drive drive;


  public DriveDefault(Drive drive) {

    DriveDefault.drive = drive;
    addRequirements(DriveDefault.drive);
    
  }

  @Override
  public void initialize() {

  }

  @Override
  public void execute() {
    drive.arcadeDrive(OI.getDriverLeftY(), OI.getDriverRightX());
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
