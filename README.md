===>EN ESTE DOCUMENTO ESTA LAS PLANTILLAS PARA LOS CASOS DE PRUEBA  DE CADA EJERCICIO <===


PLANTILLA ejercicio1 signo
Empezamos con el valor de 1 y sumamos 1 por cada else if
en este caso la complejidad sinclomatica aproximada es de =1+2=3

**ID       |     Descripción       |      Entrada      |       Esperado      |      Estado     |
TC01     |  si signo es positivo |       5           |          1          |        ok       |
         |   devuelve (1)        |                   |                     |                 |
_________|_______________________|___________________|_____________________|_________________|
TC02     |  si signo es negativo |       -3          |         -1          |        ok       |
         |   devuelve (-1)       |                   |                     |                 |
_________|_______________________|___________________|_____________________|_________________|
TC03     | si signo es negativo  |        0          |         0           |        ok       |
         |   devuelve (0)        |                   |                     |                 |
______________________________________________________________________________________________**



PLANTILLA EJERCICIO2 clasificar edad
Empezamos con el valor de 0 y sumamos 1 cada if & else if en este caso la complejidad 
sinclomatica que tiene este metodo es de 7, 1 if para exepcion + 5 else if + 1 else if del final,
en este caso son minimo 7 test uno por cada rama mas la exepcion

**ID       |     Descripción       |      Entrada      |       Esperado          |      Estado    |       
TC01     |  edad negativa        |       -1          |IllegalArgumentExeption  |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC02     |infacia limite inferior|        0          |         infancia        |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC03     |     infancia          |        5          |         infancia        |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC04     |    Niñez limite       |        6          |           Niñez         |      ok        |
_________|_______________________|___________________|_________________________|________________|
TC05     |       Niñez           |        11         |           Niñez         |      ok        |
_________|_______________________|___________________|_________________________|________________|
TC06     |  adolescencia limite  |       12          |      adolescencia       |         ok     |
_________|_______________________|___________________|_________________________|________________|
TC07     |    juventud limite    |       18          |       juventud          |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC08     |   adultez limite      |       25          |       adultez           |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC09     |       vejez           |       60          |         vejez           |       ok       |**


PLANTILLA EJERCICIO3 contar positivos
la complejidad cinclomatica en este caso es de 3,1condicion del for +1 del if +1=3

**ID       |     Descripción       |      Entrada      |       Esperado          |      Estado    | 
TC01     |     Array vacio       |       {}          |          0              |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC02     |ArrayConTodosnega/cero | {-5,0,-1}         |         0               |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC03     |ArrayConMezcla         | {-2,3,0,7,-1}     |         2               |       ok       |
_________|_______________________|___________________|_________________________|________________|**


PLANTILLA EJERCICIO4 calificacion
este caso cuenta con una complejidad sinclomatica de 6,1 if y 5 alternativas de los switch=6

**ID       |     Descripción       |      Entrada      |       Esperado          |      Estado    |       
TC01     |  Nota invalida        |       -1          |IllegalArgumentExeption  |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC02     |        Suspenso       |        3          |         "SUSPENSO"      |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC03     |     Suficiente        |        5          |         "SUFICIENTE"    |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC04     |    Bien               |        6          |          "BIEN"         |      ok        |
_________|_______________________|___________________|_________________________|________________|
TC05     |       Notable         |        7          |           "NOTABLE"     |      ok        |
_________|_______________________|___________________|_________________________|________________|
TC06     |  Sobresaliente        |       10          |      "SOBRESALIENTE"    |         ok     |
_________|_______________________|___________________|_________________________|________________|**


PLANTILLA EJERCICIO5 esBisiesto
la complejidad cinclomatica es de=3+1=4,2 if el return y le sumo 1 mas


**ID       |     Descripción     |      Entrada      |       Esperado          |      Estado    |       
TC01     |  divisible por 400    |       2000        |          true           |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC02     | divisiblePor100X400no |        1900       |         false           |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC03     |divisibleX4peroNoX100  |        2024       |         true            |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC04     | no divisible por 4    |       2023        |          false          |      ok        |
_________|_______________________|___________________|_________________________|________________|**

PLANTILLA EJERCICIO6 piedra-papel-tijera
la complejidad cinclomatica es de 4 

**ID     |     Descripción       |   Entrada(J1,J2)  |       Esperado          |      Estado    |       
TC01     |  jugada invalida      |  "PIEDRA","ROCK"  |  IllegalArgumentExeption|       ok       |
_________|_______________________|___________________|_________________________|________________|
TC02     | empate                | "PAPEL","PAPEL"   |         "EMPATE"        |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC03     |gana J1(piedra>tijera) | "PIEDRA","TIJERA" |    "GANAJ1"             |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC04     | gana J2(tijera>papel) |"PAPEL","TIJERA"   |        "GANAJ2"         |      ok        |
_________|_______________________|___________________|_________________________|________________|**


EJERCICIO 7 PASSWORD
hay 5 puntos de decision (if para cada caso)
no hay bucles
la complejidad simclomatica es de 5+1=6
se necesitan minimo 6 test para cubrir todas las ramas 

**ID     |     Descripción       |      Entrada      |       Esperado          |      Estado    |       
TC01     |  contraseña nula      |       null        |           0             |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC02     |contraseña vacia       |        ""         |           0             |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC03     |     Debil p(0-2)      |        "abc"      |           2             |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC04     | debil longitud corta  |   "Abc123"        |           3             |      ok        |
_________|_______________________|___________________|_________________________|________________|
TC05     |      media p(3-4)     |       "Abc123!"   |           4             |      ok        |
_________|_______________________|___________________|_________________________|________________|
TC06     |  fuerte p(5)          |  "Abc123!XY"      |           5             |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC07     |soloLongitudSuficiente | "abcdefgh"        |           2             |       ok       |
_________|_______________________|___________________|_________________________|________________|
TC08     |  mayusculas y numeros |  "Password123"    |           4             |       ok       |
_________|_______________________|___________________|_________________________|________________|**
