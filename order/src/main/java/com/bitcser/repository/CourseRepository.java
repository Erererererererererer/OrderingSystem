package com.bitcser.repository;

import com.bitcser.entity.Course;

import java.util.List;

public interface CourseRepository {

    public void add(Course course);
    public void deleteByOid(long oid);
    public List<Course> findAllByOid(long oid);

}
