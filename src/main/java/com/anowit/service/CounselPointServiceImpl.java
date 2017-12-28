package com.anowit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anowit.dao.CounselPointDao;
import com.anowit.domain.CounselPoint;
import com.seimos.commons.dao.GenericDao;
import com.seimos.commons.service.GenericServiceImpl;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 18:46:55 
 *
 */
@Service
public class CounselPointServiceImpl extends GenericServiceImpl<CounselPoint, CounselPointDao>
		implements CounselPointService {

	private CounselPointDao counselPointDao;

	/* (non-Javadoc)
	 * @see com.seimos.commons.service.GenericServiceImpl#getDao()
	 */
	@Override
	public GenericDao<CounselPoint> getDao() {
		return counselPointDao;
	}

	@Autowired
	public void setCounselPointDao(CounselPointDao counselPointDao) {
		this.counselPointDao = counselPointDao;
	}

}
