package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.NotificationChannelDTO;
import com.rays.form.NotificationChannelForm;
import com.rays.service.NotificationChannelServiceInt;

@RestController
@RequestMapping(value = "Notification")
public class NotificationChannelCtl extends BaseCtl<NotificationChannelForm, NotificationChannelDTO, NotificationChannelServiceInt> {

}
