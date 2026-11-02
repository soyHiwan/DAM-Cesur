# TAREA 02: USO DE ESTRUCTURAS DE CONTROL EN JAVA

**Enunciado:**  
Como programador, debes ser capaz de crear algoritmos eficientes y efectivos que se puedan traducir al lenguaje en el que te encuentres programando. Estos deben adaptarse a las capacidades de la computadora y resolver el problema de manera clara y estructurada. Conocer el ámbito de las variables dentro de un programa y el flujo que siguen los datos será un aspecto fundamental en todo el proceso.

Dado el siguiente diagrama de flujo:

1.  Traduce a Java creando el código apropiado en una clase que contenga un método main con el IDE Eclipse.

2.  Razona y explica de la forma más completa, clara y ordenada posible las respuestas a las siguientes preguntas en un documento Word o similar:

    1.  ¿Cuál es el ámbito y en que partes del código se pueden utilizar cada una de las variables ‘dato’, ‘dato2’ y ‘dato3’?

    2.  ¿Cuál es el comportamiento de cada una de las 3 estructuras de repetición que aparecen en el diagrama?

    3.  ¿Cuál es el flujo que siguen los datos?

    4.  ¿Qué valores van tomando las variables durante la ejecución?

![Diagrama Descripción generada automáticamente](PRO_UD2/media/image1.png)

**La resolución del documento también se puede ver en git:**  
- **Git general:** https://github.com/soyHiwan/DAM-Cesur

\- **Tarea:** https://github.com/soyHiwan/DAM-Cesur/blob/main/PRO/02-tarea.md

\- **Codigo 01**: https://github.com/soyHiwan/DAM-Cesur/blob/main/PRO/02-Tarea/src/Tarea02.java

\- **Código 02**: https://github.com/soyHiwan/DAM-Cesur/blob/main/PRO/02-Tarea/src/Tarea02Propuesta.java

**1. Traduce a Java creando el código apropiado en una clase que contenga un método main con el IDE Eclipse.**

Se ha realizado el código según se indica el diagrama de flujo establecido en el enunciado *(File Tarea02)*:

``` java
public class Tarea02 {
    public static void main(String[] args) {
        int dato = 2;
        while (dato < 100) {
            int dato2 = 1;
            while (dato2 < dato) {
                int dato3 = dato2;
                System.out.println("dato2 = " + dato2);
                System.out.println("dato3 inicial = " + dato3);
                if (dato3 < dato) {
                    dato3 = dato3+1;
                    System.out.println("dato3 actualizado = " + dato3);
                }
            }
            // dato3 está fuera de su ámbito
            dato = dato * dato2;
        }
        // dato2 y dato3 están fuera de su ámbito
        System.out.println("Fin del algoritmo. Valor final:");
        System.out.println("dato = " + dato);
    }
}
```

Tras mostrar el resultado por consola y ver que se queda en un bucle infinito, hemos revisado varias veces el código y el diagrama y hemos detectado que o hay una posible errata en el diagrama o es intencionado, pero tal como se muestra el diagrama el valor de dato2 no cambia siempre es 1, por lo que no saldrá nunca del bucle.  
  
Para la resolución del enunciado y responder adecuadamente a las preguntas consideraremos que la **creación de este bucle infinito es intencionado**.  
  
A continuación, mostramos la actividad del código, aquello que está en rojo es que la instrucción no se ha ejecutado, mientras que el verde sí se ha ejecutado y en amarillo es el código con condición pendiente de recorrer.

``` java
public class Tarea02 {
    public static void main(String[] args) {
        int dato = 2;
        while (dato < 100) {
            int dato2 = 1;
            while (dato2 < dato) {
                int dato3 = dato2;
                System.out.println("dato2 = " + dato2);
                System.out.println("dato3 inicial = " + dato3);
                if (dato3 < dato) {
                    dato3 = dato3 + 1;
                    System.out.println("dato3 actualizado = " + dato3);
                }
            }
            // dato3 está fuera de su ámbito
            dato = dato * dato2;
        }
        // dato2 y dato3 están fuera de su ámbito
        System.out.println("Fin del algoritmo. Valor final:");
        System.out.println("dato = " + dato);
    }
}
```

Captura de eclipse con la muestra de la consola en bucle infinito.  
  
![](PRO_UD2/media/image2.png)

En la consola de eclipse podemos ver que el valor de dato2 siempre es 1, por lo que siempre se cumple la condición de *while(dato2\<dato)*, como consecuencia nunca sale de ese while y se crea un bucle infinito.

