package com.today36524.schoolsoa.bean;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class School{

            /**
            *
            **/
            public String id ;
            public String getId(){ return this.id; }
            public void setId(String id){ this.id = id; }

            public String id(){ return this.id; }
            public School id(String id){ this.id = id; return this; }

            /**
            *
            **/
            public String name ;
            public String getName(){ return this.name; }
            public void setName(String name){ this.name = name; }

            public String name(){ return this.name; }
            public School name(String name){ this.name = name; return this; }


        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("id").append("\":\"").append(this.id).append("\",");
    stringBuilder.append("\"").append("name").append("\":\"").append(this.name).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      