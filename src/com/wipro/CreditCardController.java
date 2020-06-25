package com.wipro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/")
public class CreditCardController {
 /*@RequestMapping(method=RequestMethod.GET)
  public ModelAndView home()
  {
	 ModelAndView mv = new ModelAndView();
	 mv.setViewName("index");
	 return mv;
  }*/
 @RequestMapping(value = {"/", "/index",""} ) 
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("checkEligibility")
 public ModelAndView checkEligibility(@RequestParam("PanNum") String PanNum)  //To call right page based on CreditScore
 {
CreditScoreValidationService c = new CreditScoreValidationService();
		
		ModelAndView mv = new ModelAndView();
		
		//If User is eligible
		if(c.CheckScore(PanNum) == 0)  mv.setViewName("eligible");
		
		//If User is not eligible
		else if (c.CheckScore(PanNum) == 1) mv.setViewName("inEligible");
		
		//If invalid user
		else mv.setViewName("inValid");
		
		return mv;
 }
	

}
