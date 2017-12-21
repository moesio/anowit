package com.anowit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anowit.dao.GroupDao;
import com.anowit.domain.Group;
import com.seimos.commons.dao.GenericDao;
import com.seimos.commons.service.GenericServiceImpl;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 01:30:05 
 *
 */
@Service
public class GroupServiceImpl extends GenericServiceImpl<Group, GroupDao> implements GroupService {

	private GroupDao groupDao;

	@Autowired
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.service.GenericServiceImpl#getDao()
	 */
	@Override
	public GenericDao<Group> getDao() {
		return groupDao;
	}

}
