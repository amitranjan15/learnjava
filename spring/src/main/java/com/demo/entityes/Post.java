package com.demo.entityes;

import javax.persistence.Embeddable;

@Embeddable
public class Post {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
