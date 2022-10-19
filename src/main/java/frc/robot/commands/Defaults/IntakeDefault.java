package frc.robot.commands.Defaults;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeDefault extends CommandBase {

  private  Intake intake = new Intake();


  public IntakeDefault(Intake intake) {

    this.intake = intake;
    addRequirements(intake);
    
  }

  @Override
  public void initialize() {
    intake.setIntakeUp();
    intake.stopIntake();
  }

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