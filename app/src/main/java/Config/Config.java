package Config;

public class Config {
    public  static String DEBUG = "debug";
    public  static  String RELEASE = "release";
    private static String connstr = "";
    public Config(){

    }

    public static String GetString(String typeconn){
        if (typeconn == RELEASE){
            connstr = "http://www.trainzinfo.somee.com/";
        }else if(typeconn == DEBUG){
            connstr = "https://localhost:44321/";
        }
        return connstr;
    }
}
