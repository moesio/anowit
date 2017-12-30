package com.anowit.controller;

import com.anowit.domain.ClassRoom;
import com.anowit.service.ClassRoomService;
import com.anowit.validator.ClassRoomValidator;
import com.seimos.commons.controller.GenericCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(
    path = "/classRoom"
)
public class ClassRoomController extends GenericCrudController<ClassRoom> {
  private ClassRoomService service;

  private ClassRoomValidator validator;

  @Autowired
  public void setClassRoomService(ClassRoomService service) {
    this.service = service;
  }

  @Autowired
  public void setClassRoomValidator(ClassRoomValidator validator) {
    this.validator = validator;
  }

  public ClassRoomValidator getValidator() {
    return validator;
  }

  public ClassRoomService getService() {
    return service;
  }
}
