package com.anowit.service;

import com.anowit.dao.ScheduleDao;
import com.anowit.domain.Schedule;
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
public class ScheduleServiceImpl extends GenericServiceImpl<Schedule, ScheduleDao> implements ScheduleService {
  private ScheduleDao dao;

  @Autowired
  public void setProgramDao(ScheduleDao dao) {
    this.dao = dao;
  }

  public ScheduleDao getDao() {
    return dao;
  }
}
