package main.gsonPractice;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GsonPractice {

    public static void main(String[] args) throws ParseException {
        String str = "[{'NO':1,'NAME':'APPLE','KOR':'사과','PRICE':'1000'},{'NO':2,'NAME':'BANANA','KOR':'바나나','PRICE':'500'},{'NO':3,'NAME':'MELON','KOR':'메론','PRICE':'2000'}]";
        JSONParser parser = new JSONParser();
        JSONArray array = (JSONArray) parser.parse(str);


    }
}
