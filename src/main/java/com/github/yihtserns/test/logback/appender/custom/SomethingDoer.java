package com.github.yihtserns.test.logback.appender.custom;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SomethingDoer {

    public void doSomething() {
        log.info("Hello");
    }
}
