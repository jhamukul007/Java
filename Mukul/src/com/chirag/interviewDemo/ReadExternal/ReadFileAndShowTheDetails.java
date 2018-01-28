package com.chirag.interviewDemo.ReadExternal;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;import java.io.IOException;
import java.io.InputStream;

public class ReadFileAndShowTheDetails 
{
	public static void readFile() throws IOException
	{
		FileInputStream fin=new FileInputStream("B:\\MUKUL.txt");
		BufferedInputStream bf=new BufferedInputStream(fin);
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.println((char)fin.read());
		}
	}
	public static void main(String[] args) throws IOException
	{
		readFile();
	}
}
