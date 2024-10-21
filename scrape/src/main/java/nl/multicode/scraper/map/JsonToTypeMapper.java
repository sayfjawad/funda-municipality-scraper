package nl.multicode.scraper.map;

public interface JsonToTypeMapper<R> {

    R map(String jsonString);
}
