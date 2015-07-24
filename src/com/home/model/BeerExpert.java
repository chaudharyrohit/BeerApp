package com.home.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List<String> getBeerBrands(String color){
		List<String> beerList = new ArrayList<String>();
		//random comment
		if(color.equalsIgnoreCase("red")){
			beerList.add("red beer1");
			beerList.add("red beer2");
		}else if(color.equalsIgnoreCase("blue")){
			beerList.add("blue beer");
		}else if(color.equalsIgnoreCase("orange")){
			beerList.add("orange beer");
		}else {
			beerList.add("green beer");
		}
		
		return beerList;
	}
}
