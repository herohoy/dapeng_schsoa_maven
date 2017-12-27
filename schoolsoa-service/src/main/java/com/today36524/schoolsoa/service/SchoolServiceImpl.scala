package com.today36524.schoolsoa.service

import com.today36524.school.dao.SchoolDao
import com.today36524.schoolsoa.bean.School
import org.springframework.beans.factory.annotation.Autowired

import scala.collection.JavaConverters

class SchoolServiceImpl extends SchoolService{
  @Autowired
  var schoolDao:SchoolDao = _
  /**
    *
    **
  query the school name
    *
    **/
  override def findSchoolNameById(id: String): String = SchoolDao.findSchoolById(id).getName
/**
  *
  **/
override def findSchoolById(id: String): School = SchoolDao.findSchoolById(id)

  /**
    *
    **/
  override def findAllSchool(): java.util.List[School] = {
    val s1 = schoolDao.findAllSchool
    JavaConverters.seqAsJavaList(s1)

  }
}
