package example;
package gradle.com;
package logger;

import com.google.common.base.Joiner;

public class Example {

    public static String join(String... args) {
        return Joiner.on(' ').join(args);
    }

}
