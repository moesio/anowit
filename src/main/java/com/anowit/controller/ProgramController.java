package com.anowit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anowit.domain.Program;
import com.anowit.service.ProgramService;
import com.anowit.validator.ProgramValidator;
import com.seimos.commons.controller.GenericCrudController;

@Controller
@RequestMapping(path = "/program")
public class ProgramController extends GenericCrudController<Program> {
	private ProgramService service;

	private ProgramValidator validator;

	@Autowired
	public void setProgramService(ProgramService service) {
		this.service = service;
	}

	@Autowired
	public void setProgramValidator(ProgramValidator validator) {
		this.validator = validator;
	}

	public ProgramValidator getValidator() {
		return validator;
	}

	public ProgramService getService() {
		return service;
	}
}
