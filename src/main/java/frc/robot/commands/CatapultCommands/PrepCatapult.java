
package frc.robot.commands.CatapultCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Catapult;
import frc.robot.subsystems.Intake;

public class PrepCatapult extends CommandBase {
  Catapult shoot = new Catapult();
  Intake intake = new Intake();
  public PrepCatapult(Catapult shoot, Intake intake) {
    this.shoot = shoot;
    this.intake = intake;
    addRequirements(shoot);
    addRequirements(intake);
  }

  @Override
  public void initialize() {
    intake.setIntakeDown();
    shoot.catapultUp();
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
