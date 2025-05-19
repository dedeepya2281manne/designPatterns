package com.web.designPatterns.creational.prototype.springexample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping
    public String create(@RequestParam String title, @RequestParam String content) {
         documentService.createDocument(title, content);
        return "Created: ";
    }
}
