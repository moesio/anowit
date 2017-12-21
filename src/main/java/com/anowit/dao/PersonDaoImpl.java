package com.anowit.dao;

import org.springframework.stereotype.Repository;

import com.anowit.domain.Person;
import com.seimos.commons.dao.GenericDaoImpl;

/**
 * @author moesio.medeiros
 * @date 21 de dez de 2017 02:35:51 
 *
 */
@Repository
public class PersonDaoImpl extends GenericDaoImpl<Person> implements PersonDao {

}
