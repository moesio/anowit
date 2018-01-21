package com.anowit.controller;

import com.anowit.domain.Song;
import com.anowit.service.SongService;
import com.anowit.validator.SongValidator;
import com.seimos.commons.controller.GenericCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(
    path = "/song"
)
public class SongController extends GenericCrudController<Song> {
  private SongService service;

  private SongValidator validator;

  @Autowired
  public void setSongService(SongService service) {
    this.service = service;
  }

  @Autowired
  public void setSongValidator(SongValidator validator) {
    this.validator = validator;
  }

  public SongValidator getValidator() {
    return validator;
  }

  public SongService getService() {
    return service;
  }
}
