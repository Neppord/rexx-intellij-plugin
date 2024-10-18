// Generated by JFlex 1.9.2 http://jflex.de/  (tweaked for IntelliJ platform)
// source: src/main/flex/Parse.flex

package com.github.neppord.rexxintellijplugin.gen;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.neppord.rexxintellijplugin.gen.RexxTokens.*;


public class _RexxLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\u10fe\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\25\0\1\1\1\3\1\4\1\5"+
    "\1\0\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\10\23\1\24"+
    "\1\25\1\26\1\27\1\30\2\0\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\2\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\42\1\0\1\61"+
    "\1\0\1\62\1\63\1\0\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\2\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\42\1\0\1\64\1\0"+
    "\1\65\55\0\1\66\203\0\2\67\115\0\1\70\u0180\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[768];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\1\1\5\1\6"+
    "\1\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\2\17\1\20\1\21\1\22\1\23\23\24\2\1"+
    "\1\25\1\26\3\1\2\0\1\27\1\30\1\31\1\0"+
    "\1\32\1\33\6\0\1\34\1\35\1\36\1\37\3\24"+
    "\1\40\6\24\1\41\22\24\1\0\3\24\1\0\3\24"+
    "\1\0\1\42\1\34\1\43\1\44\1\45\1\46\1\41"+
    "\7\0\1\47\1\50\1\51\3\0\1\52\1\53\1\24"+
    "\1\54\3\24\1\0\1\55\2\24\1\0\6\24\1\56"+
    "\7\24\1\0\2\24\1\0\2\24\1\57\3\24\1\0"+
    "\2\24\2\60\1\24\1\61\1\24\1\0\1\24\1\0"+
    "\1\62\2\0\1\57\3\0\1\63\1\64\3\0\1\65"+
    "\1\24\1\66\1\67\2\70\1\71\1\24\1\71\5\24"+
    "\1\72\2\24\1\0\2\24\1\0\1\24\1\73\2\74"+
    "\2\24\1\0\5\24\1\0\1\75\3\24\1\0\2\76"+
    "\1\77\1\100\7\0\2\24\1\0\1\24\1\101\2\24"+
    "\1\102\2\24\1\0\1\24\2\103\1\24\1\104\2\105"+
    "\1\106\4\24\1\0\1\107\1\110\2\111\7\0\1\24"+
    "\1\0\2\112\4\24\1\0\1\24\1\0\2\24\1\113"+
    "\1\114\1\115\1\116\1\115\2\0\1\114\1\116\1\0"+
    "\1\117\1\0\2\120\1\121\1\24\1\122\2\123\2\124"+
    "\1\24\1\0\1\24\1\0\1\122\1\0\1\125\2\24"+
    "\1\0\1\24\2\0\1\126\2\127\1\130\1\126\1\0"+
    "\1\131";

  private static int [] zzUnpackAction() {
    int [] result = new int[324];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\71\0\344\0\u011d\0\71"+
    "\0\u0156\0\u018f\0\71\0\71\0\u01c8\0\71\0\u0201\0\u023a"+
    "\0\u0273\0\u02ac\0\u02e5\0\u031e\0\u0357\0\u0390\0\u03c9\0\u0402"+
    "\0\u043b\0\u0474\0\u04ad\0\u04e6\0\u051f\0\u0558\0\u0591\0\u05ca"+
    "\0\u0603\0\u063c\0\u0675\0\u06ae\0\u06e7\0\u0720\0\u0759\0\u0792"+
    "\0\u07cb\0\u0804\0\u083d\0\u0876\0\u08af\0\u08e8\0\71\0\u0921"+
    "\0\u095a\0\u0993\0\u0201\0\344\0\71\0\u09cc\0\71\0\u018f"+
    "\0\71\0\u0a05\0\u0a3e\0\u0a77\0\u0ab0\0\u0ae9\0\u0b22\0\u0b5b"+
    "\0\71\0\71\0\u0b94\0\71\0\u0bcd\0\u0c06\0\u0c3f\0\u0474"+
    "\0\u0c78\0\u0cb1\0\u0cea\0\u0d23\0\u0d5c\0\u0d95\0\u0474\0\u0dce"+
    "\0\u0e07\0\u0e40\0\u0e79\0\u0eb2\0\u0eeb\0\u0f24\0\u0f5d\0\u0f96"+
    "\0\u0fcf\0\u1008\0\u1041\0\u107a\0\u10b3\0\u10ec\0\u1125\0\u115e"+
    "\0\u1197\0\u11d0\0\u1209\0\u1242\0\u127b\0\u12b4\0\u12ed\0\u1326"+
    "\0\u135f\0\u1398\0\71\0\u13d1\0\71\0\71\0\71\0\71"+
    "\0\71\0\u140a\0\u1443\0\u147c\0\u14b5\0\u14ee\0\u1527\0\u1560"+
    "\0\u1599\0\u0ae9\0\u0b22\0\u15d2\0\u160b\0\u1644\0\u167d\0\71"+
    "\0\u16b6\0\u0474\0\u16ef\0\u1728\0\u1761\0\u179a\0\u0474\0\u17d3"+
    "\0\u180c\0\u1845\0\u187e\0\u18b7\0\u18f0\0\u1929\0\u1962\0\u199b"+
    "\0\u0474\0\u19d4\0\u1a0d\0\u1a46\0\u1a7f\0\u1ab8\0\u1af1\0\u1b2a"+
    "\0\u1b63\0\u1b9c\0\u1bd5\0\u1c0e\0\u1c47\0\u1c80\0\u0474\0\u1cb9"+
    "\0\u1cf2\0\u1d2b\0\u1d64\0\u1d9d\0\u1dd6\0\u0474\0\71\0\u1e0f"+
    "\0\u0474\0\u1e48\0\u1e81\0\u1eba\0\u1ef3\0\u1f2c\0\u1f65\0\u1f9e"+
    "\0\71\0\u1fd7\0\u2010\0\u2049\0\u2049\0\71\0\u2082\0\u20bb"+
    "\0\u20f4\0\71\0\u212d\0\u0474\0\u0474\0\u0474\0\71\0\u0474"+
    "\0\u2166\0\71\0\u219f\0\u21d8\0\u2211\0\u224a\0\u2283\0\u0474"+
    "\0\u22bc\0\u22f5\0\u232e\0\u2367\0\u23a0\0\u23d9\0\u2412\0\u0474"+
    "\0\u0474\0\71\0\u244b\0\u2484\0\u24bd\0\u24f6\0\u252f\0\u2568"+
    "\0\u25a1\0\u25da\0\u2613\0\u0474\0\u264c\0\u2685\0\u26be\0\u26f7"+
    "\0\u0474\0\71\0\71\0\71\0\u2730\0\u2769\0\u27a2\0\u27db"+
    "\0\u2814\0\u284d\0\u2886\0\u28bf\0\u28f8\0\u2931\0\u296a\0\u0474"+
    "\0\u29a3\0\u29dc\0\u0474\0\u2a15\0\u2a4e\0\u2a87\0\u2ac0\0\u0474"+
    "\0\71\0\u2af9\0\u0474\0\u0474\0\71\0\u0474\0\u2b32\0\u2b6b"+
    "\0\u2ba4\0\u2bdd\0\u2c16\0\u0474\0\u0474\0\u0474\0\71\0\u2c4f"+
    "\0\u2c88\0\u2cc1\0\u2cfa\0\u2d33\0\u2d6c\0\u2da5\0\u2dde\0\u2e17"+
    "\0\u0474\0\71\0\u2e50\0\u2e89\0\u2ec2\0\u2efb\0\u2f34\0\u2f6d"+
    "\0\u2fa6\0\u2fdf\0\u3018\0\u0474\0\u0474\0\u0474\0\u0474\0\71"+
    "\0\u3051\0\u308a\0\71\0\71\0\u30c3\0\71\0\u30fc\0\u0474"+
    "\0\71\0\u0474\0\u3135\0\u0474\0\u0474\0\71\0\u0474\0\71"+
    "\0\u316e\0\u31a7\0\u31e0\0\u3219\0\71\0\u3252\0\71\0\u328b"+
    "\0\u32c4\0\u32fd\0\u3336\0\u336f\0\u33a8\0\u0474\0\u0474\0\71"+
    "\0\u0474\0\71\0\u33e1\0\71";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[324];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\2\24\1\25\1\4\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\32"+
    "\1\40\1\32\1\41\1\32\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\2\32\1\54"+
    "\1\55\1\2\1\56\1\57\1\60\1\61\1\62\72\0"+
    "\1\3\13\0\1\63\55\0\1\4\22\0\1\4\43\0"+
    "\2\64\1\0\1\64\1\65\64\64\3\0\1\66\74\0"+
    "\1\67\61\0\2\70\1\0\5\70\1\65\60\70\13\0"+
    "\1\71\57\0\1\3\104\0\1\72\73\0\3\73\60\0"+
    "\1\74\74\0\1\75\1\0\3\24\6\0\1\76\24\0"+
    "\1\77\30\0\1\75\1\0\3\24\71\0\1\100\74\0"+
    "\1\101\66\0\1\102\1\103\67\0\1\101\1\104\62\0"+
    "\3\32\5\0\3\32\1\105\14\32\1\106\7\32\2\0"+
    "\1\32\26\0\3\32\5\0\30\32\2\0\1\32\26\0"+
    "\3\32\5\0\1\107\27\32\2\0\1\32\26\0\3\32"+
    "\5\0\15\32\1\110\2\32\1\111\7\32\2\0\1\32"+
    "\26\0\3\32\5\0\12\32\1\112\1\32\1\113\11\32"+
    "\1\114\1\32\2\0\1\32\26\0\3\32\5\0\15\32"+
    "\1\115\12\32\2\0\1\32\26\0\3\32\5\0\23\32"+
    "\1\116\4\32\2\0\1\32\26\0\3\32\5\0\5\32"+
    "\1\117\6\32\1\120\5\32\1\121\5\32\2\0\1\32"+
    "\26\0\3\32\5\0\4\32\1\122\10\32\1\123\12\32"+
    "\2\0\1\32\26\0\3\32\5\0\15\32\1\124\5\32"+
    "\1\125\4\32\2\0\1\32\26\0\3\32\5\0\16\32"+
    "\1\126\3\32\1\127\5\32\2\0\1\32\26\0\3\32"+
    "\5\0\1\130\17\32\1\131\2\32\1\132\4\32\2\0"+
    "\1\32\26\0\3\32\5\0\23\32\1\133\4\32\2\0"+
    "\1\32\26\0\3\32\5\0\1\134\3\32\1\135\23\32"+
    "\2\0\1\32\26\0\3\32\5\0\1\136\3\32\1\137"+
    "\3\32\1\140\4\32\1\141\12\32\2\0\1\32\3\0"+
    "\1\142\22\0\3\32\5\0\7\32\1\143\10\32\1\144"+
    "\7\32\2\0\1\32\26\0\3\32\5\0\21\32\1\145"+
    "\6\32\2\0\1\32\4\0\1\146\21\0\3\32\5\0"+
    "\1\147\27\32\2\0\1\32\26\0\3\32\5\0\7\32"+
    "\1\150\1\151\17\32\2\0\1\32\3\0\1\152\27\0"+
    "\1\153\1\154\1\155\30\0\1\156\71\0\1\157\72\0"+
    "\1\160\33\0\1\101\77\0\1\161\6\0\1\162\5\0"+
    "\1\163\46\0\1\164\3\0\1\165\3\0\1\142\4\0"+
    "\1\166\20\0\1\142\1\0\2\66\1\0\66\66\2\72"+
    "\1\0\66\72\21\0\3\73\11\0\1\167\33\0\13\74"+
    "\1\170\55\74\21\0\3\171\66\0\2\172\67\0\3\173"+
    "\5\0\6\173\63\0\1\174\1\0\1\175\10\0\1\176"+
    "\52\0\1\177\1\0\1\200\61\0\3\32\5\0\3\32"+
    "\1\201\24\32\2\0\1\32\26\0\3\32\5\0\6\32"+
    "\1\202\21\32\2\0\1\32\26\0\3\32\5\0\12\32"+
    "\1\203\15\32\2\0\1\32\26\0\3\32\5\0\15\32"+
    "\1\204\12\32\2\0\1\32\26\0\3\32\5\0\21\32"+
    "\1\205\6\32\2\0\1\32\4\0\1\206\21\0\3\32"+
    "\5\0\3\32\1\207\24\32\2\0\1\32\26\0\3\32"+
    "\5\0\10\32\1\210\5\32\1\211\11\32\2\0\1\32"+
    "\3\0\1\212\22\0\3\32\5\0\20\32\1\213\7\32"+
    "\2\0\1\32\26\0\3\32\5\0\1\214\27\32\2\0"+
    "\1\32\26\0\3\32\5\0\22\32\1\215\5\32\2\0"+
    "\1\32\26\0\3\32\5\0\4\32\1\216\23\32\2\0"+
    "\1\32\26\0\3\32\5\0\1\217\27\32\2\0\1\32"+
    "\26\0\3\32\5\0\15\32\1\220\12\32\2\0\1\32"+
    "\26\0\3\32\5\0\16\32\1\221\11\32\2\0\1\32"+
    "\26\0\3\32\5\0\13\32\1\222\14\32\2\0\1\32"+
    "\26\0\3\32\5\0\22\32\1\223\5\32\2\0\1\32"+
    "\26\0\3\32\5\0\7\32\1\224\20\32\2\0\1\32"+
    "\26\0\3\32\5\0\20\32\1\225\7\32\2\0\1\32"+
    "\26\0\3\32\5\0\15\32\1\226\12\32\2\0\1\32"+
    "\26\0\3\32\5\0\12\32\1\227\6\32\1\230\6\32"+
    "\2\0\1\32\4\0\1\231\21\0\3\32\5\0\4\32"+
    "\1\232\23\32\2\0\1\32\26\0\3\32\5\0\10\32"+
    "\1\233\17\32\2\0\1\32\3\0\1\234\22\0\3\32"+
    "\5\0\16\32\1\235\3\32\1\236\5\32\2\0\1\32"+
    "\26\0\3\32\5\0\27\32\1\237\2\0\1\32\26\0"+
    "\3\32\5\0\12\32\1\240\15\32\2\0\1\32\26\0"+
    "\3\32\5\0\6\32\1\241\21\32\2\0\1\32\26\0"+
    "\3\32\5\0\23\32\1\242\4\32\2\0\1\32\44\0"+
    "\1\243\52\0\3\32\5\0\4\32\1\244\23\32\2\0"+
    "\1\32\26\0\3\32\5\0\1\245\27\32\2\0\1\32"+
    "\26\0\3\32\5\0\4\32\1\246\23\32\2\0\1\32"+
    "\42\0\1\247\54\0\3\32\5\0\12\32\1\250\5\32"+
    "\1\251\7\32\2\0\1\32\26\0\3\32\5\0\10\32"+
    "\1\252\17\32\2\0\1\32\3\0\1\253\22\0\3\32"+
    "\5\0\22\32\1\254\5\32\2\0\1\32\60\0\1\255"+
    "\44\0\1\256\114\0\1\257\52\0\1\260\113\0\1\261"+
    "\53\0\1\262\101\0\1\263\30\0\1\264\1\0\1\264"+
    "\2\0\3\265\45\0\13\74\1\170\4\74\1\266\50\74"+
    "\21\0\3\171\11\0\1\167\106\0\1\267\60\0\1\270"+
    "\62\0\1\271\62\0\1\272\62\0\3\32\5\0\20\32"+
    "\1\273\7\32\2\0\1\32\26\0\3\32\5\0\12\32"+
    "\1\274\15\32\2\0\1\32\26\0\3\32\5\0\16\32"+
    "\1\275\11\32\2\0\1\32\26\0\3\32\5\0\4\32"+
    "\1\276\23\32\2\0\1\32\42\0\1\277\54\0\3\32"+
    "\5\0\22\32\1\300\5\32\2\0\1\32\26\0\3\32"+
    "\5\0\15\32\1\301\12\32\2\0\1\32\60\0\1\302"+
    "\36\0\3\32\5\0\25\32\1\303\2\32\2\0\1\32"+
    "\26\0\3\32\5\0\20\32\1\304\7\32\2\0\1\32"+
    "\26\0\3\32\5\0\4\32\1\305\23\32\2\0\1\32"+
    "\26\0\3\32\5\0\20\32\1\306\7\32\2\0\1\32"+
    "\26\0\3\32\5\0\24\32\1\307\3\32\2\0\1\32"+
    "\26\0\3\32\5\0\16\32\1\310\11\32\2\0\1\32"+
    "\26\0\3\32\5\0\4\32\1\311\23\32\2\0\1\32"+
    "\26\0\3\32\5\0\10\32\1\312\17\32\2\0\1\32"+
    "\3\0\1\313\22\0\3\32\5\0\4\32\1\314\23\32"+
    "\2\0\1\32\26\0\3\32\5\0\21\32\1\315\6\32"+
    "\2\0\1\32\4\0\1\316\21\0\3\32\5\0\2\32"+
    "\1\317\25\32\2\0\1\32\26\0\3\32\5\0\12\32"+
    "\1\320\15\32\2\0\1\32\26\0\3\32\5\0\7\32"+
    "\1\321\20\32\2\0\1\32\45\0\1\322\51\0\3\32"+
    "\5\0\23\32\1\323\4\32\2\0\1\32\26\0\3\32"+
    "\5\0\21\32\1\324\6\32\2\0\1\32\4\0\1\325"+
    "\52\0\1\325\15\0\1\325\21\0\3\32\5\0\12\32"+
    "\1\326\15\32\2\0\1\32\26\0\3\32\5\0\23\32"+
    "\1\327\4\32\2\0\1\32\26\0\3\32\5\0\4\32"+
    "\1\330\23\32\2\0\1\32\26\0\3\32\5\0\14\32"+
    "\1\331\13\32\2\0\1\32\26\0\3\32\5\0\20\32"+
    "\1\332\7\32\2\0\1\32\52\0\1\333\44\0\3\32"+
    "\5\0\14\32\1\334\13\32\2\0\1\32\26\0\3\32"+
    "\5\0\2\32\1\335\25\32\2\0\1\32\26\0\3\32"+
    "\5\0\23\32\1\336\4\32\2\0\1\32\26\0\3\32"+
    "\5\0\12\32\1\337\15\32\2\0\1\32\50\0\1\340"+
    "\46\0\3\32\5\0\7\32\1\341\20\32\2\0\1\32"+
    "\45\0\1\342\56\0\1\343\1\0\1\344\75\0\1\345"+
    "\104\0\1\346\54\0\1\347\104\0\1\350\40\0\3\265"+
    "\120\0\1\351\46\0\1\352\112\0\1\353\36\0\3\32"+
    "\5\0\4\32\1\354\23\32\2\0\1\32\26\0\3\32"+
    "\5\0\21\32\1\355\6\32\2\0\1\32\4\0\1\356"+
    "\21\0\3\32\5\0\1\357\27\32\2\0\1\32\26\0"+
    "\3\32\5\0\3\32\1\360\24\32\2\0\1\32\26\0"+
    "\3\32\5\0\20\32\1\361\7\32\2\0\1\32\26\0"+
    "\3\32\5\0\1\362\27\32\2\0\1\32\26\0\3\32"+
    "\5\0\4\32\1\363\23\32\2\0\1\32\26\0\3\32"+
    "\5\0\20\32\1\364\7\32\2\0\1\32\26\0\3\32"+
    "\5\0\15\32\1\365\12\32\2\0\1\32\53\0\1\366"+
    "\43\0\3\32\5\0\20\32\1\367\7\32\2\0\1\32"+
    "\26\0\3\32\5\0\4\32\1\370\23\32\2\0\1\32"+
    "\42\0\1\371\54\0\3\32\5\0\4\32\1\372\23\32"+
    "\2\0\1\32\26\0\3\32\5\0\4\32\1\373\23\32"+
    "\2\0\1\32\26\0\3\32\5\0\4\32\1\374\23\32"+
    "\2\0\1\32\42\0\1\375\54\0\3\32\5\0\27\32"+
    "\1\376\2\0\1\32\26\0\3\32\5\0\20\32\1\377"+
    "\7\32\2\0\1\32\26\0\3\32\5\0\2\32\1\u0100"+
    "\25\32\2\0\1\32\26\0\3\32\5\0\1\u0101\27\32"+
    "\2\0\1\32\26\0\3\32\5\0\2\32\1\u0102\25\32"+
    "\2\0\1\32\36\0\1\u0103\60\0\3\32\5\0\4\32"+
    "\1\u0104\23\32\2\0\1\32\26\0\3\32\5\0\4\32"+
    "\1\u0105\23\32\2\0\1\32\26\0\3\32\5\0\4\32"+
    "\1\u0106\23\32\2\0\1\32\42\0\1\u0107\104\0\1\u0108"+
    "\50\0\1\u0109\72\0\1\u010a\70\0\1\u010b\106\0\1\u010c"+
    "\71\0\1\u010d\15\0\1\u010d\40\0\1\u010e\51\0\3\32"+
    "\5\0\21\32\1\u010f\6\32\2\0\1\32\4\0\1\u0110"+
    "\21\0\3\32\5\0\4\32\1\u0111\23\32\2\0\1\32"+
    "\42\0\1\u0112\54\0\3\32\5\0\20\32\1\u0113\7\32"+
    "\2\0\1\32\26\0\3\32\5\0\16\32\1\u0114\11\32"+
    "\2\0\1\32\26\0\3\32\5\0\22\32\1\u0115\5\32"+
    "\2\0\1\32\26\0\3\32\5\0\10\32\1\u0116\17\32"+
    "\2\0\1\32\3\0\1\u0117\22\0\3\32\5\0\14\32"+
    "\1\u0118\13\32\2\0\1\32\52\0\1\u0119\44\0\3\32"+
    "\5\0\25\32\1\u011a\2\32\2\0\1\32\26\0\3\32"+
    "\5\0\3\32\1\u011b\24\32\2\0\1\32\26\0\3\32"+
    "\5\0\14\32\1\u011c\13\32\2\0\1\32\26\0\3\32"+
    "\5\0\22\32\1\u011d\5\32\2\0\1\32\26\0\3\32"+
    "\5\0\12\32\1\u011e\15\32\2\0\1\32\26\0\3\32"+
    "\5\0\4\32\1\u011f\23\32\2\0\1\32\50\0\1\u0120"+
    "\74\0\1\u0121\74\0\1\u0122\70\0\1\u0123\52\0\1\u0124"+
    "\74\0\1\u0125\25\0\1\u0125\53\0\1\u0126\15\0\1\u0126"+
    "\46\0\1\u0127\43\0\3\32\5\0\21\32\1\u0128\6\32"+
    "\2\0\1\32\4\0\1\u0129\52\0\1\u0129\15\0\1\u0129"+
    "\21\0\3\32\5\0\3\32\1\u012a\24\32\2\0\1\32"+
    "\26\0\3\32\5\0\20\32\1\u012b\7\32\2\0\1\32"+
    "\26\0\3\32\5\0\4\32\1\u012c\23\32\2\0\1\32"+
    "\26\0\3\32\5\0\2\32\1\u012d\25\32\2\0\1\32"+
    "\40\0\1\u012e\56\0\3\32\5\0\21\32\1\u012f\6\32"+
    "\2\0\1\32\4\0\1\u0130\52\0\1\u0130\15\0\1\u0130"+
    "\21\0\3\32\5\0\10\32\1\u0131\17\32\2\0\1\32"+
    "\3\0\1\u0132\22\0\3\32\5\0\23\32\1\u0133\4\32"+
    "\2\0\1\32\56\0\1\u0134\54\0\1\u0135\65\0\1\u0136"+
    "\72\0\1\u0137\55\0\3\32\5\0\4\32\1\u0138\23\32"+
    "\2\0\1\32\26\0\3\32\5\0\21\32\1\u0139\6\32"+
    "\2\0\1\32\4\0\1\u013a\52\0\1\u013a\15\0\1\u013a"+
    "\21\0\3\32\5\0\20\32\1\u013b\7\32\2\0\1\32"+
    "\42\0\1\u013c\107\0\1\u013d\35\0\3\32\5\0\22\32"+
    "\1\u013e\5\32\2\0\1\32\26\0\3\32\5\0\4\32"+
    "\1\u013f\23\32\2\0\1\32\42\0\1\u0140\54\0\3\32"+
    "\5\0\4\32\1\u0141\23\32\2\0\1\32\60\0\1\u0142"+
    "\70\0\1\u0143\52\0\1\u0144\33\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[13338];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\1\11\2\1\2\11"+
    "\1\1\1\11\40\1\1\11\3\1\2\0\1\11\1\1"+
    "\1\11\1\0\1\11\1\1\6\0\2\11\1\1\1\11"+
    "\35\1\1\0\3\1\1\0\3\1\1\0\1\11\1\1"+
    "\5\11\7\0\3\1\3\0\1\1\1\11\5\1\1\0"+
    "\3\1\1\0\16\1\1\0\2\1\1\0\6\1\1\0"+
    "\3\1\1\11\3\1\1\0\1\1\1\0\1\1\2\0"+
    "\1\11\3\0\1\1\1\11\3\0\1\11\4\1\1\11"+
    "\2\1\1\11\10\1\1\0\2\1\1\0\3\1\1\11"+
    "\2\1\1\0\5\1\1\0\4\1\1\0\1\1\3\11"+
    "\7\0\2\1\1\0\7\1\1\0\2\1\1\11\3\1"+
    "\1\11\5\1\1\0\3\1\1\11\7\0\1\1\1\0"+
    "\1\1\1\11\4\1\1\0\1\1\1\0\6\1\1\11"+
    "\2\0\2\11\1\0\1\11\1\0\1\1\1\11\4\1"+
    "\1\11\1\1\1\11\1\1\1\0\1\1\1\0\1\11"+
    "\1\0\1\11\2\1\1\0\1\1\2\0\2\1\1\11"+
    "\1\1\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[324];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  public _RexxLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _RexxLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 90: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 91: break;
          case 3:
            { return TERMINATOR;
            }
          // fall through
          case 92: break;
          case 4:
            { return EXCLAMATION;
            }
          // fall through
          case 93: break;
          case 5:
            { return OPERATOR_REMAINDER;
            }
          // fall through
          case 94: break;
          case 6:
            { return OPERATOR_BITWISE_AND;
            }
          // fall through
          case 95: break;
          case 7:
            { return TOKEN_LEFT;
            }
          // fall through
          case 96: break;
          case 8:
            { return TOKEN_RIGHT;
            }
          // fall through
          case 97: break;
          case 9:
            { return OPERATOR_MULTIPLY;
            }
          // fall through
          case 98: break;
          case 10:
            { return OPERATOR_PLUS;
            }
          // fall through
          case 99: break;
          case 11:
            { return COMMA;
            }
          // fall through
          case 100: break;
          case 12:
            { return OPERATOR_SUBTRACT;
            }
          // fall through
          case 101: break;
          case 13:
            { return DOT;
            }
          // fall through
          case 102: break;
          case 14:
            { return OPERATOR_DIVIDE;
            }
          // fall through
          case 103: break;
          case 15:
            { return NUMBER_INT;
            }
          // fall through
          case 104: break;
          case 16:
            { return COLON;
            }
          // fall through
          case 105: break;
          case 17:
            { return OPERATOR_LESSTHAN;
            }
          // fall through
          case 106: break;
          case 18:
            { return OPERATOR_EQUAL;
            }
          // fall through
          case 107: break;
          case 19:
            { return OPERATOR_GREATERTHAN;
            }
          // fall through
          case 108: break;
          case 20:
            { return IDENTIFIER;
            }
          // fall through
          case 109: break;
          case 21:
            { return OPERATOR_OR;
            }
          // fall through
          case 110: break;
          case 22:
            { return TILDE;
            }
          // fall through
          case 111: break;
          case 23:
            { return STRING;
            }
          // fall through
          case 112: break;
          case 24:
            { return SHEBANG;
            }
          // fall through
          case 113: break;
          case 25:
            { return OPERATOR_AND;
            }
          // fall through
          case 114: break;
          case 26:
            { return OPERATOR_POWER;
            }
          // fall through
          case 115: break;
          case 27:
            { return LINE_COMMENT;
            }
          // fall through
          case 116: break;
          case 28:
            { return OPERATOR_NOT_EQUAL;
            }
          // fall through
          case 117: break;
          case 29:
            { return OPERATOR_LESSTHAN_EQUAL;
            }
          // fall through
          case 118: break;
          case 30:
            { return OPERATOR_STRICT_EQUAL;
            }
          // fall through
          case 119: break;
          case 31:
            { return OPERATOR_GREATERTHAN_EQUAL;
            }
          // fall through
          case 120: break;
          case 32:
            { return KEYWORD_DO;
            }
          // fall through
          case 121: break;
          case 33:
            { return KEYWORD_IF;
            }
          // fall through
          case 122: break;
          case 34:
            { return OPERATOR_BACKSLASH_LESSTHAN;
            }
          // fall through
          case 123: break;
          case 35:
            { return OPERATOR_BACKSLASH_GREATERTHAN;
            }
          // fall through
          case 124: break;
          case 36:
            { return OPERATOR_BACKSLASH;
            }
          // fall through
          case 125: break;
          case 37:
            { return OPERATOR_XOR;
            }
          // fall through
          case 126: break;
          case 38:
            { return OPERATOR_CONCATENATE;
            }
          // fall through
          case 127: break;
          case 39:
            { return NUMBER_DECIMAL;
            }
          // fall through
          case 128: break;
          case 40:
            { return NUMBER_BINARY;
            }
          // fall through
          case 129: break;
          case 41:
            { return NUMBER_HEXADECIMAL;
            }
          // fall through
          case 130: break;
          case 42:
            { return OPERATOR_STRICT_LESSTHAN;
            }
          // fall through
          case 131: break;
          case 43:
            { return OPERATOR_STRICT_GREATERTHAN_EQUAL;
            }
          // fall through
          case 132: break;
          case 44:
            { return KEYWORD_ARG;
            }
          // fall through
          case 133: break;
          case 45:
            { return KEYWORD_END;
            }
          // fall through
          case 134: break;
          case 46:
            { return KEYWORD_NOP;
            }
          // fall through
          case 135: break;
          case 47:
            { return KEYWORD_SAY;
            }
          // fall through
          case 136: break;
          case 48:
            { return KEYWORD_USE;
            }
          // fall through
          case 137: break;
          case 49:
            { return KEYWORD_VAR;
            }
          // fall through
          case 138: break;
          case 50:
            { return OPERATOR_STRICT_BACKSLASH_EQUAL;
            }
          // fall through
          case 139: break;
          case 51:
            { return NUMBER_SCIENTIFIC;
            }
          // fall through
          case 140: break;
          case 52:
            { return MULTILINE_COMMENT;
            }
          // fall through
          case 141: break;
          case 53:
            { return OPERATOR_STRICT_LESSTHAN_EQUAL;
            }
          // fall through
          case 142: break;
          case 54:
            { return KEYWORD_CALL;
            }
          // fall through
          case 143: break;
          case 55:
            { return KEYWORD_DROP;
            }
          // fall through
          case 144: break;
          case 56:
            { return KEYWORD_ELSE;
            }
          // fall through
          case 145: break;
          case 57:
            { return KEYWORD_EXIT;
            }
          // fall through
          case 146: break;
          case 58:
            { return KEYWORD_LOOP;
            }
          // fall through
          case 147: break;
          case 59:
            { return KEYWORD_PULL;
            }
          // fall through
          case 148: break;
          case 60:
            { return KEYWORD_PUSH;
            }
          // fall through
          case 149: break;
          case 61:
            { return KEYWORD_THEN;
            }
          // fall through
          case 150: break;
          case 62:
            { return KEYWORD_WITH;
            }
          // fall through
          case 151: break;
          case 63:
            { return OPERATOR_STRICT_BACKSLASH_LESSTHAN;
            }
          // fall through
          case 152: break;
          case 64:
            { return OPERATOR_STRICT_BACKSLASH_GREATERTHAN;
            }
          // fall through
          case 153: break;
          case 65:
            { return KEYWORD_GUARD;
            }
          // fall through
          case 154: break;
          case 66:
            { return KEYWORD_LEAVE;
            }
          // fall through
          case 155: break;
          case 67:
            { return KEYWORD_PARSE;
            }
          // fall through
          case 156: break;
          case 68:
            { return KEYWORD_QUEUE;
            }
          // fall through
          case 157: break;
          case 69:
            { return KEYWORD_RAISE;
            }
          // fall through
          case 158: break;
          case 70:
            { return KEYWORD_REPLY;
            }
          // fall through
          case 159: break;
          case 71:
            { return KEYWORD_TRACE;
            }
          // fall through
          case 160: break;
          case 72:
            { return KEYWORD_VALUE;
            }
          // fall through
          case 161: break;
          case 73:
            { return KEYWORD_WHILE;
            }
          // fall through
          case 162: break;
          case 74:
            { return KEYWORD_EXPOSE;
            }
          // fall through
          case 163: break;
          case 75:
            { return KEYWORD_RETURN;
            }
          // fall through
          case 164: break;
          case 76:
            { return KEYWORD_SELECT;
            }
          // fall through
          case 165: break;
          case 77:
            { return KEYWORD_SIGNAL;
            }
          // fall through
          case 166: break;
          case 78:
            { return KEYWORD_SOURCE;
            }
          // fall through
          case 167: break;
          case 79:
            { return KEYWORD_CLASS;
            }
          // fall through
          case 168: break;
          case 80:
            { return KEYWORD_ADDRESS;
            }
          // fall through
          case 169: break;
          case 81:
            { return KEYWORD_FORWARD;
            }
          // fall through
          case 170: break;
          case 82:
            { return KEYWORD_ITERATE;
            }
          // fall through
          case 171: break;
          case 83:
            { return KEYWORD_NUMERIC;
            }
          // fall through
          case 172: break;
          case 84:
            { return KEYWORD_OPTIONS;
            }
          // fall through
          case 173: break;
          case 85:
            { return KEYWORD_METHOD;
            }
          // fall through
          case 174: break;
          case 86:
            { return KEYWORD_INTERPRET;
            }
          // fall through
          case 175: break;
          case 87:
            { return KEYWORD_OTHERWISE;
            }
          // fall through
          case 176: break;
          case 88:
            { return KEYWORD_PROCEDURE;
            }
          // fall through
          case 177: break;
          case 89:
            { return KEYWORD_ATTRIBUTE;
            }
          // fall through
          case 178: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
