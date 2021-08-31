package com.learning.gofpatterns.structural.proxy;

public class Content implements ContentAccess {
    private String data;

    public Content(String data) {
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
