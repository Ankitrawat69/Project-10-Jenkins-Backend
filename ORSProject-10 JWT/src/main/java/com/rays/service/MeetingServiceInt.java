package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.MeetingDTO;

//MeetingServiceInt

public interface MeetingServiceInt extends BaseServiceInt<MeetingDTO>{
	
	public MeetingDTO findByName(String name, UserContext userContext);
}
