package clase03;

import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        int[] arreglito;
        arreglito = new int[]{1, 2, 3, 4, 5};

        //Acá imprimo la posición 0 del arreglo
        System.out.println(arreglito[0]);

        //Acá agrego un nuevo valor en la primera posición del arreglo y la imprimo.
        arreglito[0] = 20;
        System.out.println(arreglito[0]);

        //Acá guardo lo que estaba antes en la posición + 20.
        arreglito[0] = arreglito[0] + 20;
        System.out.println(arreglito[0]);

        //Lo mismo para otro tipo de variables.
        int num = 10;
        num = num * 3;
        System.out.println(num);


        //Que pasa si intento acceder a una posición no valida del arreglo. Error Exception in thread main java.lang.
        //System.out.println(arreglito[20]);


        //A los tipos estructurados para definir lo que tienen adentro, no se les puede pasar un tipo primitivo, solo tipos estructurados. El tipo estructurado que representa un entero es Integer.
        ArrayList<Integer> listaDeEnteros;
        listaDeEnteros = new ArrayList<>(); //Con new estoy reservando memoria para poder utilizar esa estructura.

        //Agregar elementos a la lista, 1 llamar variable, 2 . , y elegir el metodo de interactuar con la lista agregar, obtener y eliminar.
        listaDeEnteros.add(1);
        listaDeEnteros.add(2);
        listaDeEnteros.add(3);

        //Imprimir el primer elemento de la lista. Llamo a la lista, obtengo el elemento con get y le paso el índice del elemento en la lista.
        System.out.println(listaDeEnteros.get(0));

        //Método para eliminar el primer elemento de la lista. Luego imprimo el elemento que quedó en la primera posición, luego de la eliminación.
        listaDeEnteros.remove(0);
        System.out.println(listaDeEnteros.get(0));
    }
}
