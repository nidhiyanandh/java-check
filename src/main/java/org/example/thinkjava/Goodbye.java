package org.example.thinkjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Goodbye {
    private  static final Logger log =  LoggerFactory.getLogger(Goodbye.class);
    public static void G1() {
        log.debug("Good bye!");
        log.info("cruel world!");
    }
}
