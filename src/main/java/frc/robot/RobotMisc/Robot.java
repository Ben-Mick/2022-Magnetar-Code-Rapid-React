
package frc.robot.RobotMisc;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.commands.AutonomousCommands.Auto2BallGroup;
import frc.robot.commands.AutonomousCommands.ResetRobot;
import frc.robot.commands.CatapultCommands.ShootCatapult;
import frc.robot.commands.IntakeCommands.IntakeBalls;
import frc.robot.commands.IntakeCommands.OutakeBalls;
import frc.robot.commands.IntakeCommands.StopIntake;
import frc.robot.commands.ShiftCommands.ShiftHigh;
import frc.robot.commands.ShiftCommands.ShiftLow;
import frc.robot.commands.ShiftCommands.ShiftToggle;
import frc.robot.commands.TailCommands.TailDown;
import frc.robot.commands.TailCommands.TailUp;
import frc.robot.subsystems.Catapult;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shift;
import frc.robot.subsystems.Tail;

public class Robot extends TimedRobot {
  private Command m_autonomousCommand;

  private RobotContainer m_robotContainer;

private final Drive drive = new Drive();
private final Intake intake = new Intake();
private final Tail tail = new Tail();
private final Catapult catapult = new Catapult();
private final Shift shift = new Shift();

private final Auto2BallGroup twoBallAuto = new Auto2BallGroup(drive, catapult, intake, shift);

  @Override
  public void robotInit() {
    m_robotContainer = new RobotContainer();

    drive.init();
  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }

    twoBallAuto.schedule();

  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
   // new ResetRobot();
   new StopIntake(intake);
catapult.init();
    drive.init();
    drive.periodic();
    OI.driveMenu.whenPressed(new ResetRobot());
  OI.driverY.whenPressed(new TailUp(tail));
  OI.driverA.whenPressed(new TailDown(tail));
  OI.driverX.whenPressed(new ShootCatapult(intake, catapult));
  OI.driverB.whenPressed(new ShiftToggle(shift));
  OI.driverLB.whenPressed(new ShiftLow(shift));
  OI.driverRB.whenPressed(new ShiftHigh(shift));
 OI.driverRTrig.whenPressed(new IntakeBalls(intake));
OI.driverLTrig.whenPressed(new OutakeBalls(intake));
  }

  @Override
  public void teleopPeriodic() {}

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
