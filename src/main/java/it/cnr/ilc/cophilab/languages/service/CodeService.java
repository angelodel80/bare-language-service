package it.cnr.ilc.cophilab.languages.service;


import org.springframework.stereotype.Service;

@Service
public class CodeService {
    private static final String codeStr =   "* play with antlr4\n" +
                                            "* write a tutorial\n";

    public String retrieveCodeStr(){
        return codeStr;
    }
}
