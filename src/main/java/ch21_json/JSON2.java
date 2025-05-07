package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {

        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // 변수 선언
        String userJson = null;
        // Java object 에서 json 변환
        User user = new User();
        user.setName("kim1");
        user.setPassword("9876");
        user.setEmail("a@test.com");
        user.setName("김일");
        user.setAge("20");

        userJson = gson.toJson(user);
        System.out.println(userJson);
        userJson = gsonBuilder.toJson(user);
        System.out.println(userJson);


        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("studentCode", "2025001");
        jsonObject.addProperty("studentName", "김이");
        jsonObject.addProperty("studentYear", "2");
        jsonObject.addProperty("score", "96.7");

        String studentJson = gson.toJson(jsonObject);
        System.out.println(studentJson);

        studentJson = gsonBuilder.toJson(jsonObject);
        System.out.println(studentJson);

        Map< String ,String > map1 = new HashMap<>();
        map1.put("productCode","NT960XHA-KD72G");
        map1.put("productName","삼성 갤럭시 북 프로 5");

        System.out.println("gson 사용 : "+ gson.toJson(map1));
        System.out.println("gson 사용 : "+ gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);

        Map<String,String> map = gson.fromJson(productJson, Map.class);
        System.out.println(map);

        User user1 = gson.fromJson(userJson, User.class);
        System.out.println(user1);



    }

}
