package framework;

import java.util.Date;

public class NewsInfo {
    public Integer id;
    public String BaseNewsInfo;
    public String NewsInfoAll;
    public Date DateTime;
    public String Imgsrc;
    public String user;

    public NewsInfo(Integer id, String BaseNewsInfo, String NewsInfoAll, String Imgsrc, String userm, Date DateTime)
    {
        this.id = id;
        this.BaseNewsInfo = BaseNewsInfo;
        this.NewsInfoAll = NewsInfoAll;
        this.Imgsrc = Imgsrc;
        this.user = userm;
        this.DateTime = DateTime;

    }

}
