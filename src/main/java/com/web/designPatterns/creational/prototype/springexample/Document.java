package com.web.designPatterns.creational.prototype.springexample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Document {
    private String title;
    private String content;

    public Document() {
        System.out.println("Document constructor");
    }
    public Document clone() {
        Document copy = new Document();
        copy.setTitle(this.title);
        copy.setContent(this.content);
        return copy;
    }

    public Document cloneFrom(Document template) {
        this.title = template.title;
        this.content = template.content;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
