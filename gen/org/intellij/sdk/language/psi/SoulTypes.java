// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface SoulTypes {

  IElementType PROPERTY = new SoulElementType("PROPERTY");

  IElementType COMMENT = new SoulTokenType("COMMENT");
  IElementType CRLF = new SoulTokenType("CRLF");
  IElementType KEY = new SoulTokenType("KEY");
  IElementType SEPARATOR = new SoulTokenType("SEPARATOR");
  IElementType VALUE = new SoulTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new SoulPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
