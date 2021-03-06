package org.fog.scheduler;

import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.ResCloudlet;

public class TupleScheduler extends CloudletSchedulerTimeShared {

	public TupleScheduler(double mips, int numberOfPes) {
		super();
	}

	/**
	 * Get estimated cloudlet completion time.
	 * 
	 * @param rcl
	 *        the rcl
	 * @param time
	 *        the time
	 * @return the estimated finish time
	 */
	public double getEstimatedFinishTime(ResCloudlet rcl, double time) {

		return time + ((rcl.getRemainingCloudletLength()) / getTotalCurrentAllocatedMipsForCloudlet(rcl, time));
	}
}
