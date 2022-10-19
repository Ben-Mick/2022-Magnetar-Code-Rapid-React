package frc.robot.commands.Defaults;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Catapult;

public class CatapaltDefault extends CommandBase {

  private Catapult catapult;


  public CatapaltDefault(Catapult catapult) {
    this.catapult = catapult;
    addRequirements(this.catapult);
  }

  @Override
  public void initialize() {
    catapult.catapultDown();
    catapult.doLock();
  }

  @Override
  public void execute() {  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}