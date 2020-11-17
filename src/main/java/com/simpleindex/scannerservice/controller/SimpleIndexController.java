package com.simpleindex.scannerservice.controller;

import com.simpleindex.scannerservice.model.DocumentBean;
import com.simpleindex.scannerservice.service.DocumentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller()
public class SimpleIndexController {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleIndexController.class);

    @Autowired
    private DocumentService documentService;

    @GetMapping("/")
    public String showForm(Model model) {
        DocumentBean document = new DocumentBean();
        model.addAttribute("document", document);
        return "simple-index";

    }

    @PostMapping("/report")
    public String submitForm(Model model, @ModelAttribute("user") DocumentBean document) {
        System.out.println("document == " + document.toString());
        LOG.info("Retrieving all the records from Documents for toDate{}=, fromDate{}=", document.getToDate(), document.getFromDate());
        model.addAttribute("documents", documentService.getDocumentsFromDate(document.getToDate(), document.getFromDate()));
        return "document";
    }

   /* @GetMapping("/document/to/{toDate}/from/{fromDate}")
    public String document(Model model, @PathVariable("toDate") final String toDate, @PathVariable("fromDate") final String fromDate) {
        LOG.info("Retrieving all the records from Documents for toDate{}=, fromDate{}=", toDate, fromDate);
        model.addAttribute("documents", documentService.getDocumentsFromDate(toDate, fromDate));
        return "document";
    }*/

   /* @GetMapping("/document")
    public ModelAndView document(Model model) {
        LOG.info("Retrieving all the records from Documents for ");
        model.addAttribute("documents", documentService.getDocuments());
        return new ModelAndView("document");
    }*/
}
