package com.anowit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anowit.domain.Privilege;
import com.anowit.service.PrivilegeService;
import com.anowit.validator.PrivilegeValidator;
import com.seimos.commons.controller.GenericCrudController;
import com.seimos.commons.service.GenericService;
import com.seimos.commons.validator.GenericValidator;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 08:46:28 
 *
 */
@Controller
@RequestMapping("/privilege")
public class PrivilegeController extends GenericCrudController<Privilege> {

	private PrivilegeService privilegeService;
	private PrivilegeValidator privilegeValidator;

	@Autowired
	public void setPrivilegeService(PrivilegeService privilegeService) {
		this.privilegeService = privilegeService;
	}

	@Autowired
	public void setPrivilegeValidator(PrivilegeValidator privilegeValidator) {
		this.privilegeValidator = privilegeValidator;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getService()
	 */
	@Override
	public GenericService<Privilege> getService() {
		return privilegeService;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getValidator()
	 */
	@Override
	public GenericValidator<Privilege> getValidator() {
		return privilegeValidator;
	}

}
