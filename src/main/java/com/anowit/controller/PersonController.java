/**
 * 
 */
package com.anowit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anowit.domain.Person;
import com.anowit.service.PersonService;
import com.anowit.validator.PersonValidator;
import com.seimos.commons.controller.GenericCrudController;
import com.seimos.commons.service.GenericService;
import com.seimos.commons.validator.GenericValidator;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 02:39:02 
 *
 */
@Controller
@RequestMapping("/person")
public class PersonController extends GenericCrudController<Person> {

	private PersonService personService;
	private PersonValidator personValidator;

	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@Autowired
	public void setPersonValidator(PersonValidator personValidator) {
		this.personValidator = personValidator;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getService()
	 */
	@Override
	public GenericService<Person> getService() {
		return personService;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.controller.GenericCrudController#getValidator()
	 */
	@Override
	public GenericValidator<Person> getValidator() {
		return personValidator;
	}

}
