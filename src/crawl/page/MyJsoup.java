package crawl.page;

import com.sun.xml.internal.xsom.impl.Ref;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

/**
 * @author SGN196
 * @date 2019/1/13 21:40
 */

public class MyJsoup {
    public static void main(String[] args) throws Exception{
        Document doc = Jsoup.connect("http://www.guat.edu.cn/").get();
//        Elements elements = doc.select("div.Content p");
        Elements elements = doc.getElementsByTag("a");
        for(Element e : elements){
            System.out.println(e.text() + ":" + e.attr("href"));
        }

    }
}
