package test3_p37;
import java.io.*;
public class test3_p37 {

	public static void main(String[]args)throws IOException
	{
		System.out.println("��J�^��r��");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				
		String str=br.readLine();
		
		String stru=str.toUpperCase();
		String strl=str.toLowerCase();
		
		System.out.println("�ഫ���j�g��"+stru);
		System.out.println("�ഫ���p�g��"+strl);	
	}
}
