package wrapper;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import core.schemas.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Players {

    public static PlayerCollection search(String query, int page, String countries, boolean withMetadata) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("search", URLEncoder.encode(query, StandardCharsets.UTF_8.toString()));
        hm.put("page", String.valueOf(page));
        hm.put("countries", countries);
        hm.put("withMetadata", String.valueOf(withMetadata));
        String url = buildURL("https://scoresaber.com/api/players", hm);
        Request request = new Request.Builder()
                .url(url)
                .build();
        String response = client.newCall(request).execute().body().string();

        JSONObject responseJson = new JSONObject(response);

        JSONObject metadataJson = responseJson.getJSONObject("metadata");
        Metadata metadata = new Metadata(metadataJson.getInt("total"), metadataJson.getInt("page"), metadataJson.getInt("itemsPerPage"));

        JSONArray players = new JSONArray("players");
        ArrayList<Player> pls = new ArrayList<>();
        for (int i = 0; i < players.length(); i++) {
            JSONObject currObj = players.getJSONObject(i);
            JSONObject scoreStatsJson = currObj.getJSONObject("scoreStats");
            ScoreStats scoreStats = new ScoreStats(scoreStatsJson.getInt("totalScore"), scoreStatsJson.getInt("totalRankedScore"), scoreStatsJson.getInt("totalPlayCount"), scoreStatsJson.getInt("rankedPlayCount"), scoreStatsJson.getInt("replaysWatched"), scoreStatsJson.getDouble("averageRankedAccuracy"));
            ArrayList<Badge> badges = new ArrayList<>();
            if (currObj.get("badges") instanceof JSONArray) {
                JSONArray badgesJson = currObj.getJSONArray("badges");
                for (int j = 0; j < badgesJson.length(); j++) {
                    JSONObject curr = badgesJson.getJSONObject(j);
                    badges.add(new Badge(curr.getString("description"), curr.getString("image")));
                }
            } else {
                JSONObject badgesJson = currObj.getJSONObject("badges");
                badges.add(new Badge(badgesJson.getString("description"), badgesJson.getString("image")));
            }
            pls.add(new Player(currObj.getString("id"), currObj.getString("name"), currObj.getString("profilePicture"), currObj.getString("country"), currObj.getString("role"), currObj.getString("histories"), currObj.getDouble("pp"), currObj.getInt("rank"), currObj.getInt("countryRank"), currObj.getInt("permissions"), badges, Collections.singletonList(scoreStats), currObj.getBoolean("banned"), currObj.getBoolean("inactive")));
        }
        return new PlayerCollection(pls, metadata);
    }

    private static String buildURL(String base, HashMap<String, String> queryParams) {
        String res = "" + base;
        boolean first = true;
        for (String key : queryParams.keySet()) {
            if (queryParams.get(key) != null) {
                if (first) {
                    first = false;
                    base += "?";
                } else {
                    base += "&";
                }
                base += key + "=" + queryParams.get(key);
            }
        }
        return res;
    }
}
