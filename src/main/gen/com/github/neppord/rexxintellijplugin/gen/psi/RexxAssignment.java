// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxAssignment extends PsiElement {

  @NotNull
  List<RexxExpression> getExpressionList();

  @NotNull
  RexxNameDeclaration getNameDeclaration();

  @NotNull
  PsiElement getOperatorEqual();

}
