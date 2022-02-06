package com.SIP.ams.controlers;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
public class HomeControllers {
	
@RequestMapping("/info")
public String info(Model model)
   {
	
	String formation="Fullstack" ;
	model.addAttribute("workshop",formation);
	
	String liste[] = new String[]{"OCP","oca","Spring","Angular"};
	ArrayList arlist = new ArrayList(Arrays.asList(liste));
	model.addAttribute("tableau",arlist);
	
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

