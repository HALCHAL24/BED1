/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro;

import java.util.List;

public class CreditScoreValidationService {
    
    
    public int CheckScore(String panNum)
	{
		int result = 2;
		DataBaseController db = new DataBaseController();
		List<CreditCard> list = db.getCreditCardDetails(panNum);
		
		//If User not found in DataBase
		if(list.size() == 0)
		{
			result = 2 ;
		}
		else if( list.get(0).getCreditScore() < 5)
		{
			result = 1;
		}
		else if ( list.get(0).getCreditScore() >= 5)
		{
			result =  0;
		}
		
		return result;
		
		
		
	}
    
}
