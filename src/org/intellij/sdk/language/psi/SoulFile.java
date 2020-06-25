package org.intellij.sdk.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.intellij.sdk.language.SoulFileType;
import org.intellij.sdk.language.SoulLanguage;
import org.jetbrains.annotations.NotNull;

public class SoulFile extends PsiFileBase {
    public SoulFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SoulLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SoulFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Soul File";
    }
}
