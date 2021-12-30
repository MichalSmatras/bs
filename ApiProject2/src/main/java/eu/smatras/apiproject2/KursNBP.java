/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu.smatras.apiproject2;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import org.json.JSONObject;

/**
 *
 * @author Misiek
 */
public class KursNBP {
    private String url = "http://api.nbp.pl/api/exchangerates/rates/a/";
    private String waluta;

    public KursNBP(String waluta) {
        this.waluta = waluta;
    }
    JSONObject obj ()throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url+waluta))
                .build();
        HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
        return new JSONObject(res.body());
    }
    
    String getKurs() throws IOException, InterruptedException{
        return obj().getJSONArray("rates").getJSONObject(0).get("mid").toString();
    }
    
    String getWalutaName() throws IOException, InterruptedException{        
        return obj().getString("currency");
    }
    
    String getKursData() throws IOException, InterruptedException{
        return obj().getJSONArray("rates").getJSONObject(0).get("effectiveDate").toString();
    }
    
}
