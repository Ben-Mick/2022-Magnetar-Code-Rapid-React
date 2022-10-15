
package frc.robot.commands.AutonomousCommands;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.CatapultCommands.ShootCatapult;
import frc.robot.commands.IntakeCommands.DoIntake;
import frc.robot.commands.IntakeCommands.StopIntake;
import frc.robot.subsystems.Catapult;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shift;

public class Auto2BallGroup extends SequentialCommandGroup {

  public Auto2BallGroup(Drive drive, Catapult catapult, Intake intake, Shift shift) {
    addRequirements(drive, catapult, intake, shift);
    addCommands(
  new ShootCatapult(intake, catapult),
  new ParallelRaceGroup(new DriveBackward(drive, 2.5), new DoIntake(intake)),
  new DriveForward(drive, 2.5),
  new StopIntake(intake),
  new ShootCatapult(intake, catapult)
// new WaitCommand(2),
// new DoIntake(intake),
// new DriveBackward(drive),
// new WaitCommand(0.5),
// new DriveStop(drive),
// new StopIntake(intake),
// new DriveForward(drive),
// new WaitCommand(0.5),
// new DriveStop(drive),
// new ShootCatapult()


    );

  }
}
