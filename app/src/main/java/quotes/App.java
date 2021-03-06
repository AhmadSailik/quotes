/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;
import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class App {


    public String getGreeting() {
        return "Hello World!";
    }
public static void getQuote(){

}
////////////////////lab09 Start/////////////////

public static Object randomQuoteRes(){
    try {
        String apiuRL = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";
        URL url = new URL(apiuRL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        int status = connection.getResponseCode();
        if (status == 200) {
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            Gson gson = new Gson();
            Quote quote = gson.fromJson(bufferedReader, Quote.class);
            System.out.println(quote.toStrin2());

            bufferedReader.close();
        } else {
            System.out.println("An error occurred with status " + status);
            randomQuote("Ahmad.json");
        }
        connection.disconnect();
    }catch (MalformedURLException e) {
        e.printStackTrace();
        randomQuote("Ahmad.json");
    } catch (IOException e){
        e.printStackTrace();
        randomQuote("Ahmad.json");
    }
    return 5;
}
////////////////////lab09 End/////////////////

////////////////////lab08 Start/////////////////

    public static Quote randomQuote(String file) {
        Quote quote0 = null;

        try {


            BufferedReader data=new BufferedReader(new FileReader(file));
            Gson gson = new Gson();
            Quote[] quote=gson.fromJson(data,Quote[].class);

            int i = (int) (Math.random()*quote.length);
            System.out.println(quote[i]);
            quote0=quote[0];
            System.out.println(quote0);
           data.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("change the path");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return quote0;
    }

////////////////////lab08 End/////////////////

    public static void main(String[] args)  {
        System.out.println(new App().getGreeting());

////////////////////lab09 Start/////////////////

        randomQuoteRes();

////////////////////lab09 End/////////////////

////////////////////lab08 Start/////////////////

       randomQuote("Ahmad.json");

////////////////////lab08 End/////////////////

    }


}
