package org.firstinspires.ftc.teamcode.Autonomus;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import Library4997.MasqLinearOpMode;
import Library4997.MasqRobot.Direction;

/**
 * This is a basic template copy and paste this class for any auto,
 * refactor the file name to match the auto class title
 */

@Autonomous(name = "ELIJAHHHHHHH-Auto", group = "Template")
@Disabled
public class Elijah extends MasqLinearOpMode implements Constants {
    private int delay = 0;
    public void runLinearOpMode() throws InterruptedException {
        while (!opModeIsActive()) {
            if (controller1.apr()){
                delay += 1000;
            }
            dash.create("DELAY: ", delay);
            dash.create(robot.imu);
            dash.createSticky(robot.imu);
            dash.update();
        }
        waitForStart();
        robot.sleep(delay);
        robot.drive(90, POWER_OPTIMAL, Direction.FORWARD);
        robot.shooter.setPower(-1);
        robot.indexer.setPosition(INDEXER_OPENED);
        robot.turn(45, Direction.LEFT);
        robot.turn(30, Direction.RIGHT);

    }
}