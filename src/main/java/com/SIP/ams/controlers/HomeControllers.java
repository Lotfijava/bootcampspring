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
		return "home/affichage" ;
	   }


@RequestMapping("/information")
public String information()
	   {
		return "home/information" ;
	   }

}