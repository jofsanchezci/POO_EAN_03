# Implementaciones en Java

Este repositorio contiene tres programas en Java que realizan diferentes tareas matemáticas y lógicas. A continuación, se explican el funcionamiento de cada uno de ellos.

## 1. Determinar el Cuadrante de un Punto

### Descripción
Este programa determina en qué cuadrante se encuentra un punto dado en el plano cartesiano, según sus coordenadas (𝑥, 𝑦).

### Funcionamiento
1. El programa solicita al usuario que ingrese las coordenadas `x` y `y`.
2. Utiliza condicionales para determinar en qué cuadrante se encuentra el punto:
   - Primer cuadrante: `x > 0` y `y > 0`.
   - Segundo cuadrante: `x < 0` y `y > 0`.
   - Tercer cuadrante: `x < 0` y `y < 0`.
   - Cuarto cuadrante: `x > 0` y `y < 0`.
   - En el eje Y: `x = 0` y `y != 0`.
   - En el eje X: `y = 0` y `x != 0`.
   - En el origen: `x = 0` y `y = 0`.
3. Muestra en la consola en qué cuadrante, eje o si el punto está en el origen.

### Ejecución
Compila y ejecuta el programa `Cuadrante.java`:
```
javac Cuadrante.java
java Cuadrante
```


## 2. Encontrar el Número Mayor entre Tres Números
### Descripción
Este programa lee tres números enteros del usuario y determina cuál de ellos es el mayor.

### Funcionamiento
El programa solicita al usuario que ingrese tres números enteros.
Compara los números utilizando condicionales para encontrar el mayor.
Imprime en la consola cuál de los tres números es el mayor.
### Ejecución
Compila y ejecuta el programa MayorDeTres.java:
```
javac MayorDeTres.java
java MayorDeTres
```

## 3. Determinar si la Diferencia entre Dos Números es un Divisor Exacto
### Descripción
Este programa verifica si la diferencia entre dos números enteros es un divisor exacto de alguno de los dos números.

### Funcionamiento
1. El programa solicita al usuario que ingrese dos números enteros.
2. Calcula la diferencia absoluta entre los dos números.
3. Verifica si la diferencia es un divisor exacto de alguno de los dos números usando el operador módulo (%).
4. Muestra en la consola si la diferencia es o no un divisor exacto.

### Ejecución
Compila y ejecuta el programa DiferenciaDivisor.java:
```
javac DiferenciaDivisor.java
java DiferenciaDivisor
```


