package com.lakshman.iplStats.util;

import java.util.UUID;

public class SecurityContextUtil {

    private SecurityContextUtil() {

    }

    public static UUID getCurrentUserId() {
        return UUID.fromString("02b1a073-41df-4a5a-a73e-d48607738f36");
    }
}
