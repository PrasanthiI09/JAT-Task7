package javatask7;

import java.io.FileInputStream;
import java.io.IOException;

public class Question4filenotfound {
	
	public static void main(String[] args) throws IOException {
		inputfilenotfound();
	}
	public static void inputfilenotfound() throws IOException{
		try {
			FileInputStream myfile = new FileInputStream("C:\\Users\\prabh\\Desktop\\Access Modifiers.txt");
					
		}
		catch (Exception e)
		{
			System.out.println("This file does not exist - InvalidfileInput");
		}
		}
		
	}


