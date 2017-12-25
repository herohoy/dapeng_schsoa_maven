package com.today36524.schoolsoa.service

import com.today36524.schoolsoa.bean.School

import scala.collection.JavaConverters

class SchoolServiceImpl extends SchoolService{
  /**
    *
    **
  query the school name
    *
    **/
  override def findSchoolNameById(id: String): String = "今天today梦想dream学校"
/**
  *
  **/
override def findSchoolById(id: String): School = {
  val s = new School()
  s.setId("1")
  s.setName("今天学校")
  s
}

  /**
    *
    **/
  override def findAllSchool(): java.util.List[School] = {
    val s1 = new School()
    s1.setId("1")
    s1.setName("今天学校")
    val s2 = new School()
    s2.setId("2")
    s2.setName("梦想学校")
    JavaConverters.seqAsJavaList(List(s1,s2))

  }
}
