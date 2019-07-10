package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawling {
    public static void main(String[] args) {
        //interpark book crawling
        try {
            Document doc = Jsoup.connect("http://www.kyobobook.co.kr/bestSellerNew/bestseller.laf?orderClick=d79").get();
            //System.out.println(doc.html());
            Elements result = doc.select("[class=list_type01]").select("li").select("[class=title]");
            List<String> list = result.eachText();

            int i=0;
            for(String title : list) {
                System.out.printf("%d. %s\n", ++i, title);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
