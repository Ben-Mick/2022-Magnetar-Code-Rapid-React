
package frc.robot.commands.CatapultCommands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Catapult;
import frc.robot.subsystems.Intake;

public class ShootCatapult extends SequentialCommandGroup {

  public ShootCatapult(Intake intake, Catapult shoot) {

    addRequirements(intake, shoot);

    addCommands(
new PrepCatapult(shoot, intake),
new WaitCommand(2.5),
new ReleaseCatapult(shoot),
new WaitCommand(1.5),
new CatapultDown(shoot),
new WaitCommand(1),
new ResetCatapult(shoot, intake),
new WaitCommand(1),
new CatapultUp(shoot)
    );
  }
}
