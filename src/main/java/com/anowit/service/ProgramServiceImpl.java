package com.anowit.service;

import com.anowit.dao.ProgramDao;
import com.anowit.domain.Program;
import com.seimos.commons.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Automatic generated 
 * @author Seimos Framework
 *
 * @date 2017-12-30 18:01:31
 */
@Service
public class ProgramServiceImpl extends GenericServiceImpl<Program, ProgramDao> implements ProgramService {
  private ProgramDao dao;

  @Autowired
  public void setProgramDao(ProgramDao dao) {
    this.dao = dao;
  }

  public ProgramDao getDao() {
    return dao;
  }
}
