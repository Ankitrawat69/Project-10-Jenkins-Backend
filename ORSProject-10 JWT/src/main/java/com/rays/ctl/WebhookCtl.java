package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.WebhookDTO;
import com.rays.form.WebhookForm;
import com.rays.service.WebhookServiceInt;

@RestController
@RequestMapping(value = "Webhook")
public class WebhookCtl extends BaseCtl<WebhookForm, WebhookDTO, WebhookServiceInt> {

}
