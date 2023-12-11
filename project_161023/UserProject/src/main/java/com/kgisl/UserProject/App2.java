package com.kgisl.UserProject;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class App2 {
    public static void main(String[] args) throws Exception {
        String fileName="D:\\Tamil\\project\\UserProject\\event.csv";
        CSVParser csvParser = new CSVParserBuilder().withSeparator(' ').build(); // custom separator
  try(CSVReader reader = new CSVReaderBuilder(
          new FileReader(fileName))
          .withCSVParser(csvParser)   // custom CSV parser
        //   .withSkipLines(1)           // skip the first line, header info
          .build()){
      List<String[]> r = reader.readAll();
      r.forEach(x -> System.out.println(Arrays.toString(x)));
  }
    }
}
