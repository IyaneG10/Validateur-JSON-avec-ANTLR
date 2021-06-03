grammar json;

regle_json: element  ;

	element: GUILLEMETS CARACTERE GUILLEMETS | NOMBRE  | booleen  | type_null  | tableau  | objet  ;

		CARACTERE:  [a-zA-Z()]+  ;

		GUILLEMETS: '"';

		NOMBRE:  [+]?[-]?CHIFFRE '.'?CHIFFRE*[EXPOSANT]?[-]?CHIFFRE* ;

		CHIFFRE:[0-9];

		EXPOSANT:'E' ;

		booleen:  'true'  | 'false'    ;

		type_null:  'null'   ;

		tableau: CROCHET_OUVR element (VIRGULE_TAB element)* CROCHET_FERM    ;
			VIRGULE_TAB:','   ;
			CROCHET_OUVR: '[';
			CROCHET_FERM: ']';

		objet: ACCOL_OUVR couple_membre (',' couple_membre)* ACCOL_FERM ;
			ACCOL_OUVR: '{';
			ACCOL_FERM: '}';
			couple_membre: GUILLEMETS CARACTERE GUILLEMETS ':' element   ;


	WS: [ \t\n\r] + -> skip;
