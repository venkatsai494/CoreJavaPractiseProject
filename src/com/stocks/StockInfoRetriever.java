package com.stocks;

import java.io.IOException;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class StockInfoRetriever {

    private static final String API_KEY = "YOUR_API_KEY";
    private static final String API_ENDPOINT = "https://api.nseindia.com/live_market/dynaContent/live_watch/stock_watch/niftyStockWatch.json";

    public static void main(String[] args) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(API_ENDPOINT);
            CloseableHttpResponse response = httpClient.execute(request);

            try {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String responseBody = EntityUtils.toString(entity);
                    Gson gson = new Gson();
                    StockWatchResponse stockWatchResponse = gson.fromJson(responseBody, StockWatchResponse.class);

                    // Now you can access information about stocks
                    for (StockInfo stockInfo : stockWatchResponse.data) {
                        System.out.println("Symbol: " + stockInfo.symbol);
                        System.out.println("Lot Size: " + stockInfo.lotSize);
                        // Output other relevant information
                    }
                }
            } finally {
                response.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Define classes to represent the JSON response structure
    static class StockWatchResponse {
        StockInfo[] data;
    }

    static class StockInfo {
        String symbol;
        int lotSize;
        // Add other relevant fields
    }
}
