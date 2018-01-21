package scripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad 
{

	public static void main(String[] args) throws IOException 
	{
		//Instance class
		
				Lib Lb=new Lib();
				
				String Res=Lb.OpenApp("http://www.gmail.com");
				System.out.println(Res);
				
				//To get testdata file path
				
				String Fpath="C:\\Users\\santhosh.santhosh-PC\\Desktop\\Gmail.txt";
				
				//Results File path
				
				String Rpath="C:\\Users\\santhosh.santhosh-PC\\Desktop\\resultGmail.txt";
				String Sd;
				//To get Testdata file
				
				FileReader Fr=new FileReader(Fpath);
				
				//To get data from file
				
				BufferedReader Br=new BufferedReader(Fr);
			     String readdata=Br.readLine();
				System.out.println(readdata);
				
				//To write readdata to results file
				
				FileWriter Fw=new FileWriter(Rpath);
				BufferedWriter Bw=new BufferedWriter(Fw);
				Bw.write(readdata);
				Bw.newLine();
				
				//Multiple Interations  ---While
				
				while ((Sd=Br.readLine())!=null) 
				{
					System.out.println(Sd);
					
					//Split 
					
					String SR[]=Sd.split("###");
					
					String Eid=SR[0];
					System.out.println(Eid);
					
					String Pwd=SR[1];
					System.out.println(Pwd);
					
					Res=Lb.Glogin(Eid,Pwd);
					
					Bw.write(Eid+"@@@"+Pwd+"&&&"+Res);
					Bw.newLine();
				}
Bw.close();
Br.close();
	}
}
