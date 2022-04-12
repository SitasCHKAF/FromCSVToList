
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.*;

public class CSVProcessing {

    public static void main(String[] args) throws IOException, CsvValidationException {
        Map<String,Integer> divList = new HashMap<>(); //для хранения всех подразделений
        ArrayList<Human> humanList = new ArrayList<>(); //для хваниения людей
        FileReader fileReader =new FileReader("src/main/resources/foreign_names.csv");
        CSVParser parser = new CSVParserBuilder() //создается для кастомного разделителя ";"
                .withSeparator(';')
                .withIgnoreQuotations(true)
                .build();

        CSVReader csvReader = new CSVReaderBuilder(fileReader)
                .withSkipLines(0)
                .withCSVParser(parser)
                .build();

        String[] line;
        line=csvReader.readNext(); //считали ненужную строку
        while ((line = csvReader.readNext()) != null) { //получили массив сток с нужными значения
            //System.out.println(Arrays.toString(line));
            int id=Integer.parseInt(line[0]);
            String name=line[1];
            String sex=line[2];
            int day=Integer.parseInt(line[3].split("\\.")[0]);
            int month=Integer.parseInt(line[3].split("\\.")[1]);
            int year=Integer.parseInt(line[3].split("\\.")[2]);
            String divName=line[4];
            int divId;
            if(divList.get(divName)!=null) //если подразделение есть
                divId=divList.get(divName); //получаем его id
            else
            {
                divId= divList.size()+1;   //иначе побавляем в список подразделений с новым id
                divList.put(divName,divId);
            }
            int salary=Integer.parseInt(line[5]);
            humanList.add(new Human(id,name,sex,new Division(divId,divName),salary,year,month,day));
        }
        //вывод всех людей
        for (Human human : humanList) System.out.println(human);
        System.out.println(divList.entrySet()); //вывод подразделений
    }
    }

