// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.neppord.rexxintellijplugin.gen.RexxTokens.*;
import com.github.neppord.rexxintellijplugin.expressions.Variable;
import com.github.neppord.rexxintellijplugin.gen.psi.*;

public class RexxVariableImpl extends Variable implements RexxVariable {

  public RexxVariableImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitVariable(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RexxIdentifier_ getIdentifier_() {
    return findNotNullChildByClass(RexxIdentifier_.class);
  }

}
