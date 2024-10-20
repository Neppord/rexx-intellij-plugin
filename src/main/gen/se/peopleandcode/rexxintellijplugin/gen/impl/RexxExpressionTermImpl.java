// This is a generated file. Not intended for manual editing.
package se.peopleandcode.rexxintellijplugin.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static se.peopleandcode.rexxintellijplugin.gen.RexxTokens.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import se.peopleandcode.rexxintellijplugin.gen.psi.*;

public class RexxExpressionTermImpl extends ASTWrapperPsiElement implements RexxExpressionTerm {

  public RexxExpressionTermImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RexxVisitor visitor) {
    visitor.visitExpressionTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RexxVisitor) accept((RexxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RexxFunctionCall getFunctionCall() {
    return findChildByClass(RexxFunctionCall.class);
  }

  @Override
  @Nullable
  public RexxGlobal getGlobal() {
    return findChildByClass(RexxGlobal.class);
  }

  @Override
  @Nullable
  public RexxMethodCall getMethodCall() {
    return findChildByClass(RexxMethodCall.class);
  }

  @Override
  @Nullable
  public RexxNumericConstant getNumericConstant() {
    return findChildByClass(RexxNumericConstant.class);
  }

  @Override
  @Nullable
  public RexxParentheticalExpression getParentheticalExpression() {
    return findChildByClass(RexxParentheticalExpression.class);
  }

  @Override
  @Nullable
  public RexxStem getStem() {
    return findChildByClass(RexxStem.class);
  }

  @Override
  @Nullable
  public RexxStringLiteral getStringLiteral() {
    return findChildByClass(RexxStringLiteral.class);
  }

  @Override
  @Nullable
  public RexxVariable getVariable() {
    return findChildByClass(RexxVariable.class);
  }

}
