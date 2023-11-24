package org.firstinspires.ftc.teamcode.autonomus;

//import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.robot.Robot;

//@Config
@Autonomous
public class Autonomus_Pos2_blue extends LinearOpMode {
    public static int timeX = 1150;
    public static int timeY = 1500;
    public static int pos = 21;
    public static double voltage = 12.74;

    @Override
    public void runOpMode() throws InterruptedException {
        Robot R = new Robot();


        R.init(this);

        waitForStart();
//        while (!isStarted()) {
////            pos = R.cam.currentVisableId();     // 21, 22, 23
//        }

        timeX *= voltage / R.voltageSensor.getVoltage();
        timeY *= voltage / R.voltageSensor.getVoltage();

        R.dr.followDirection(1, 0, 0, false, false);
        sleep(1200);
        R.dr.followDirection(0, 0, 0, false, false);
    }
}
