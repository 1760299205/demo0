package com.example.demo5.code.textone.config.oracle;

/**
 * 数据源上下文
 */
public class DataSourceContext {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void setDataSource(String value) {
        contextHolder.set(value);
    }

    public static String getDataSource() {
        return contextHolder.get();
    }

    public static void clearDataSource() {
        contextHolder.remove();
    }
}