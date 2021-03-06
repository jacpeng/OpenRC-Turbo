package org.firstinspires.ftc.teamcode.Auto.RandomTests;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import static org.firstinspires.ftc.teamcode.NonRunnable.Functions.ImuFunctions.correctToHeading;
import static org.firstinspires.ftc.teamcode.NonRunnable.Functions.ImuFunctions.turn;
import static org.firstinspires.ftc.teamcode.NonRunnable.NvyusRobot.Hardware.initHardware;

@Autonomous
public class TurnAndCorrectTest extends LinearOpMode
{
    @Override
    public void runOpMode() throws InterruptedException
    {
        initHardware(this);
        
        telemetry.addLine("ready");
        telemetry.update();
        
        waitForStart();
        
        turn(-90, this);
        correctToHeading(0, this);
        turn(-90, this);
        correctToHeading(-90, this);
    }
}
