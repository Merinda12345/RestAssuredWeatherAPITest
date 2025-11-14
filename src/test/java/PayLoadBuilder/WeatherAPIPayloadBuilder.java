package PayLoadBuilder;

import org.json.simple.JSONObject;

public class WeatherAPIPayloadBuilder {

    public static JSONObject registerPayload(String external_id, String name, String latitude, String longitude, String altitude) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", external_id);
        jsonObject.put("name", name);
        jsonObject.put("latitude", latitude);
        jsonObject.put("longitude", longitude);
        jsonObject.put("altitude", altitude);

        return jsonObject;

    }
}
