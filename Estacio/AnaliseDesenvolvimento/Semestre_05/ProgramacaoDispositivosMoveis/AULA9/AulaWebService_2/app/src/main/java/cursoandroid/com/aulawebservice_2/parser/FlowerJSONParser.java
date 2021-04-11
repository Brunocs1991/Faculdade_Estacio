package cursoandroid.com.aulawebservice_2.parser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cursoandroid.com.aulawebservice_2.model.Flor;

public class FlowerJSONParser {
    public static List<Flor> parseFeed(String content){
        try{
            JSONArray ar = new JSONArray(content);
            List<Flor> flowerList = new ArrayList<>();

            for (int i=0; i< ar.length(); i++){
                JSONObject obj = ar.getJSONObject(i);
                Flor flower = new Flor();
                flower.setFlorId(obj.getInt("productId"));
                flower.setNome(obj.getString("name"));
                flower.setCategoria(obj.getString("instructions"));
                flower.setFotoString(obj.getString("photo"));
                flower.setPreco(obj.getDouble("price"));
                flowerList.add(flower);
            }
            return flowerList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
