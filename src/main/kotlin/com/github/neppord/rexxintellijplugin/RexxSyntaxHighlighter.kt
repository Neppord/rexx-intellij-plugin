package com.github.neppord.rexxintellijplugin

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default

class RexxSyntaxHighlighter: SyntaxHighlighterBase() {
    override fun getHighlightingLexer() = RexxLexer
    override fun getTokenHighlights(tokenType: IElementType?) = when {
        operator.contains(tokenType) -> arrayOf(Default.OPERATION_SIGN)
        keyword.contains(tokenType) -> arrayOf(Default.KEYWORD)
        STRING == tokenType -> arrayOf(Default.STRING)
        else -> arrayOf()
    }

}