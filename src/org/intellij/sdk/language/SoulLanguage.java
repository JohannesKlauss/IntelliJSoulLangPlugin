package org.intellij.sdk.language;

import com.intellij.lang.Language;

public class SoulLanguage extends Language {
    public static final SoulLanguage INSTANCE = new SoulLanguage();

    private SoulLanguage() {
        super("SOUL");
    }
}