**2. Razona y explica de la forma más completa, clara y ordenada posible las respuestas a las siguientes preguntas en un documento Word o similar:**

**2.a. ¿Cuál es el ámbito y en que partes del código se pueden utilizar cada una de las variables ‘dato’, ‘dato2’ y ‘dato3’?**

| **variable** | **ámbito**                                                                                                                                                                                                                           |
|--------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **dato**     | En **todo main**, ya que declara al principio del todo como *int dato =2*                                                                                                                                                            |
| **dato2**    | Solo dentro del ***while (dato \< 100)*,** donde se declara *como int dato2 = 1*. En el código hemos añadido un comentario marcando partir de que “}” ya no tienen ámbito *(línea 35:* *// dato2 y dato3 están fuera de su ámbito )* |
| **dato3**    | Solo dentro del *while (dato2 \< dato)*, donde se declara *como int dato3 = dato2*. En el código hemos añadido un comentario marcando partir de que “}” ya no tienen ámbito *(línea 29: // dato3 está fuera de su ámbito)*           |

**2.b. ¿Cuál es el comportamiento de cada una de las 3 estructuras de repetición que aparecen en el diagrama?**

**Estructura según el diagrama:  
**

<table>
<colgroup>
<col style="width: 100%" />
</colgroup>
<thead>
<tr class="header">
<th><p>dato &lt; 100 → while</p>
<p>dato2 &lt; dato → while</p>
<p>dato3 &lt; dato → if</p>
<p>dato3 ← dato3+1 → dato3 = dato3 + 1;</p>
<p>dato ← dato*dato2 → dato = dato * dato2;</p></th>
</tr>
</thead>
<tbody>
</tbody>
</table>

**En el diagrama que hemos trabajado:**

- **while (dato \< 100):** repite su contenido mientras dato sea menor que 100. Dentro se inicializa dato2 y, después del bucle interior, se encuentra la multiplicación.

- **while (dato2 \< dato):** repite su contenido mientras dato2 sea menor que dato. Como empiezan valiendo 1 y 2, y no cambian dentro de este bucle, se repite indefinidamente.

- **if (dato3 \< dato):** comprueba si dato3 es menor que dato y, si lo es, lo incrementa en uno. Después vuelve al control del bucle interior.

*En el enunciado habla de tres estructuras de repetición, pero el diagrama contiene dos bucles y un condicional. El if no repite por sí mismo; se ejecuta de nuevo porque está dentro de un while.*

**2.c. ¿Cuál es el flujo que siguen los datos?**

**El flujo es:**

1.  Se asigna 2 a dato y se comprueba dato \< 100.

2.  Como es verdadero, se inicializa dato2 en 1.

3.  Se comprueba dato2 \< dato, que también es verdadero.

4.  Se copia el valor de dato2 en dato3.

5.  Como dato3 \< dato, se incrementa dato3 de 1 a 2.

6.  Se vuelve a comprobar dato2 \< dato. Al mantenerse 1 \< 2, se repite el bucle interior, reinicializando dato3 en cada vuelta. Nunca se alcanza la multiplicación ni el final.

**2.d. ¿Qué valores van tomando las variables durante la ejecución?**

<table>
<colgroup>
<col style="width: 13%" />
<col style="width: 8%" />
<col style="width: 78%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Variable</strong></th>
<th><strong>Valor</strong></th>
<th><strong>Comportamiento</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>dato</strong></td>
<td>2</td>
<td>Permanece en 2 porque nunca se alcanza la multiplicación que podría modificarlo.</td>
</tr>
<tr class="even">
<td><strong>dato2</strong></td>
<td>1</td>
<td>Permanece en 1 porque no hay ninguna instrucción que cambie su valor.</td>
</tr>
<tr class="odd">
<td><strong>dato3</strong></td>
<td>1 y 2</td>
<td>1 ( <em>dato3 = dato2</em> ) cuando entra en while(dato2&lt;dato),<br />
2 cuando entra en <em>if(dato3&lt;dato)</em>, al no cambiar el valor de dato2, el valor de dato3 inicial no cambia, siempre es 1, ya que depende del valor de dato2.</td>
</tr>
</tbody>
</table>

| **Momento**                      | **Vuelta 1** | **Vuelta 2** | **Vuelta 3** |
|----------------------------------|--------------|--------------|--------------|
| **dato**                         | 2            | 2            | 2            |
| **dato2**                        | 1            | 1            | 1            |
| **dato3 al inicializarse**       | 1            | 1            | 1            |
| **dato3 después del incremento** | 2            | 2            | 2            |

## **3. Propuesta de modificación para que el algoritmo finalice:**

Si se trata de una errata y se pretende que el algoritmo termine, proponemos modificar el código para que el valor de dato2 cambie en cada vuelta del bucle interior.

``` java
public class Tarea02Propuesta {
    public static void main(String[] args) {
        int dato = 2;
        while (dato < 100) {
            int dato2 = 1;
            while (dato2 < dato) {
                int dato3 = dato2;
                System.out.println("dato2 = " + dato2);
                System.out.println("dato3 inicial = " + dato3);
                if (dato3 < dato) {
                    dato3 = dato3+1;
                    System.out.println("dato3 actualizado = " + dato3);
                }
                dato2 = dato2 +1; // Modificación propuesta
            }
            // dato3 está fuera de su ámbito
            dato = dato * dato2;
        }
        // dato2 y dato3 están fuera de su ámbito
        System.out.println("Fin del algoritmo. Valor final:");
        System.out.println("dato = " + dato);
    }
}
```

**El recorrido de los valores de datoX es:**

dato2 = 1

dato3 inicial = 1

dato3 actualizado = 2

dato2 = 1

dato3 inicial = 1

dato3 actualizado = 2

dato2 = 2

dato3 inicial = 2

dato3 actualizado = 3

dato2 = 3

dato3 inicial = 3

dato3 actualizado = 4

dato2 = 1

dato3 inicial = 1

dato3 actualizado = 2

dato2 = 2

dato3 inicial = 2

dato3 actualizado = 3

dato2 = 3

dato3 inicial = 3

dato3 actualizado = 4

dato2 = 4

dato3 inicial = 4

dato3 actualizado = 5

dato2 = 5

dato3 inicial = 5

dato3 actualizado = 6

dato2 = 6

dato3 inicial = 6

dato3 actualizado = 7

dato2 = 7

dato3 inicial = 7

dato3 actualizado = 8

dato2 = 8

dato3 inicial = 8

dato3 actualizado = 9

dato2 = 9

dato3 inicial = 9

dato3 actualizado = 10

dato2 = 10

dato3 inicial = 10

dato3 actualizado = 11

dato2 = 11

dato3 inicial = 11

dato3 actualizado = 12

dato2 = 12

dato3 inicial = 12

dato3 actualizado = 13

dato2 = 13

dato3 inicial = 13

dato3 actualizado = 14

dato2 = 14

dato3 inicial = 14

dato3 actualizado = 15

dato2 = 15

dato3 inicial = 15

dato3 actualizado = 16

Fin del algoritmo. Valor final:

dato = 256

**Comportamiento de las variables:**

| **Vuelta del bucle exterior** | **dato inicial** | **dato2 al salir del interior** | **dato tras multiplicar** |
|-------------------------------|------------------|---------------------------------|---------------------------|
| 1                             | 2                | 2                               | 4                         |
| 2                             | 4                | 4                               | 16                        |
| 3                             | 16               | 16                              | 256                       |

**Nuevo Diagrama:**

![Diagrama corregido con incremento de dato2](PRO_UD2/media/image3.png)

**Mis primeras experiencias con java:**

- Inicialmente utilizamos if en todas las condiciones. Tras revisar las flechas del diagrama, comprendimos que algunas instrucciones debían repetirse y sustituimos los dos primeros condicionales por bucles while.

- Añadimos comentarios para señalar los puntos a partir de los cuales las variables quedan fuera de su ámbito.

- Utilizamos ChatGPT como apoyo para comprender algunos errores. Por ejemplo, intentamos comprobar mediante un condicional si dato3 estaba fuera de su ámbito. Aprendimos que Java detecta este problema durante la compilación y que no puede comprobarse así durante la ejecución.

- Al volver a abrir Eclipse, el proyecto no aparecía en el espacio de trabajo seleccionado. Esto nos ayudó a comprender la diferencia entre el espacio de trabajo, la carpeta del proyecto y los archivos fuente .java.

## Bibliografía y recursos consultados

- CESUR. Material didáctico de la Unidad 2 de Programación y enunciado de la tarea «Uso de estructuras de control en Java».

- Eclipse Foundation. Eclipse IDE Documentation. https://help.eclipse.org/

- OpenAI. ChatGPT. Utilizado como apoyo para comprender errores, revisar el código y las explicaciones, y elaborar el diagrama de flujo modificado. https://chatgpt.com/
