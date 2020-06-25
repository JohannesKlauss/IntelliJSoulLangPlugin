package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.SoulLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SoulElementType extends IElementType {
    public SoulElementType( @NotNull @NonNls String debugName) {
        super(debugName, SoulLanguage.INSTANCE);
    }
}
