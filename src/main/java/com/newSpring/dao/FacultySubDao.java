package com.newSpring.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.newSpring.entity.Faculty;
import com.newSpring.entity.Subject;

@Repository
public class FacultySubDao {

	
	public ArrayList<Faculty> allFacultySubInfo()
	{
		ArrayList<Subject> subList=new ArrayList<Subject>();
		subList.add(new Subject(1,"java"));
		subList.add(new Subject(1,"python"));
		
		ArrayList<Subject> subList1=new ArrayList<Subject>();
		subList1.add(new Subject(3,"mern"));
		subList1.add(new Subject(4,"testing"));
		
		ArrayList<Subject> subList2=new ArrayList<Subject>();
		subList2.add(new Subject(5,"Android"));
		subList2.add(new Subject(6,"Aws"));
		
		ArrayList<Faculty> alFacultywithSub=new ArrayList<Faculty>();
		alFacultywithSub.add(new Faculty(111,"Arpita",6,45000,subList));
		alFacultywithSub.add(new Faculty(222,"saili",4,22000,subList1));
		alFacultywithSub.add(new Faculty(111,"Arpita",8,45000,subList2));
		
		
		
		
		return alFacultywithSub;
	}
	
	
}
