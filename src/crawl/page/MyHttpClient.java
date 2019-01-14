package crawl.page;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;

/**
 * @author SGN196
 * @date 2019/1/13 21:29
 *"http://www.guat.edu.cn/"
 *
 * 使用httpClient爬取网站数据
 */

public class MyHttpClient {
    public static void main(String[] args) throws Exception {
        HttpClient httpClient =  new DefaultHttpClient();

        httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000)
                .setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000)
                .setParameter(ConnRouteParams.DEFAULT_PROXY, new HttpHost("139.196.90.80", 80));

        HttpGet httpGet = new HttpGet("http://www.guat.edu.cn/");
        HttpResponse response = httpClient.execute(httpGet);

        String content = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(content);

    }
}
