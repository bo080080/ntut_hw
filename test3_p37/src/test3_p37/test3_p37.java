package test3_p37;
import java.io.*;
public class test3_p37 {

	public static void main(String[]args)throws IOException
	{
		System.out.println("輸入英文字母");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				
		String str=br.readLine();
		
		String stru=str.toUpperCase();
		String strl=str.toLowerCase();
		
		System.out.println("轉換成大寫為"+stru);
		System.out.println("轉換成小寫為"+strl);	
	}
}
