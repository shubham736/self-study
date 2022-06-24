package self.Test;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) {

 /*       Properties p = System.getProperties();
        System.out.println(p.propertyNames());
        p.setProperty("pirate", "scurvy");
        String s = p.getProperty("argProp") + " ";
        s +=p.getProperty("pirate");
        System.out.println(s);*/

        String abc= "Hello";
        String abc2= "Hello";
   //     System.out.println("abc and abc2 are same object "+abc == abc2);
        int[] integers = null;
        getArray(integers,2);
    /*    for (Integer integer : integers)
            System.out.println(integer);*/
    }

    static void getArray(int integer[] , int size){
        integer = new int[size];
    }

    List<String> getMovieTitles(String substr) {
        String response;
        int startPage = 1;
        int totalPages = Integer.MAX_VALUE;
        List<String> titles = new ArrayList<>();
        while (startPage <= totalPages) {
            try {
                URL obj = new URL("https://jsonmock.hackerrank.com/api/article_users?page=" +  startPage);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("GET");
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((response = in.readLine()) != null) {
              /*      JSONParser convertedObject = new Gson().fromJson(response, JsonObject.class);
                    totalPages = convertedObject.get("total_pages").getAsInt();
                    JsonArray data = convertedObject.getAsJsonArray("data");
                    for (int i = 0; i < data.size(); i++) {
                        String title = data.get(i).getAsJsonObject().get("Title").getAsString();
                        titles.add(title);
                    }*/
                }
                in.close();
                startPage++;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        Collections.sort(titles);
        return titles;
    }

    public static List<String> getMovieTitles1(String title) {
        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=%s";
        url = String.format(url, title);
        String result1="";
        List<String> result = new ArrayList<String>();
        URL obj;
        try {
            obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(result);
        return result;
    }
}