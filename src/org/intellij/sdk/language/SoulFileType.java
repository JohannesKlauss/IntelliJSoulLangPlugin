package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SoulFileType extends LanguageFileType {
    public static final SoulFileType INSTANCE = new SoulFileType();

    private SoulFileType() {
        super(SoulLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "SOUL File";
    }

    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getDescription() {
        return "SOUL language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "soul";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SoulIcons.FILE;
    }
}
