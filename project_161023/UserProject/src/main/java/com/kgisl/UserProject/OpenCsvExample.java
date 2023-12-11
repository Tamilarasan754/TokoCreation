package com.kgisl.UserProject;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class OpenCsvExample {

    public static void main(String[] args) throws IOException {

        String fileName = "D:\\Tamil\\project\\UserProject\\events.csv";

        List<Event> beans = new CsvToBeanBuilder(new FileReader(fileName)).withType(Event.class).build().parse();

        beans.forEach(System.out::println);
       

    }

}
