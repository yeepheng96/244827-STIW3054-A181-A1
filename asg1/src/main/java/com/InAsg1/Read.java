package com.InAsg1;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Read {
    public static List<Info> findAll(){
        try {
            List<Info>data = new ArrayList<Info>();
            // Determine Website
            String url = "https://ms.wikipedia.org/wiki/Malaysia";
            Document doc = Jsoup.connect(url).get();
            // Locate Table in Website
            Element target = doc.select("table.wikitable").get(1);
            Elements trs = target.select("tr");
            // Retrieve Data from Website
            for(Element tr : trs) {
                String th = tr.select("th").text();
                String td = tr.select("td").text();
                // Add Data into Info.java
                data.add(new Info(th,td));
            }
            return data;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
