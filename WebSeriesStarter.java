package com.xworkz.dp;

import com.xworkz.dp.constants.*;
import com.xworkz.dp.dao.WebSeriesDAO;
import com.xworkz.dto.*;

	public class WebSeriesStarter {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebSeriesDTO webSeriesDTOs=new  WebSeriesDTO("asur",Genre.ACTION,100,4.5f,1,1);
			WebSeriesDTO webSeriesDTOs1=new  WebSeriesDTO("money heist",Genre.ACTION,2000,4.8f,5,2);
			WebSeriesDTO webSeriesDTOs2=new WebSeriesDTO("worst witch",Genre.ADVENTURE,2500,4.1f,2,1);
			
			
			WebSeriesDAO web=new WebSeriesDAO();
			web.save(webSeriesDTOs);
			web.save(webSeriesDTOs1);
			
			
			web.display();
			
			web.delete(-1);
			web.delete(0);
			
			web.display();
			
			
			web.update(webSeriesDTOs2,6);
			
			web.display();
			
			
		}

	}


