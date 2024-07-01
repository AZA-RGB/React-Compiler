lexer grammar ReactLexer;

// Keywords
WS : [ \t\r\n]+ -> skip;
IF:'if';
ELSEIF:'else'WS'if';
ELSE:'else';
FOR:'for';
WHILE:'while';
SWITCH:'switch';
CASE:'case';
BREAK:'break';
CONTINUE:'continue';
DEFAULT:'default';
DO:'do';
TRY:'try';
CATCH : 'catch';
FINALLY : 'finally';
THROW:'throw';
FUNCTION : 'function';
RETURN : 'return';
//REACT:'React';
EVENT_ATTRIBUTE :
    'onclick' | 'onClick' |
    'ondblclick' | 'onDblClick' |
    'onmousedown' | 'onMouseDown' |
    'onmouseup' | 'onMouseUp' |
    'onmousemove' | 'onMouseMove' |
    'onmouseover' | 'onMouseOver' |
    'onmouseout' | 'onMouseOut' |
    'oncontextmenu' | 'onContextMenu' |
    'onkeydown' | 'onKeyDown' |
    'onkeypress' | 'onKeyPress' |
    'onkeyup' | 'onKeyUp' |
    'onsubmit' | 'onSubmit' |
    'onreset' | 'onReset' |
    'onchange' | 'onChange' |
    'oninput' | 'onInput' |
    'oninvalid' | 'onInvalid' |
    'onselect' | 'onSelect' |
    'onfocus' | 'onFocus' |
    'onblur' | 'onBlur' |
    'oncopy' | 'onCopy' |
    'oncut' | 'onCut' |
    'onpaste' | 'onPaste' |
    'ondrag' | 'onDrag' |
    'ondragend' | 'onDragEnd' |
    'ondragenter' | 'onDragEnter' |
    'ondragleave' | 'onDragLeave' |
    'ondragover' | 'onDragOver' |
    'ondragstart' | 'onDragStart' |
    'ondrop' | 'onDrop' |
    'onabort' | 'onAbort' |
    'oncanplay' | 'onCanPlay' |
    'oncanplaythrough' | 'onCanPlayThrough' |
    'ondurationchange' | 'onDurationChange' |
    'onemptied' | 'onEmptied' |
    'onended' | 'onEnded' |
    'onloadeddata' | 'onLoadedData' |
    'onloadedmetadata' | 'onLoadedMetadata' |
    'onloadstart' | 'onLoadStart' |
    'onpause' | 'onPause' |
    'onplay' | 'onPlay' |
    'onplaying' | 'onPlaying' |
    'onprogress' | 'onProgress' |
    'onratechange' | 'onRateChange' |
    'onseeked' | 'onSeeked' |
    'onseeking' | 'onSeeking' |
    'onstalled' | 'onStalled' |
    'onsuspend' | 'onSuspend' |
    'ontimeupdate' | 'onTimeUpdate' |
    'onvolumechange' | 'onVolumeChange' |
    'onwaiting' | 'onWaiting' |
    'onafterprint' | 'onAfterPrint' |
    'onbeforeprint' | 'onBeforePrint' |
    'onbeforeunload' | 'onBeforeUnload' |
    'onerror' | 'onError' |
    'onhashchange' | 'onHashChange' |
    'onload' | 'onLoad' |
    'onmessage' | 'onMessage' |
    'onoffline' | 'onOffline' |
    'ononline' | 'onOnline' |
    'onpagehide' | 'onPageHide' |
    'onpageshow' | 'onPageShow' |
    'onpopstate' | 'onPopState' |
    'onresize' | 'onResize' |
    'onstorage' | 'onStorage' |
    'onunload' | 'onUnload' |
    'ontouchstart' | 'onTouchStart' |
    'ontouchmove' | 'onTouchMove' |
    'ontouchend' | 'onTouchEnd' |
    'ontouchcancel' | 'onTouchCancel' |
    'onscroll' | 'onScroll' |
    'onwheel' | 'onWheel' |
    'ontoggle' | 'onToggle'
    ;











NEW:'new' WS;
ARROW : '=>';
EQUAL:'=';
PLUS_EQUALS: '+=';
MINUS_EQUALS: '-=';
TIMES_EQUALS: '*=';
DIVIDE_EQUALS: '/=';
MODULO_EQUALS: '%=';
PLUS_ONE: '++';
MINUS_ONE: '--';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIVIDE: '/';
MODULO: '%';
AND: '&&';
OR: '||';
NOT: '!';
EQUAL_TO: '=='|'===';
NOT_EQUAL: '!=';
GREATER_THAN: '>';
LESS_THAN: '<';
GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN_OR_EQUAL: '<=';

// Punctuation
SINGLE_LINE_COMMENT : '//' ~[\r\n]*;
COMMENT_BLOCK : ('/*' .* '*/') ;
LPAREN : '(';
RPAREN : ')';
LSBRACKET:'[';
RSBRACKET:']';
LCURLY : '{';
RCURLY : '}';
COMMA : ',';
SEMI : ';';
Integer: [0]|([1-9][0-9]*);
Float: [0-9]DOT[0-9]+;
DOT:'.';
COLON:':';
QUESITIONMARK:'?';
// Literals
//React: ('"' 'react'  '"') | ('\'' 'react'  '\'') ;
String: ('"' (~["'])*  '"') | ('\'' (~["'])*  '\'') | ('`' (~[`])*  '`');

Boolean: 'true' | 'false';
Undefined:'undefined';
Null:'null';
//dclaration operators
CONST:'const';
LET:'let';
VAR:'var';
ASYNC:'async';
AWAIT:'await';
EXPORT:'export';
IMPORT:'import';
EXPORT_DEFAULT:'export' WS 'default';
FROM:'from';
AS:'as';
//react stuff
USESTATE:'React.useState'|'useState';
USEEFFECT:'React.useEffect'|'useEffect';
CREATEELEMENT:'React.createElement'|'createElement';
USEREF:'React.useRef'|'useRef';

HTML_ATTRIBUTE_NAME: [a-zA-Z_$][a-zA-Z0-9_$-]* (~('>' | '<' | '/' |'\n'| '\\'|'.'|'('|')'|'['|']'|'{'|'}'|'='|' '|'-'|','|';'|':'|'+'|'*'|'?'))?  ;
// identifire
IDENTIFIER : [a-zA-Z_$][a-zA-Z0-9_$]* (~('>' | '<' | '/' |'\n'| '\\'|'.'|'('|')'|'['|']'|'{'|'}'|'='|' '|','|';'|':'|'+'|'-'|'*'|'?'))?;