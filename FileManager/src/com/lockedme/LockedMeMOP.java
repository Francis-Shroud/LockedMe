package com.lockedme;
import java.io.*;
public class LockedMeMOP {
	public void displayFilesInAscendingOrder(String directoryPath) {
		try {
			File f = new File(directoryPath);
			File files[] = f.listFiles();
			sort(files, files.length);
			for (File fileEntry : files) {
				if (fileEntry.isFile()) {
					System.out.println(fileEntry.getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    private void sort(File[] files, int n) {
        int x,j,swap;
        File temp;
        for(x=n-2;x>=0;x--) {
            swap=0;
            for(j=0;j<=x;j++) {
                if(files[j].getName().compareTo(files[j+1].getName())>0) {
                    temp=files[j];
                    files[j]=files[j+1];
                    files[j+1]=temp;
                    swap++;
                }
            }
            if (swap==0) {
                break;
            }
        }
    }		
	public void addFile(String newfile, String directoryPath) {
		try {
			File directory = new File(directoryPath);
			if (directory.isDirectory()) {
				File f = new File(directoryPath + "/" + newfile);
				if (!f.exists()) {
					f.createNewFile();
					System.out.println("File Created");
				}
				else {
					System.out.println("File aready existed");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteFile(String fileName, String directoryPath) {
		boolean isDeleted = false;
		boolean isExisted = false;
		try {
			File f = new File(directoryPath);
			File files[] = f.listFiles();
			for (File fileEntry : files) {
				if (fileEntry.getName().equals(fileName)) {
					isExisted = true;
					fileEntry.delete();
					if (fileEntry.delete());
					isDeleted = true;
					System.out.println(fileEntry.getName());
				}
			}
			if(isExisted && isDeleted) {
				System.out.println("File deleted successfully");
			}else
				System.out.println("File doesnot exists");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchFile(String fileName, String directoryPath) {
		boolean isExisted=false;
		try {
			File f = new File(directoryPath);
			File files[] = f.listFiles();
			for (File fileEntry : files) {
				if (fileEntry.isFile()) {
					if(fileEntry.getName().equals(fileName))
						isExisted = true;
				}
			}
			if(isExisted) {
				System.out.println("File exists");
			}else {
				System.out.println("File is Doesnot exists in the directory");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

