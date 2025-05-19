package com.web.designPatterns.creational.prototype.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    private ApplicationContext applicationContext;

    public void createDocument(String title, String content){
        Document doc1 = applicationContext.getBean(Document.class);
        Document doc2 = applicationContext.getBean(Document.class);

        System.out.println(System.identityHashCode(doc1));
        System.out.println(System.identityHashCode(doc2));

        doc2.setTitle("title");
        doc2.setContent("Description");
        System.out.println(doc2.clone()); // creates new object which is cloned from doc2

        System.out.println("doc1 "+doc1.cloneFrom(doc2));
        System.out.println("doc1 "+ doc1);
    }

}
