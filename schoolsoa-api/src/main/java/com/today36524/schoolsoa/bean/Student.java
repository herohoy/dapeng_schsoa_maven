package com.today36524.schoolsoa.bean;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class Student{
        
            /**
            *
            **/
            public String id ;
            public String getId(){ return this.id; }
            public void setId(String id){ this.id = id; }

            public String id(){ return this.id; }
            public Student id(String id){ this.id = id; return this; }
          
            /**
            *
            **/
            public String name ;
            public String getName(){ return this.name; }
            public void setName(String name){ this.name = name; }

            public String name(){ return this.name; }
            public Student name(String name){ this.name = name; return this; }
          
            /**
            *
            **/
            public String sex ;
            public String getSex(){ return this.sex; }
            public void setSex(String sex){ this.sex = sex; }

            public String sex(){ return this.sex; }
            public Student sex(String sex){ this.sex = sex; return this; }
          
            /**
            *
            **/
            public String classId ;
            public String getClassId(){ return this.classId; }
            public void setClassId(String classId){ this.classId = classId; }

            public String classId(){ return this.classId; }
            public Student classId(String classId){ this.classId = classId; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("id").append("\":\"").append(this.id).append("\",");
    stringBuilder.append("\"").append("name").append("\":\"").append(this.name).append("\",");
    stringBuilder.append("\"").append("sex").append("\":\"").append(this.sex).append("\",");
    stringBuilder.append("\"").append("classId").append("\":\"").append(this.classId).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      