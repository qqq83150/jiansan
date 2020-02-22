package com.youzhong.constant;

import java.text.SimpleDateFormat;

public interface Dictionary {

	public static final int TASK_STATUS_NEW = 1;
	
	public static final int TASK_STATUS_COMPLETE = 2;
	
	public static final int TASK_STATUS_CLOSE = 3;
	
	public static final int TASK_STATUS_REVOKE = 4;
	
	public static final int TASK_STATUS_COMPLETE_TODAY = 5;
	
	public static final int PAY_STATUS_NOT_COMPLETE_PAY = 1;
	
	public static final int PAY_STATUS_COMPLETED_PAY = 2;
	
	public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
	
}
