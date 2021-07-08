package com.example.students.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.students.model.home;

@Controller
public class HomeController 
{

	@GetMapping("/home")
	public String goHome(Model model)
	{
		List<home> listStudents= setStudents();
		model.addAttribute("students",listStudents);		
		return "home";
	}
	
	
	public List<home> setStudents()
	{
		List<home> myList = new LinkedList<home>();
			home studentOne = new home();
			studentOne.setNameOne("Pablo");
			studentOne.setNameTwoo("Daniel");
			studentOne.setLanaOne("Osvaldo");
			studentOne.setLanaTwoo("");
			studentOne.setAge(32);
			studentOne.setProfession("Futbolista");
			
			
			home studentTwoo = new home();
			studentTwoo.setNameOne("Daniel");
			studentTwoo.setNameTwoo("");
			studentTwoo.setLanaOne("Melero");
			studentTwoo.setLanaTwoo("");
			studentTwoo.setAge(42);
			studentTwoo.setProfession("Compositor");
			
			home studentThree = new home();
			studentThree.setNameOne("Gustavo");
			studentThree.setNameTwoo("Adrian");
			studentThree.setLanaOne("Cerati");
			studentThree.setLanaTwoo("Clark");
			studentThree.setAge(42);
			studentThree.setProfession("Musico");
			
			home studentFour = new home();
			studentFour.setNameOne("Maria");
			studentFour.setNameTwoo("Eugenia");
			studentFour.setLanaOne("Suarez");
			studentFour.setLanaTwoo("");
			studentFour.setAge(29);
			studentFour.setProfession("Actriz");
			
			myList.add(studentOne);
			myList.add(studentTwoo);
			myList.add(studentThree);
			myList.add(studentFour);
			
		return myList;
	}
}
