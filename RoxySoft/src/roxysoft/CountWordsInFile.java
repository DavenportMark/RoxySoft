package roxysoft;

import javax.swing.filechooser.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class CountWordsInFile {
   /**
	 * use a dialog box to select a text file (.txt)
	 * @return a Scanner for the selected file, or null if cancel selected
	 */
   public static Scanner selectTextFile() {
	   do {
	      JFileChooser chooser = new JFileChooser();
         FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Text/Java files", "txt", "java");
         chooser.setFileFilter(filter);
         int returnVal = chooser.showOpenDialog(null);
			try {
            if(returnVal == JFileChooser.APPROVE_OPTION) {
		         return new Scanner(chooser.getSelectedFile());
            } 
   		   else {
		         return null;
			   }
			}
			catch (FileNotFoundException e) {
			   JOptionPane.showMessageDialog(null, "Invalid file!",
				   "error", JOptionPane.ERROR_MESSAGE); 
			}
		} while (true);
	}
	/**
	 * given a String, uses a Scanner to count the number of words
	 * @return number of words in the String
	 */
   public static int countWordsOnLine(String line) {
	   Scanner s = new Scanner(line);
		int count = 0;
		while (s.hasNext()) {
		   s.next();
			count++;
		}
		return count;
	}
   
}