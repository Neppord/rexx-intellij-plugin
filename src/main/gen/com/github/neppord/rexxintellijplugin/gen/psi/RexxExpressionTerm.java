// This is a generated file. Not intended for manual editing.
package com.github.neppord.rexxintellijplugin.gen.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RexxExpressionTerm extends PsiElement {

  @Nullable
  RexxFunctionCall getFunctionCall();

  @Nullable
  RexxNumericConstant getNumericConstant();

  @Nullable
  RexxParentheticalExpression getParentheticalExpression();

  @Nullable
  RexxStringLiteral getStringLiteral();

  @Nullable
  RexxVariable getVariable();

}
