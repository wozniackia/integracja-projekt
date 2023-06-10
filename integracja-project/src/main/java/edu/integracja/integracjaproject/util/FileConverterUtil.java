package edu.integracja.integracjaproject.util;

import edu.integracja.integracjaproject.model.RateModel;
import org.apache.commons.lang3.tuple.Pair;
import org.json.JSONArray;
import org.json.XML;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileConverterUtil {

    private FileConverterUtil() {}

    public static final String WRITE_DIR = "src/main/resources/data/";

    public static Pair<String, List<RateModel>> readCsvFile(String path, String file) {
        List<String> csvRows = null;
        try(var reader = Files.lines(Paths.get(path+file))){
            csvRows = reader.toList();
        }catch(Exception e){
            e.printStackTrace();
        }

        if(csvRows != null){
            String json = csvToJson(csvRows);
            String fileName = file.substring(0, file.length() - 4);
            try (PrintWriter out = new PrintWriter(new FileWriter(WRITE_DIR + "json/" + fileName + ".json"))) {
                out.write(json);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try (PrintWriter out2 = new PrintWriter(new FileWriter(WRITE_DIR + "xml/" + fileName + ".xml"))) {
                out2.write(jsonToXML(json));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Pair.of(fileName, csvToFertilityRate(csvRows));

        } else {
            return null;
        }
    }

    public static List<RateModel> csvToFertilityRate(List<String> csv) {
        List<RateModel> rateModelList = new ArrayList<>();
        for(int i = 1; i < csv.size(); i++) {
            var values = csv.get(i).split(",");
            var val = new RateModel(Integer.valueOf(values[0]), Double.valueOf(values[1]));
            rateModelList.add(val);
        }
        return rateModelList;
    }

    public static String csvToJson(List<String> csv){
        //csv is empty or have declared only columns
        if(csv.size() <= 1){
            return "[]";
        }

        //get first line = columns names
        String[] columns = csv.get(0).split(",");

        //get all rows
        StringBuilder json = new StringBuilder("[\n");
        csv.subList(1, csv.size()) //substring without first row(columns)
                .stream()
                .map(e -> e.split(","))
                .filter(e -> e.length == columns.length) //values size should match with columns size
                .forEach(row -> {

                    json.append("\t{\n");

                    for(int i = 0; i < columns.length; i++){
                        json.append("\t\t\"")
                                .append(columns[i].replace("\"", ""))
                                .append("\" : \"")
                                .append(row[i])
                                .append("\",\n"); //comma-1
                    }

                    //replace comma-1 with \n
                    json.replace(json.lastIndexOf(","), json.length(), "\n");

                    json.append("\t},"); //comma-2

                });

        //remove comma-2
        json.replace(json.lastIndexOf(","), json.length(), "");

        json.append("\n]");

        return json.toString();

    }

    public static List<String> getFilesToConvert(String dir) {
        return Stream.of(new File(dir).listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .toList();
    }

    public static String jsonToXML(String str) {
        JSONArray json = new JSONArray(str);
        return "<root>" + XML.toString(json) + "</root>";
    }


}
