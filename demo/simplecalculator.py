# Auto generated file by GOLD Parser Builder

#---- Symbols ---------------------------------------------------------------

# (EOF)
SYMBOL_EOF             = 0 
# (Error)
SYMBOL_ERROR           = 1 
# (Whitespace)
SYMBOL_WHITESPACE      = 2 
# '-'
SYMBOL_MINUS           = 3 
# '('
SYMBOL_LPARAN          = 4 
# ')'
SYMBOL_RPARAN          = 5 
# '*'
SYMBOL_TIMES           = 6 
# ','
SYMBOL_COMMA           = 7 
# '.'
SYMBOL_DOT             = 8 
# '/'
SYMBOL_DIV             = 9 
# '['
SYMBOL_LBRACKET        = 10
# ']'
SYMBOL_RBRACKET        = 11
# '^'
SYMBOL_CARET           = 12
# '+'
SYMBOL_PLUS            = 13
# identifier
SYMBOL_IDENTIFIER      = 14
# number
SYMBOL_NUMBER          = 15
# <expression>
SYMBOL_EXPRESSION      = 16
# <expression_add>
SYMBOL_EXPRESSION_ADD  = 17
# <expression_list>
SYMBOL_EXPRESSION_LIST = 18
# <expression_mul>
SYMBOL_EXPRESSION_MUL  = 19
# <expression_neg>
SYMBOL_EXPRESSION_NEG  = 20
# <expression_pow>
SYMBOL_EXPRESSION_POW  = 21
# <l_value>
SYMBOL_L_VALUE         = 22
# <meat_item>
SYMBOL_MEAT_ITEM       = 23
# <opt_meat>
SYMBOL_OPT_MEAT        = 24
# <r_value>
SYMBOL_R_VALUE         = 25

#---- Rules -----------------------------------------------------------------

# <opt_meat> ::= <meat_item>
RULE_OPT_MEAT                             = 0 
# <opt_meat> ::= 
RULE_OPT_MEAT2                            = 1 
# <meat_item> ::= <expression>
RULE_MEAT_ITEM                            = 2 
# <expression_list> ::= <expression_list> ',' <expression>
RULE_EXPRESSION_LIST_COMMA                = 3 
# <expression_list> ::= <expression>
RULE_EXPRESSION_LIST                      = 4 
# <expression> ::= <expression_add>
RULE_EXPRESSION                           = 5 
# <expression_add> ::= <expression_add> '+' <expression_mul>
RULE_EXPRESSION_ADD_PLUS                  = 6 
# <expression_add> ::= <expression_add> '-' <expression_mul>
RULE_EXPRESSION_ADD_MINUS                 = 7 
# <expression_add> ::= <expression_mul>
RULE_EXPRESSION_ADD                       = 8 
# <expression_mul> ::= <expression_mul> '*' <expression_pow>
RULE_EXPRESSION_MUL_TIMES                 = 9 
# <expression_mul> ::= <expression_mul> '/' <expression_pow>
RULE_EXPRESSION_MUL_DIV                   = 10
# <expression_mul> ::= <expression_pow>
RULE_EXPRESSION_MUL                       = 11
# <expression_pow> ::= <expression_pow> '^' <expression_neg>
RULE_EXPRESSION_POW_CARET                 = 12
# <expression_pow> ::= <expression_neg>
RULE_EXPRESSION_POW                       = 13
# <expression_neg> ::= '-' <expression_neg>
RULE_EXPRESSION_NEG_MINUS                 = 14
# <expression_neg> ::= <r_value>
RULE_EXPRESSION_NEG                       = 15
# <r_value> ::= '(' <expression> ')'
RULE_R_VALUE_LPARAN_RPARAN                = 16
# <r_value> ::= <l_value>
RULE_R_VALUE                              = 17
# <r_value> ::= number
RULE_R_VALUE_NUMBER                       = 18
# <l_value> ::= identifier
RULE_L_VALUE_IDENTIFIER                   = 19
# <l_value> ::= identifier '(' ')'
RULE_L_VALUE_IDENTIFIER_LPARAN_RPARAN     = 20
# <l_value> ::= identifier '(' <expression_list> ')'
RULE_L_VALUE_IDENTIFIER_LPARAN_RPARAN2    = 21
# <l_value> ::= identifier '[' <expression> ']'
RULE_L_VALUE_IDENTIFIER_LBRACKET_RBRACKET = 22
# <l_value> ::= identifier '.' <l_value>
RULE_L_VALUE_IDENTIFIER_DOT               = 23
