package day21_tasks;

public class WebsiteChecker {

    public static void main(String[] args) {

        String[] sites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};

        int comCount = 0;
        int orgCount = 0;
        int eduCount = 0;
        int otherCount = 0;

        for (String site : sites){
            String domainType = site.substring(site.indexOf('.'));

            switch (domainType){
                case ".com":
                    comCount++;
                    break;
                case ".org":
                    orgCount++;
                    break;
                case ".edu":
                    eduCount++;
                    break;
                default:
                    otherCount++;
            }
        }

        System.out.println("There are " + comCount + " websites with .com domain");
        System.out.println("There are " + orgCount + " websites with .org domain");
        System.out.println("There are " + eduCount + " websites with .edu domain");
        System.out.println("There are " + otherCount + " websites with other domains");
    }
}
