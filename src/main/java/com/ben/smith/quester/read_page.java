package com.ben.smith.quester;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

/**
 * Created by bensmith on 7/16/18.
 */
public class read_page {


    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = Jsoup.connect("http://oldschoolrunescape.wikia.com/wiki/Quests/List").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(doc.title());

//        Element divTag = doc.getElementById("thead");
//
//        System.out.println(divTag);
        Elements links = doc.select("table");

        Element free_quests = links.get(1);
        Element memb_quests = links.get(3);

        parse_quests(free_quests);
    }

    public static void parse_quests(Element quests) {



    }

}
