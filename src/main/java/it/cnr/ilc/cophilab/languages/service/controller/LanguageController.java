package it.cnr.ilc.cophilab.languages.service.controller;

import it.cnr.ilc.cophilab.languages.antlr.todoLexer;
import it.cnr.ilc.cophilab.languages.antlr.todoParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

    private static final Logger log = LoggerFactory.getLogger(LanguageController.class);
    private static final String codeStr =   "* play with antlr4\n" +
                                            "* write a tutorial\n";

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
    public String getLanguageTest(){
        log.info("in test language");
        String ret;
        todoLexer lexer = new todoLexer(CharStreams.fromString(codeStr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        todoParser parser = new todoParser(tokens);
        ParseTree ast = parser.elements();

        ret = ast.toStringTree();

        log.info(ret);

        return ret;
    }
}
