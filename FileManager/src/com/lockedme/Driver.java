package com.lockedme;
import java.util.*;
public class Driver {

			public static void main(String[] args) {
				final String ROOT_DIRECTORY_PATH="D:\\Simplilearn Project";
				LockedMeMOP mo = new LockedMeMOP();
				Scanner sc = new Scanner(System.in);
				String fileName,newfile;
				int ch,ch1;
				boolean x=false,y=false;
				System.out.println("Welcome to LockedMe File Manager");
				System.out.println("Developer Info");
				System.out.println("Mr.Francis Xavier Barla");
				do {
					System.out.println("1. Show file in Ascending Order");
					System.out.println("2. More Options");
					System.out.println("3. Exit");
					System.out.println("Enter the choice");
					ch = sc. nextInt();
					switch(ch) {
							case 1:
								mo.displayFilesInAscendingOrder(ROOT_DIRECTORY_PATH);
								break;
							case 2:
								do 
								{
									System.out.println("1. Add a file in directory");
									System.out.println("2. Remove file from directory");
									System.out.println("3. Search file in directory");
									System.out.println("4. Go Back");
									System.out.println("Enter your choice");
									ch1 = sc.nextInt();
										switch (ch1) 
										{
											case 1: 
												System.out.println("Enter the name to Create new File");
												Scanner nc=new Scanner(System.in);
												newfile=nc.nextLine();
												mo.addFile(newfile, ROOT_DIRECTORY_PATH);
												break;
											case 2:
												fileName = readFileName(sc);
												mo.deleteFile(fileName, ROOT_DIRECTORY_PATH);
												break;
											case 3:
												fileName = readFileName(sc);
												mo.searchFile(fileName, ROOT_DIRECTORY_PATH);
											case 4: y=true;
												break;
											default : y=false;
										}
								}while(y==false);
									break;
							case 3: x=true;
								break;
							default : x=false;
								System.out.println("---Invalid Option Please try again---");
								break;
						}
				}while (x==false);
				
			}

			private static String readFileName(Scanner sc) {
				System.out.println("Enter the name of the file");
				sc.nextLine();
				String fileName = sc.nextLine();
				return fileName;	
			}
	}


