%% Afirmación del predicados llamada accion
%% Afirmacion de evento: 00,01,10,11
%% Afirmacion de estado: goNorte / goEste / waitEste / waitEste
%% Afirmacion de estado siguiente: goNorte / goEste / waitEste / waitEste

accion(00,goNorte,goNorte).
accion(01,goNorte,waitNorte).
accion(10,goNorte,goNorte).
accion(11,goNorte,waitNorte).

accion(00,waitNorte,goEste).
accion(01,waitNorte,goEste).
accion(10,waitNorte,goEste).
accion(11,waitNorte,goEste).

accion(00,goEste,goEste).
accion(01,goEste,goEste).
accion(10,goEste,waitEste).
accion(11,goEste,waitEste).

accion(00,waitEste,goNorte).
accion(01,waitEste,goNorte).
accion(10,waitEste,goNorte).
accion(11,waitEste,goNorte).

%% Afirmación del regña llamada eventos
eventos(estadoI,[eI|eF]):-
    accion(eI,estadoI,Z),write(Z),nl,eventos(Z,eF).