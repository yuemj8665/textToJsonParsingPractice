package main;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * JSON을 JAVA코드로 생성한 후 다시 파싱하는 코드.
 */
public class JsonSimplePractice {
    public static void main(String[] args) throws ParseException {
        // JSON을 JAVA코드로 만들었다.
        String json;
        JSONObject inner = new JSONObject();
        inner.put("name","띵재");
        inner.put("gender","남자");
        inner.put("age","30");
        inner.put("address","수원");

        JSONObject outer = new JSONObject();
        outer.put("interface",inner);
        // JSON을 String으로 넣는다.
        json = outer.toJSONString();

        // String을 다시 파싱가능.
        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(json);
        JSONObject inf = (JSONObject) obj.get("interface");

        // key값을 직접 입력하여 파싱한다.
        String name = (String)inf.get("name");
        String gender = (String)inf.get("gender");
        String age = (String)inf.get("age");
        String address = (String)inf.get("address");

        // 파싱 후 결과 입력
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+gender);
        System.out.println("성별 : "+age);
        System.out.println("사는 곳 : "+address);

        /**
         * 이름 : 띵재
         * 나이 : 남자
         * 성별 : 30
         * 사는 곳 : 수원
         */

    }
}
