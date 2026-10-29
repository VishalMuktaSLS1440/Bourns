package com.sodales.bourns_24hr.pages;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Holds values produced by the application while the test is running -
 * case ids, ticket numbers, reference numbers.
 *
 * A capture step stores the value:  RuntimeContext.set("caseId", page.x_captureValue());
 * Later steps read it back:         page.search_sendKeys(RuntimeContext.get("caseId"));
 *
 * Values are held per thread so parallel TestNG execution stays isolated.
 * GENERATED FILE - do not edit by hand, it is rewritten on every code generation run.
 */
public final class RuntimeContext {

    private static final Pattern TOKEN = Pattern.compile("\\$\\{([a-zA-Z0-9_]+)\\}");

    private static final ThreadLocal<Map<String, String>> VALUES =
            new ThreadLocal<Map<String, String>>() {
                @Override
                protected Map<String, String> initialValue() {
                    return new LinkedHashMap<String, String>();
                }
            };

    private RuntimeContext() {
    }

    /** Store a value captured from the application. */
    public static void set(String name, String value) {
        String clean = value == null ? "" : value.trim();
        VALUES.get().put(name, clean);
        System.out.println("[RuntimeContext] captured " + name + " = " + clean);
    }

    /** Read a captured value. Fails loudly rather than falling back to recorded data. */
    public static String get(String name) {
        String value = VALUES.get().get(name);
        if (value == null || value.isEmpty()) {
            throw new IllegalStateException("No runtime value was captured for '" + name
                    + "'. The capture step did not run, or the element was still empty "
                    + "when it ran. Captured so far: " + VALUES.get());
        }
        return value;
    }

    public static String getOrDefault(String name, String fallback) {
        String value = VALUES.get().get(name);
        return (value == null || value.isEmpty()) ? fallback : value;
    }

    public static boolean has(String name) {
        String value = VALUES.get().get(name);
        return value != null && !value.isEmpty();
    }

    /**
     * Pull the wanted part out of an element's text.
     *
     * The element normally shows a label as well as the value -
     * "Grievance Number: OTT-2026-00017" - and the id differs on every run,
     * so the pattern recorded by OBSERVER describes the SHAPE of the value
     * rather than its characters. Group 1 is used when the pattern has one
     * (label-anchored form), otherwise the whole match.
     *
     * An empty pattern means take the whole text - the behaviour of
     * recordings made before patterns existed.
     */
    public static String extract(String rawText, String pattern) {
        String text = rawText == null ? "" : rawText.replace('\u00a0', ' ').trim();
        if (pattern == null || pattern.isEmpty() || text.isEmpty()) {
            return text;
        }
        Matcher matcher;
        try {
            matcher = Pattern.compile(pattern).matcher(text);
        } catch (RuntimeException badPattern) {
            System.out.println("[RuntimeContext] unusable capture pattern: " + pattern);
            return text;
        }
        if (!matcher.find()) {
            return "";
        }
        String found = (matcher.groupCount() >= 1 && matcher.group(1) != null)
                ? matcher.group(1) : matcher.group();
        return found == null ? "" : found.trim();
    }

    /** Replace every ${token} in the template with the value captured for it. */
    public static String resolve(String template) {
        if (template == null) {
            return null;
        }
        Matcher matcher = TOKEN.matcher(template);
        StringBuffer out = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(out, Matcher.quoteReplacement(get(matcher.group(1))));
        }
        matcher.appendTail(out);
        return out.toString();
    }

    public static Map<String, String> snapshot() {
        return new LinkedHashMap<String, String>(VALUES.get());
    }

    /** Call from @AfterMethod / @AfterClass if you reuse the thread. */
    public static void clear() {
        VALUES.get().clear();
    }
}
