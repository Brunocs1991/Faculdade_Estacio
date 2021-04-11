package cursoandroid.com.aulawebservice_2;

import android.util.Base64;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPManager {
    public  static String getData(String uri){
        BufferedReader bufferedReader = null;
        try{
            URL url = new URL(uri);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            StringBuilder stringBuilder = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line + "\n");
            }
            return stringBuilder.toString();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            if(bufferedReader != null){
                try{
                    bufferedReader.close();
                } catch (IOException e){
                    e.printStackTrace();
                    return null;
                }
            }
        }
    }
    public  static String getData(String uri, String username, String password){
        byte[] loginBytes = (username + ":" + password).getBytes();
        StringBuilder loginBuilder= new StringBuilder().append("Basic ").append(Base64.encodeToString(loginBytes, Base64.DEFAULT));

        HttpURLConnection httpURLConnection = null;
        BufferedReader reader = null;
        try{
            URL url = new URL(uri);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.addRequestProperty("Authorization", loginBuilder.toString());

            StringBuilder stringBuilder = new StringBuilder();
            reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null){
                stringBuilder.append(line + "\n");
            }
            return stringBuilder.toString();
        } catch (Exception e){
            e.printStackTrace();
            try {
                int status = httpURLConnection.getResponseCode();
            } catch (IOException e1){
                e1.printStackTrace();
            }
            return null;
        }finally {
            if (reader != null){
                try {
                    reader.close();
                }catch (IOException e){
                    e.printStackTrace();
                    return null;
                }
            }
        }
    }
}
