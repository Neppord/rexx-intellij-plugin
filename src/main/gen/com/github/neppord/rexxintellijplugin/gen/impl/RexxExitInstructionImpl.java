// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.neppord.rexxintellijplugin.gen.RexxTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.neppord.rexxintellijplugin.gen.psi.*;

public class RexxExitInstructionImpl extends ASTWrapperPsiElement implements RexxExitInstruction {

  public RexxExitInstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitExitInstruction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RexxExpression getExpression() {
    return findChildByClass(RexxExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getKeywordExit() {
    return findNotNullChildByType(KEYWORD_EXIT);
  }

}
