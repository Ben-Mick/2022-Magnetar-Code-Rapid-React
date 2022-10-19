package frc.robot.commands.CatapultCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Catapult;

public class CatapultDown extends CommandBase {
 Catapult shoot = new Catapult();
  public CatapultDown(Catapult shoot) {
    this.shoot = shoot;
addRequirements(shoot);
  }

  @Override
  public void initialize() {
    shoot.catapultDown();
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