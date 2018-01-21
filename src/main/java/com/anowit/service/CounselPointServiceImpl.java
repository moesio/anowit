package com.anowit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anowit.dao.CounselPointDao;
import com.anowit.domain.CounselPoint;
import com.seimos.commons.dao.GenericDao;
import com.seimos.commons.service.GenericServiceImpl;

/**
 * @author moesio
 * @date 2018-01-14 08:52:58
 *
 */
@Service
public class CounselPointServiceImpl extends GenericServiceImpl<CounselPoint, CounselPointDao>
		implements CounselPointService {

	private CounselPointDao counselPointDao;

	@Autowired
	public void setCounselPointDao(CounselPointDao counselPointDao) {
		this.counselPointDao = counselPointDao;
	}

	/* (non-Javadoc)
	 * @see com.seimos.commons.service.GenericServiceImpl#getDao()
	 */
	@Override
	public GenericDao<CounselPoint> getDao() {
		return counselPointDao;
	}

}
