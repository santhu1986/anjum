package scripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Exelib {

	
	public static void main(String[] args) throws IOException 
	{
	//Instance class
		
		Lib Lb=new Lib();
		
		String Res=Lb.OpenApp("http://www.gmail.com");
		System.out.println(Res);
		//Sleeper.sleepTightInSeconds(4);
	//	Lb.Glogin("testmindq","mindqsystems");
		
		FileInputStream Fis=new FileInputStream("C:\\Users\\santhosh.santhosh-PC\\Desktop\\Gmail.xlsx"); 
		
		
		//Workbook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//sheet
		
		XSSFSheet WS=WB.getSheet("Gdata");
		
		//Row count
		
		int Rc=WS.getLastRowNum();
		System.out.println(Rc);
		
		//Multiple Iterations ---- For loop
		
		for (int i=1; i<=Rc; i++) 
		{
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			
			//Cell value
			
			String Em=WC.getStringCellValue();
			System.out.println(Em);
			
			//Cell value
			
			String Pwd=WC1.getStringCellValue();
			System.out.println(Pwd);
			
			Res=Lb.Glogin(Em,Pwd);
             System.out.println(Res);			

             WC2.setCellValue(Res);
			}
		
		FileOutputStream Fos=new FileOutputStream("C:\\Users\\santhosh.santhosh-PC\\Desktop\\Res_Gmail.xlsx");
		WB.write(Fos);
		WB.close();
		/*
		//Row
		
		XSSFRow WR=WS.getRow(3);
		
		//cell
		
		XSSFCell WC=WR.getCell(1);
		
		//Cell value
		
		String Val=WC.getStringCellValue();
		System.out.println(Val);
*/	//	Lb.Lout();  
		//Lb.Aclose();
		}

}
