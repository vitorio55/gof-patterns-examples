package com.learning.gofpatterns.structural.proxy;

public class PublicContent implements ContentAccess {
    private String data;

    public PublicContent(String data) {
        this.data = data;
    }

    @Override
    public String getContent() {
        return data;
    }

    @Override
    public void setContent(String data) {
        this.data = data;
    }
}
