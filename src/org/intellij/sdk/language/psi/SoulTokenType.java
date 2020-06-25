package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.SoulLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SoulTokenType extends IElementType {
    protected SoulTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SoulLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SoulTokenType." + super.toString();
    }
}
