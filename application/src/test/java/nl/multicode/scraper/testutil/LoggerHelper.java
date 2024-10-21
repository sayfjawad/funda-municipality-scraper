package nl.multicode.scraper.testutil;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import org.slf4j.LoggerFactory;

public interface LoggerHelper {

    default ListAppender<ILoggingEvent> createListAppenderFor(Class<?> clazz) {

        final var logger = (Logger) LoggerFactory.getLogger(clazz);

        final var listAppender = new ListAppender<ILoggingEvent>();
        listAppender.start();

        logger.addAppender(listAppender);
        logger.setLevel(Level.WARN);
        logger.setAdditive(false);

        return listAppender;
    }
}
