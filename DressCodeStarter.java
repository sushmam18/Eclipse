package com.xworkz.dp;

import com.xworkz.dto.*;
import com.xworkz.dp.dao.DressCodeDAO;
import com.xworkz.dp.dao.DressCodeDAO.*;

public class DressCodeStarter 
{
	public static void main(String args[])
	{

	   DressCodeDTO dresscodeDTOs=new DressCodeDTO(13.6f,"cotton","pink",600.0f,"male");
	   DressCodeDTO dresscodeDTOs1=new DressCodeDTO(20.6f,"silk","blue",400.0f,"female");
	   DressCodeDTO dresscodeDTOs2=new DressCodeDTO(60.6f,"rayon","black",100.0f,"male");
	   
	   DressCodeDAO code=new DressCodeDAO();
	   code.save(dresscodeDTOs);
	   code.save(dresscodeDTOs2); 
	   code.display();
	   
	   code.delete(0);
	   code.display();
	   
	   code.update(dresscodeDTOs1,4);
	   code.display();
	   
	}
}
	   

