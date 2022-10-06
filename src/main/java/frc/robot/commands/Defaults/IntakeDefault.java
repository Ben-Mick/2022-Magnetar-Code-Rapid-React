package frc.robot.commands.Defaults;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeDefault extends CommandBase {

  private static Intake intake;


  public IntakeDefault(Intake intake) {

    IntakeDefault.intake = intake;
    addRequirements(IntakeDefault.intake);
    
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}