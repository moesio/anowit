package com.anowit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anowit.dao.PrivilegeDao;
import com.anowit.domain.Privilege;
import com.seimos.commons.dao.GenericDao;
import com.seimos.commons.service.GenericServiceImpl;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 08:44:45 
 *
 */
@Service
public class PrivilegeServiceImpl extends GenericServiceImpl<Privilege, PrivilegeDao> implements PrivilegeService {

	private PrivilegeDao privilegeDao;

	@Autowired
	public void setPrivilegeDao(PrivilegeDao privilegeDao) {
		this.privilegeDao = privilegeDao;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.service.GenericServiceImpl#getDao()
	 */
	@Override
	public GenericDao<Privilege> getDao() {
		return privilegeDao;
	}

}
