package com.anowit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anowit.domain.AssignmentKind;
import com.anowit.service.AssignmentKindService;
import com.anowit.validator.AssignmentKindValidator;
import com.seimos.commons.controller.GenericCrudController;
import com.seimos.commons.service.GenericService;
import com.seimos.commons.validator.GenericValidator;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 11:06:14 
 *
 */
@Controller
@RequestMapping("/assignmentKind")
public class AssignmentKindController extends GenericCrudController<AssignmentKind> {

	private AssignmentKindService assignmentKindService;
	private AssignmentKindValidator assignmentKindValidator;

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getService()
	 */
	@Override
	public GenericService<AssignmentKind> getService() {
		return assignmentKindService;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getValidator()
	 */
	@Override
	public GenericValidator<AssignmentKind> getValidator() {
		return assignmentKindValidator;
	}

	@Autowired
	public void setAssignmentKindService(AssignmentKindService assignmentKindService) {
		this.assignmentKindService = assignmentKindService;
	}

	@Autowired
	public void setAssignmentKindValidator(AssignmentKindValidator assignmentKindValidator) {
		this.assignmentKindValidator = assignmentKindValidator;
	}

}
