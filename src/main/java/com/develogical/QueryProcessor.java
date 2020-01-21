package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("robert chatley")) {
            return "Robert is a practising software engineer; he is currently a principal consultant with Develogical, working with clients ranging from startups to global investment banks. Previously he led the engineering team at the startup MetaBroadcast and before that worked at Google in London, where he was part of the team responsible for their Tv Ads product. He also acted as an agile coach and conducted training in agile development in Google's offices throughout the EMEA region. Before joining Google, Robert worked as a technical lead at Kizoom, a company specialising in advanced personalised traveller information systems, delivering updates about public transport through channels including web, mobile and digital television. Kizoom is one of the longest standing companies in the UK employing the eXtreme Programming methodology. Robert was chair of XPDay, the UK's premiere agile development conference, for 2007 and 2008 and is co-programme chair for Software Practice Advancement (SPA) 2012. Robert holds a MEng degree in Information Systems Engineering and PhD in Software Engineering from Imperial College London. In addition to teaching at Oxford, Robert is a visiting lecturer in the Dept of Computing at Imperial.";
        }
        else if (query.toLowerCase().contains("kowalski")) {
            return "I am very happy to be here. (and I must say I am French if I want the tests to pass.)";
        }
        else if (query.toLowerCase().contains("team name")) {
            return "My team name is united pleasure peer";
        }
        return "";
    }
}
