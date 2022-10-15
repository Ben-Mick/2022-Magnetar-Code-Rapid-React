
package frc.robot.commands.CatapultCommands;

import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Catapult;
import frc.robot.subsystems.Intake;

public class StartCatapult extends SequentialCommandGroup {

  public StartCatapult() {

    Catapult shoot = new Catapult();
Intake intake = new Intake();
    addCommands(
new CatapultDown(shoot),
new WaitCommand(1),
new ResetCatapult(shoot, intake),
new PrintCommand("||||||||||||||||||Print Command|||||||||||||||||||||")
    );
  }
}
