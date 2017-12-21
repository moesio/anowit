package com.anowit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anowit.dao.PersonDao;
import com.anowit.domain.Person;
import com.seimos.commons.dao.GenericDao;
import com.seimos.commons.service.GenericServiceImpl;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 02:37:03 
 *
 */
@Service
public class PersonServiceImpl extends GenericServiceImpl<Person, PersonDao> implements PersonService {

	private PersonDao personDao;

	@Autowired
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.service.GenericServiceImpl#getDao()
	 */
	@Override
	public GenericDao<Person> getDao() {
		return personDao;
	}

}
