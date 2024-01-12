package org.firstinspires.ftc.teamcode.robot;

import static java.lang.Thread.sleep;

//import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

//@Config
public class Plane {
    Robot R;
    Servo PlaneSer;
    HardwareMap hwd;

    public static double closeA = 0;
    public static double openA = 1;
    public static double closeB = 1;
    public static double openB = 0.4;

    public Plane(HardwareMap hwd, Robot R) {
        this.R = R;
        this.hwd = hwd;
        PlaneSer = hwd.get(Servo.class, "PS");
    }

    public void close() {
        PlaneSer.setPosition(0);
    }

    public void open() {
        PlaneSer.setPosition(1);
    }

    boolean flag = false;
    public void PlaneMove(boolean position12) throws InterruptedException {
        if (position12) {
            flag = !flag;
            sleep(200);
        }
        if (!flag) {
            close();
        } else {
            open();
        }
        R.tele.addData("flag:", flag);

    }
}
