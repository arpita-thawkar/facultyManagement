package com.newSpring.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newSpring.dao.FacultySubDao;
import com.newSpring.entity.Faculty;
import com.newSpring.entity.Subject;
@Service
public class Services {


	@Autowired
	FacultySubDao dao;

	//all faculty or subject name
	public ArrayList<String> getAllSubNames()
	{
		ArrayList<String> slist=new ArrayList<String>();
				
		ArrayList<Faculty> allFacultySubList=dao.allFacultySubInfo();
		
				for(Faculty faculty: allFacultySubList)
				{
					List<Subject> sublist=faculty.getSubnames();
					
					for(Subject subject  :sublist)
					{
					slist.add(subject.getSnm());
					}
					
				}
		return slist;
	}
	
	

	//find largest experience of faculty
 public Faculty getLarExperience()
	{
		
		ArrayList<Faculty> LarExpFac=dao.allFacultySubInfo();
		Faculty f1=LarExpFac.get(0);
		for(Faculty f: LarExpFac)
		{
		       if(f.getFexp() > f1.getFexp())
		       {
		    	   f1=f;
		       }
		}
	
		return f1;
	}
 
 //get all subject name from faculty name
public ArrayList<String> getSubAsPerFacNm()
	{
		ArrayList<String> slist2=new ArrayList<String>();
		ArrayList<Faculty> flist=dao.allFacultySubInfo();
		
		for(Faculty f :flist)
		{
			List<Subject> sublist=f.getSubnames();
			
			for(Subject subject:sublist)
				
			if(f.getFnm()=="Arpita")
			{
			slist2.add(subject.getSnm());
			}
		}
	
	return slist2;
	}
}
