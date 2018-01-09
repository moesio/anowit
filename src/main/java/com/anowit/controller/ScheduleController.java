package com.anowit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anowit.domain.Schedule;
import com.anowit.service.ScheduleService;
import com.anowit.validator.ScheduleValidator;
import com.seimos.commons.controller.GenericCrudController;

@Controller
@RequestMapping(path = "/schedule")
public class ScheduleController extends GenericCrudController<Schedule> {
	private ScheduleService service;

	private ScheduleValidator validator;

	@Autowired
	public void setProgramService(ScheduleService service) {
		this.service = service;
	}

	@Autowired
	public void setProgramValidator(ScheduleValidator validator) {
		this.validator = validator;
	}

	public ScheduleValidator getValidator() {
		return validator;
	}

	public ScheduleService getService() {
		return service;
	}
}
