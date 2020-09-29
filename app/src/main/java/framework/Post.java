package framework;

import android.util.JsonReader;
import android.util.Log;

import androidx.fragment.app.Fragment;

import org.json.JSONArray;

import java.net.URL;
import java.net.URLConnection;

public class Post {
    static String connstr = "";
    public static String nullData = "";

    public Post(String connstring) {
        connstr = connstring;
    }

    public static void Send(String controller, String action, String data) {
        connstr = connstr+controller+"/"+action;
        try {
            URLConnection connection = new URL(connstr).openConnection();
            connection.setDoOutput(true);
            Object obj = connection.getContent();
            JSONArray array = new JSONArray(obj);
            Log.w("str", obj.toString());
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }
}
