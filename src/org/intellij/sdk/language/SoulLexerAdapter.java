package org.intellij.sdk.language;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class SoulLexerAdapter extends FlexAdapter {
    public SoulLexerAdapter() {
        super(new SoulLexer((Reader) null));
    }
}
