package org.team3128.common.autonomous;

import org.team3128.common.hardware.lights.LightsColor;
import org.team3128.common.hardware.lights.PWMLights;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoNothingAuto extends CommandGroup {
    
	public DoNothingAuto(PWMLights lights)
	{
		lights.setColor(LightsColor.new8Bit(0xff, 0, 0));
    }
}
