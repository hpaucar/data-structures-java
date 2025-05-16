public class Principal {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // 1. Crear lista con elementos iniciales uno por uno
        lista.insertarFinal(2);
        lista.insertarFinal(9);
        lista.insertarFinal(8);
        lista.insertarFinal(7);
        lista.insertarFinal(9);
        lista.insertarFinal(6);
        lista.insertarFinal(0);
        lista.insertarFinal(6);

        System.out.println("Lista original:");
        lista.mostrar();

        // Otras operaciones (agregar, eliminar, actualizar...)
        lista.insertarInicio(5);
        System.out.println("Después de agregar 5 al inicio:");
        lista.mostrar();

        lista.insertarFinal(11);
        System.out.println("Después de agregar 11 al final:");
        lista.mostrar();

        lista.insertarEnPosicion(100, 3);
        System.out.println("Después de insertar 100 en posición 3:");
        lista.mostrar();

        lista.eliminarInicio();
        System.out.println("Después de eliminar el primer elemento:");
        lista.mostrar();

        lista.eliminarFinal();
        System.out.println("Después de eliminar el último elemento:");
        lista.mostrar();

        lista.eliminarEnPosicion(4);
        System.out.println("Después de eliminar en posición 4:");
        lista.mostrar();

        lista.actualizarValor(42, 2);
        System.out.println("Después de actualizar posición 2 a 42:");
        lista.mostrar();

        lista.revertir();
        System.out.println("Después de invertir la lista:");
        lista.mostrar();

        System.out.println("Tamaño final de la lista: " + lista.obtenerTamanio());
    }
}
