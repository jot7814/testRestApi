package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(125, "Java Core", "This is basic of java"));
		list.add(new Course(126, "Spring Boot", "This is basic of Rest Api"));
	}
	
	
	// All Course get
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		
		return list;
	}

		// Single course
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		
		Course c = null;
		
		for(Course course:list)
		{
			if(course.getId() == courseId)
			{
				c = course;
				break;
			}
		}
		return c;
	}

		// Add
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
		
		list.add(course);
		
		return course;
	}

	
		// Update
	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
		list.forEach(e ->
		{
			if(e.getId() == course.getId())
			{
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
			
		});
		
		
		
		return course;
	}

}
