package it.cnr.ilc.cophilab.languages.antlr;

// Generated from todo.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class todoParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0=1, T__1=2, T__2=3, NL=4, CONTENT=5;
    public static final int
            RULE_elements = 0, RULE_element = 1, RULE_emptyLine = 2;
    private static String[] makeRuleNames() {
        return new String[] {
                "elements", "element", "emptyLine"
        };
    }
    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[] {
                null, "'*'", "' '", "'\t'"
        };
    }
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static String[] makeSymbolicNames() {
        return new String[] {
                null, null, null, null, "NL", "CONTENT"
        };
    }
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() { return "todo.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public todoParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }

    public static class ElementsContext extends ParserRuleContext {
        public TerminalNode EOF() { return getToken(todoParser.EOF, 0); }
        public List<ElementContext> element() {
            return getRuleContexts(ElementContext.class);
        }
        public ElementContext element(int i) {
            return getRuleContext(ElementContext.class,i);
        }
        public List<EmptyLineContext> emptyLine() {
            return getRuleContexts(EmptyLineContext.class);
        }
        public EmptyLineContext emptyLine(int i) {
            return getRuleContext(EmptyLineContext.class,i);
        }
        public ElementsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_elements; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof todoListener ) ((todoListener)listener).enterElements(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof todoListener ) ((todoListener)listener).exitElements(this);
        }
    }

    public final ElementsContext elements() throws RecognitionException {
        ElementsContext _localctx = new ElementsContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_elements);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(10);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==T__0 || _la==NL) {
                    {
                        setState(8);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__0:
                            {
                                setState(6);
                                element();
                            }
                            break;
                            case NL:
                            {
                                setState(7);
                                emptyLine();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(12);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(13);
                match(EOF);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementContext extends ParserRuleContext {
        public TerminalNode CONTENT() { return getToken(todoParser.CONTENT, 0); }
        public List<TerminalNode> NL() { return getTokens(todoParser.NL); }
        public TerminalNode NL(int i) {
            return getToken(todoParser.NL, i);
        }
        public ElementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_element; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof todoListener ) ((todoListener)listener).enterElement(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof todoListener ) ((todoListener)listener).exitElement(this);
        }
    }

    public final ElementContext element() throws RecognitionException {
        ElementContext _localctx = new ElementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_element);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(15);
                match(T__0);
                setState(19);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==T__1 || _la==T__2) {
                    {
                        {
                            setState(16);
                            _la = _input.LA(1);
                            if ( !(_la==T__1 || _la==T__2) ) {
                                _errHandler.recoverInline(this);
                            }
                            else {
                                if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                    }
                    setState(21);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(22);
                match(CONTENT);
                setState(24);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(23);
                                match(NL);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(26);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EmptyLineContext extends ParserRuleContext {
        public TerminalNode NL() { return getToken(todoParser.NL, 0); }
        public EmptyLineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_emptyLine; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof todoListener ) ((todoListener)listener).enterEmptyLine(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof todoListener ) ((todoListener)listener).exitEmptyLine(this);
        }
    }

    public final EmptyLineContext emptyLine() throws RecognitionException {
        EmptyLineContext _localctx = new EmptyLineContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_emptyLine);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(28);
                match(NL);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7!\4\2\t\2\4\3\t"+
                    "\3\4\4\t\4\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\3\3\3\7\3\24"+
                    "\n\3\f\3\16\3\27\13\3\3\3\3\3\6\3\33\n\3\r\3\16\3\34\3\4\3\4\3\4\2\2\5"+
                    "\2\4\6\2\3\3\2\4\5\2!\2\f\3\2\2\2\4\21\3\2\2\2\6\36\3\2\2\2\b\13\5\4\3"+
                    "\2\t\13\5\6\4\2\n\b\3\2\2\2\n\t\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r"+
                    "\3\2\2\2\r\17\3\2\2\2\16\f\3\2\2\2\17\20\7\2\2\3\20\3\3\2\2\2\21\25\7"+
                    "\3\2\2\22\24\t\2\2\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3"+
                    "\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\32\7\7\2\2\31\33\7\6\2\2\32\31\3"+
                    "\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\5\3\2\2\2\36\37\7"+
                    "\6\2\2\37\7\3\2\2\2\6\n\f\25\34";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
