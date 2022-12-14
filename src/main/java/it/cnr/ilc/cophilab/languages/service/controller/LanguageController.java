package it.cnr.ilc.cophilab.languages.service.controller;

import it.cnr.ilc.cophilab.commons.dsl.antlr.BaseCophiErrorListener;
import it.cnr.ilc.cophilab.commons.dsl.antlr.BaseCophiXMLVisitor;
import it.cnr.ilc.cophilab.commons.dsl.model.Error;
import it.cnr.ilc.cophilab.languages.antlr.todoLexer;
import it.cnr.ilc.cophilab.languages.antlr.todoParser;
import it.cnr.ilc.cophilab.languages.service.CodeService;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dom4j.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.cnr.ilc.cophilab.commons.dsl.utils.XMLHelper;

import java.util.List;

@RestController
public class LanguageController {

    private static final Logger log = LoggerFactory.getLogger(LanguageController.class);

    @Autowired
    private CodeService codeService;

    @GetMapping(value = "/")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public String getLanguageService(){
        log.info("in getLanguageService");
        return this.getClass().getCanonicalName();
    }


    @GetMapping(value = "/test")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public List<Error> getLanguageTest(){
        log.info("in test language");
        List<Error> errors;

        todoLexer lexer = new todoLexer(CharStreams.fromString(codeService.retrieveCodeStr()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        todoParser parser = new todoParser(tokens);
        BaseCophiErrorListener errLis = new BaseCophiErrorListener();
        parser.addErrorListener(errLis);
        ParseTree ast = parser.elements();
        log.info(ast.toStringTree());

        log.info("Errors: " + parser.getNumberOfSyntaxErrors());

        errors = errLis.getParseErrors();

        return errors;
    }

    @GetMapping(value = "/testXML", produces = MediaType.TEXT_XML_VALUE)
    @CrossOrigin(origins = "*")
    @ResponseBody
    public String getXMLTest(){

        todoLexer lexer = new todoLexer(CharStreams.fromString(codeService.retrieveCodeStr()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        todoParser parser = new todoParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree ast = parser.elements();
        log.info(ast.toStringTree());
        String visit = ast.accept(new BaseCophiXMLVisitor<>());
        log.info(visit);

        String ret = visit;
        Document doc = XMLHelper.stringToDom4j(visit);
        String retAlias = XMLHelper.documentToString(doc);


        log.info(ret);
        log.info(retAlias);

        return ret;

    }
}
