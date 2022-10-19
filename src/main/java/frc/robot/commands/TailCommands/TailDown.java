
package frc.robot.commands.TailCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Tail;

public class TailDown extends CommandBase {
  Tail tail;
  public TailDown(Tail tail) {
    this.tail = tail;
    addRequirements(this.tail);
  }

  @Override
  public void initialize() {
    tail.tailDown();
  }

  @Override
  public void execute() {System.out.println(tail.getTailCurrent());}

  @Override
  public void end(boolean interrupted) {
    tail.tailStop();
}

  @Override
  public boolean isFinished() {
    if(tail.getTailCurrent() > 17 || tail.getTailCurrent() < -17) {
      return true;
    }
    return false;
  }
}
