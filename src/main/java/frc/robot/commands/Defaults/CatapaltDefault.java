package frc.robot.commands.Defaults;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Catapult;
import frc.robot.tools.PneumaticsControls;

public class CatapaltDefault extends CommandBase {

  private static Catapult catapult;


  public CatapaltDefault(Catapult catapult) {
    CatapaltDefault.catapult = catapult;
    addRequirements(CatapaltDefault.catapult);
  }

  @Override
  public void initialize() {
    PneumaticsControls.catapultUp();
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