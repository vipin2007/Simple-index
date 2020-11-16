package com.simpleindex.scannerservice.controller;

import com.simpleindex.scannerservice.service.DocumentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class SimpleIndexController {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleIndexController.class);

    @Autowired
    private DocumentService documentService;

    @GetMapping("/document/to/{toDate}/from/{fromDate}")
    public String document(Model model, @PathVariable("toDate") final String toDate, @PathVariable("fromDate") final String fromDate) {
        LOG.info("Retrieving all the records from Documents for toDate{}=, fromDate{}=", toDate, fromDate);
        model.addAttribute("documents", documentService.getDocumentsFromDate(toDate, fromDate));
        return "document";
    }

    @GetMapping("/document")
    public ModelAndView document(Model model) {
        LOG.info("Retrieving all the records from Documents for ");
        model.addAttribute("documents", documentService.getDocuments());
        return new ModelAndView("document");
    }
}
