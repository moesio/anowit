package com.anowit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anowit.domain.CounselPoint;
import com.anowit.service.CounselPointService;
import com.anowit.validator.CounselPointValidator;
import com.seimos.commons.controller.GenericCrudController;
import com.seimos.commons.service.GenericService;
import com.seimos.commons.validator.GenericValidator;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 18:48:30 
 *
 */
@Controller
@RequestMapping("/counselPoint")
public class CounselPointController extends GenericCrudController<CounselPoint> {

	private CounselPointService counselPointService;
	private CounselPointValidator counselPointValidator;

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getService()
	 */
	@Override
	public GenericService<CounselPoint> getService() {
		return counselPointService;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getValidator()
	 */
	@Override
	public GenericValidator<CounselPoint> getValidator() {
		return counselPointValidator;
	}

	@Autowired
	public void setCounselPointService(CounselPointService counselPointService) {
		this.counselPointService = counselPointService;
	}

	@Autowired
	public void setCounselPointValidator(CounselPointValidator counselPointValidator) {
		this.counselPointValidator = counselPointValidator;
	}

}
