package hw.rest;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.fluent.ContentResponseHandler;
import org.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

import java.io.IOException;

public class HTTPClient implements ResponseHandler<LocationData> {

    public LocationData handleResponse(HttpResponse httpResponse) throws IOException {
        HttpEntity httpEntity = httpResponse.getEntity();
        ContentResponseHandler contentHandler = new ContentResponseHandler();
        return parseJsonDataClient(httpResponse.getStatusLine().getStatusCode(),
                contentHandler.handleEntity(httpEntity).asString());
    }

    public LocationData parseJsonDataClient(int httpStatus, String jsonBody) throws IOException{
        //проверка сайта на жизнедеятельность
        if(httpStatus == 200){
            JSONObject clientLoc = new JSONObject(jsonBody);
            return new LocationData(clientLoc.getString("country_name"),clientLoc.getString("region_name"),
                    clientLoc.getString("city"),clientLoc.getDouble("latitude"),clientLoc.getDouble("longitude"));
        }
        else
            throw new IOException("page not found");
    }
}
