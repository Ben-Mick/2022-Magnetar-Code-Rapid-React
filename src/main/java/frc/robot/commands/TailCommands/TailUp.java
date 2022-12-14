
package frc.robot.commands.TailCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Tail;

public class TailUp extends CommandBase {
  Tail tail;
  public TailUp(Tail tail) {
    this.tail = tail;
    addRequirements(this.tail);
  }

  @Override
  public void initialize() {
    tail.tailUp();
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {
    tail.tailStop();
  }

  @Override
  public boolean isFinished() {
    if(Math.abs(tail.getTailCurrent()) > 20) {
      return true;
    } else {
      return false;
    }
  }
}
