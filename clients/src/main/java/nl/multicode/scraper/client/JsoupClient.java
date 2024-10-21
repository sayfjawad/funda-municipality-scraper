package nl.multicode.scraper.client;

import java.io.IOException;
import lombok.RequiredArgsConstructor;
import nl.multicode.scraper.client.generate.UserAgentGenerator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

@RequiredArgsConstructor
public class JsoupClient {

    private static final String USER_AGENT_HEADER = "User-Agent";

    private static final String ACCEPT_LANGUAGE = "Accept-Language";

    public Document getDocument(final String searchBuyUrl)
            throws IOException {

        return Jsoup
                .connect(searchBuyUrl)
                .header(USER_AGENT_HEADER, UserAgentGenerator.getRandomUserAgent())
                .header(ACCEPT_LANGUAGE, "nl-NL")
                .get();
    }

}
