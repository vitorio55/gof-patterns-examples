package com.learning.gofpatterns.structural.proxy;

public class PrivateContent implements ContentAccess {
    private final String className;
    private String accessKey;
    private final Content data;

    private static final String KEY = "ABC_123";

    public PrivateContent(Content data) {
        this.data = data;
        this.accessKey = "";
        className = this.getClass().getSimpleName();
    }

    @Override
    public String getContent() {
        if (accessKey == null || !accessKey.equals(KEY)) {
            System.out.printf("[%s] access to content denied!\n", this.className);
            return null;
        }
        System.out.printf("[%s] access to content granted!\n", this.className);
        return data.getContent();
    }

    @Override
    public void setContent(String data) {
        if (accessKey == null || !accessKey.equals(KEY)) {
            System.out.printf("[%s] modification of content denied!\n", this.className);
            return;
        }
        this.setContent(data);
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }
}
