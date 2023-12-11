package com.kgisl.UserProject;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
  // try (CSVReader reader = new CSVReader(new FileReader("D:\\Tamil\\project\\UserProject\\File.csv"))) {
  //     List<String[]> r = reader.readAll();
  //     r.forEach(x -> System.out.println(Arrays.toString(x)));
  // }
  
  try (CSVReader reader = new CSVReader(new FileReader("file.csv"))) {
    String[] lineInArray;
    while ((lineInArray = reader.readNext()) != null) {
        System.out.println(lineInArray[0] + lineInArray[1] + "etc...");
    }
}
  catch(Exception e)
  {
     System.out.println(e.getMessage());
  }
    }

}
