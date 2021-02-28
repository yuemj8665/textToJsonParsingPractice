package main.utill;

import java.io.*;

public class Utill {
    public String FileToJsonString(String fileName){
        StringBuffer buffer = new StringBuffer();
        try {
            // JSON Data 읽기
            File file = new File("E:\\Development\\dev\\Workspace\\textToJsonParsingPractice\\src\\randomJsonVO\\RandomJson\\"+fileName);
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";
            while((line = bufferedReader.readLine())!= null){
                buffer.append(line);
            }
            bufferedReader.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다!! : "+e.getMessage());
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return buffer.toString();
    }

}
