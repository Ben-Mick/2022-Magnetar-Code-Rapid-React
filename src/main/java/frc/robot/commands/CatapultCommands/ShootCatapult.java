
package frc.robot.commands.CatapultCommands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Catapult;

public class ShootCatapult extends SequentialCommandGroup {

  public ShootCatapult() {

Catapult shoot = new Catapult();

    addCommands(
new PrepCatapult(shoot),
new WaitCommand(1.75),
new ReleaseCatapult(shoot),
new WaitCommand(1.5),
new CatapultDown(shoot),
new WaitCommand(1),
new ResetCatapult(shoot),
new WaitCommand(1),
new CatapultUp(shoot)
    );
  }
}
