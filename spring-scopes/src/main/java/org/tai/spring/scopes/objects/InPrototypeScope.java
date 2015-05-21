package org.tai.spring.scopes.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InPrototypeScope {
    private static final Logger L = LoggerFactory.getLogger(InPrototypeScope.class);

    public void postInit() {
        L.info("postInit()");
    }

}
