package controller;

import com.google.gson.JsonObject;
import com.webcerebrium.binance.api.BinanceApi;
import com.webcerebrium.binance.api.BinanceApiException;

public class Main {
    private static String KEY_API = "VNxOm5Z4JL6qkaD3pNY9TApQKxJmxz0UJBIpIyXMYofkJTtavV8ILePM2PxHXOiY";
    private static String SICRET_KEY = "1BDo8bFIU0HBMY8nFC0nhCIvrGl4Kixz4EsiEMMMyVo3wGDskaPvvPjBs0eucR8r";

    public static void main(String[] args) {
        try {
            BinanceApi api = new BinanceApi(KEY_API, SICRET_KEY);
            JsonObject account = api.account();
//            System.out.println("ETH-BTC PRICE=" + api.pricesMap().get("ETHBTC"));
//            System.out.println(api.ping());
            //System.out.println(api.balances ());
        } catch (BinanceApiException e) {
            System.out.println( "ERROR: " + e.getMessage());
        }
    }
}
