package hw.rest;

import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class Main {
    private final static String reference = "https://freegeoip.app/json/";

    public static void main(String[] args) {
        try {
            LocationData client = Request.Get(reference).execute().handleResponse(new HTTPClient());
            System.out.println(client.getStructureDetails());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
