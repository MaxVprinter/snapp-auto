package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.tuner.Procedure;
import com.pedropathing.tuner.Tuner;

public class Tuning {
    // Tuners go here
    @Tuner
public static Procedure mecanumTuner() {
    return new MecanumTuner();
}
}
