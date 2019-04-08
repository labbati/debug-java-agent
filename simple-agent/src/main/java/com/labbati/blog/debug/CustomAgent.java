package com.labbati.blog.debug;

import java.lang.instrument.Instrumentation;

/**
 * This is the agent comment
 */
public class CustomAgent {
    public static void premain(String args, Instrumentation inst) {
        System.out.println("This is the agent premain method!");
    }
}
