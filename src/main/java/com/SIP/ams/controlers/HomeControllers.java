package com.SIP.ams.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {
	
@RequestMapping("/info")
   public String info()
   {
	   return "home/info" ;
   }

@RequestMapping("/affichage")
   public String affichage()
	   {
	
	
System.out.println("Methode 1");
		return "home/affichage" ;
	   }


@RequestMapping("/information")
public String information()
	   {
	
System.out.println("Methode 2");
		return "home/information" ;
	   }

}

