package com.github.yihtserns.test.logback.appender.custom;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;

public class CatAppender extends AppenderBase<ILoggingEvent> {

    @Override
    protected void append(ILoggingEvent event) {
        System.out.println("Meow: " + event.getFormattedMessage());
    }
}
