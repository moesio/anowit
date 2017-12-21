package com.anowit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anowit.domain.Group;
import com.anowit.service.GroupService;
import com.anowit.validator.GroupValidator;
import com.seimos.commons.controller.GenericCrudController;
import com.seimos.commons.service.GenericService;
import com.seimos.commons.validator.GenericValidator;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 01:32:22 
 *
 */
@Controller
@RequestMapping("/group")
public class GroupController extends GenericCrudController<Group> {

	private GroupService groupService;
	private GroupValidator groupValidator;

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getService()
	 */
	@Override
	public GenericService<Group> getService() {
		return groupService;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getValidator()
	 */
	@Override
	public GenericValidator<Group> getValidator() {
		return groupValidator;
	}

	@Autowired
	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}

	@Autowired
	public void setGroupValidator(GroupValidator groupValidator) {
		this.groupValidator = groupValidator;
	}

}
