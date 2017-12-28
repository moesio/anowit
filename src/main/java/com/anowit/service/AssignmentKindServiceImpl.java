package com.anowit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anowit.dao.AssignmentKindDao;
import com.anowit.domain.AssignmentKind;
import com.seimos.commons.dao.GenericDao;
import com.seimos.commons.service.GenericServiceImpl;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 11:04:52 
 *
 */
@Service
public class AssignmentKindServiceImpl extends GenericServiceImpl<AssignmentKind, AssignmentKindDao>
		implements AssignmentKindService {

	private AssignmentKindDao assignmentKindDao;

	/* (non-Javadoc)
	 * @see com.seimos.commons.service.GenericServiceImpl#getDao()
	 */
	@Override
	public GenericDao<AssignmentKind> getDao() {
		return assignmentKindDao;
	}

	@Autowired
	public void setAssignmentKindDao(AssignmentKindDao assignmentKindDao) {
		this.assignmentKindDao = assignmentKindDao;
	}

}
