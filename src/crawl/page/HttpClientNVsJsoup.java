package crawl.page;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * @author SGN196
 * @date 2019/1/14 0:52
 */

public class HttpClientNVsJsoup {
    public static void main(String[] args) throws Exception {
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("http://www.guat.edu.cn/");
        HttpResponse response = httpClient.execute(httpGet);
        String content = EntityUtils.toString(response.getEntity(), "utf-8");
        Document doc = Jsoup.parse(content);
        Elements elements = doc.getElementsByTag("a");
        for(Element e : elements){
            System.out.println(e.text() + " : " + e.attr("href"));
        }


    }
}
