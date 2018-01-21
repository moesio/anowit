package com.anowit.service;

import com.anowit.dao.SongDao;
import com.anowit.domain.Song;
import com.seimos.commons.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Automatic generated 
 * @author Seimos Framework
 *
 * @date 2018-01-12 22:57:30
 */
@Service
public class SongServiceImpl extends GenericServiceImpl<Song, SongDao> implements SongService {
  private SongDao dao;

  @Autowired
  public void setSongDao(SongDao dao) {
    this.dao = dao;
  }

  public SongDao getDao() {
    return dao;
  }
}
