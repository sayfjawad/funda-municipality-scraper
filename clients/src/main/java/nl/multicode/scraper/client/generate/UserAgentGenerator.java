package nl.multicode.scraper.client.generate;

import java.util.Random;

public class UserAgentGenerator {

    private static final String CHROME_WINDOWS_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.%d.%d Safari/537.36";

    private static final String CHROME_MACOS_USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_%d_%d) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.%d.%d Safari/537.36";

    private static final String FIREFOX_WINDOWS_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:%d.0) Gecko/20100101 Firefox/%d.0";

    private static final String FIREFOX_MACOS_USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_%d_%d) Gecko/20100101 Firefox/%d.0";

    private static final String SAFARI_USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_%d_%d) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/%d.0 Safari/605.1.15";

    private static final String EDGE_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.%d.%d Safari/537.36 Edg/%d.%d.%d.150";

    private static final String[] USER_AGENTS = {
            CHROME_WINDOWS_USER_AGENT,
            CHROME_MACOS_USER_AGENT,
            FIREFOX_WINDOWS_USER_AGENT,
            FIREFOX_MACOS_USER_AGENT,
            SAFARI_USER_AGENT,
            EDGE_USER_AGENT
    };

    public static String getRandomUserAgent() {

        Random rand = new Random();
        int v1 = rand.nextInt(40) + 60;  // Random number between 60 and 99
        int v2 = rand.nextInt(10);       // Random number between 0 and 9
        int v3 = rand.nextInt(900) + 100; // Random number between 100 and 999

        String pattern = USER_AGENTS[rand.nextInt(USER_AGENTS.length)];
        return String.format(pattern, v1, v2, v1, v2, v3);
    }
}
