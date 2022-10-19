package frc.robot.commands.Defaults;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Tail;

public class TailDefault extends CommandBase {

  private static Tail tail;

  public TailDefault(Tail tail) {
    TailDefault.tail = tail;
    addRequirements(TailDefault.tail);
  }

  @Override
  public void initialize() {
    tail.tailStop();
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}