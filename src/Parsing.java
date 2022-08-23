import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parsing {
    public static void main(String[] args) throws Exception {
        Document document = Jsoup.connect("https://industriyakrasoty.ru/").get();
        Elements elements = document.select("img");
        for (Element element : elements)
            System.out.println(element.attr("src"));
    }
}