package com.anowit.service;

import com.anowit.dao.ClassRoomDao;
import com.anowit.domain.ClassRoom;
import com.seimos.commons.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Automatic generated 
 * @author Seimos Framework
 *
 * @date 2017-12-30 10:29:30
 */
@Service
public class ClassRoomServiceImpl extends GenericServiceImpl<ClassRoom, ClassRoomDao> implements ClassRoomService {
  private ClassRoomDao dao;

  @Autowired
  public void setClassRoomDao(ClassRoomDao dao) {
    this.dao = dao;
  }

  public ClassRoomDao getDao() {
    return dao;
  }
}
