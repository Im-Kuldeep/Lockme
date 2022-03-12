package Lockme;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;


public class SortFiles
{
  void retrieve(String path)
  { 
	
    File dir = new File(path);
    if(dir.isDirectory())
    {
      // Fetching the list from the directory
      File[] files = dir.listFiles();

   
    //Creating a filter to return only files.
      FileFilter fileFilter = new FileFilter()
      {
        @Override
        public boolean accept(File file) {
          return !file.isDirectory();
        }
      };
   
   files = dir.listFiles(fileFilter);
   
      System.out.println("\n Retrieving file names in ascending order..................");
      //Sort files by name
      Arrays.sort(files, new Comparator<Object>()
      {
        @Override
        public int compare(Object f1, Object f2) {
          return ((File) f1).getName().compareTo(((File) f2).getName());
        }
      });

      //Prints the files in file name ascending order
      for(File file:files)
      {
        System.out.println(file.getName());
      }
    }
  }
}