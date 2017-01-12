package org.team3128.common.util.datatypes;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Class to store PID constants.
 * @author Jamie
 *
 */
public class PIDConstants
{
	private double kP, kI, kD;
	
	private boolean usingSmartDashboard = false;
	
	//SmartDashboard keys
	String kPKey, kIKey, kDKey;
	
	
	public PIDConstants(double kP, double kI, double kD)
	{
		this.kP = kP;
		
		this.kI = kI;
		
		this.kD = kD;
	}
	
	public PIDConstants(double kP)
	{
		this.kP = kP;
		
		this.kI = 0;
		
		this.kD = 0;
	}
	
	public double getkP()
	{
		updateFromDashboard();
		return kP;
	}

	public double getkI()
	{
		updateFromDashboard();
		return kI;
	}

	public double getkD()
	{
		updateFromDashboard();
		return kD;
	}

	/**
	 * Put these values on the SmartDashboard so they can be edited by the user.
	 * 
	 * @param name The prefix to the name that the values will have on the dashboard.  Will look like "kP for <prefix>"
	 */
	public void putOnSmartDashboard(String name)
	{
		usingSmartDashboard = true;
		
		kPKey= "kP for " + name;
		kIKey= "kI for " + name;
		kDKey= "kD for " + name;

		SmartDashboard.putNumber(kPKey, kP);
		SmartDashboard.putNumber(kIKey, kI);
		SmartDashboard.putNumber(kDKey, kD);

	}
	
	/**
	 * Reads the constants from the SmartDashboard if necessary
	 */
	private void updateFromDashboard()
	{
		if(usingSmartDashboard)
		{
			kP = SmartDashboard.getNumber(kPKey);
			kI = SmartDashboard.getNumber(kIKey);
			kD = SmartDashboard.getNumber(kDKey);

		}
	}
}