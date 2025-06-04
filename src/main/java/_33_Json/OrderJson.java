package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        JsonObject orderInfo = new JsonObject();
        orderInfo.addProperty("orderId","ORD123456");
        orderInfo.addProperty("customer","곽두팔");
        orderInfo.addProperty("product","에어팟 프로 2세대");
        orderInfo.addProperty("quantity",1);
        orderInfo.addProperty("price",349000);

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String json1 = gson1.toJson(orderInfo);

        JsonObject address = new JsonObject();
        address.addProperty("receiver","곽두팔");
        address.addProperty("phone","010-5678-1234");
        address.addProperty("city","서울");
        address.addProperty("district","마포구");
        address.addProperty("zipCode","04123");

        orderInfo.add("address",address);
        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(orderInfo);
        System.out.println(json2);
    }
}
