package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Elevator {
    Robot R;
    DcMotor elevator_right;
    DcMotor elevator_left;
    HardwareMap hwd;

    public Elevator (HardwareMap hwd, Robot R) {
        this.R = R;
        this.hwd = hwd;
        elevator_right = hwd.get(DcMotor.class, "elv_r");
        elevator_left = hwd.get(DcMotor.class, "elv_l");

        elevator_right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        elevator_left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void EvevatorMove(double power) {
        if (power > 0) {
            elevator_right.setPower(power * 1);
            elevator_left.setPower(power * 1);
        } else {
            elevator_right.setPower(power);
            elevator_left.setPower(power);
        }
    }
}

