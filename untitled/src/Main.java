import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char salir='S';
        do{
            menuGeneral();
            System.out.println("Probar otro ejercicio? S/N");
            salir=leer.next().toUpperCase().charAt(0);
        }while(salir =='S');


    }

    public static void menuGeneral(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Seleccione una de las siguintes opciones");
        for (int i = 0; i < 13; i++) {
            System.out.println((i + 1) + "-Ejercicio " + (i + 1));
        }
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("1) Crear las variables correspondientes para leer tu nombre,apellido y edad e imprimirlos por consola en una oración.");
                System.out.print("Ingrese su nombre: ");
                String nombre = leer.next();
                System.out.print("Ingrese su edad: ");
                int edad = leer.nextInt();
                System.out.println(nombre + " tu edad es " + edad);
                break;

            case 2:
                System.out.println("2) Realizar un pequeño programa que permita ingresar 3 númerose imprimir por consola cuál es el mayor.");
                int[] vector = new int[3];
                int aux;
                System.out.println("Ingrese tres numero pueden ser distinto y desordenados");
                System.out.print("Ingrese primer numero: ");
                vector[0] = leer.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                vector[1] = leer.nextInt();
                if (vector[0] > vector[1]) {
                    aux = vector[1];
                    vector[1] = vector[0];
                    vector[0] = aux;
                }
                System.out.print("Ingrese el tercer numero: ");
                vector[2] = leer.nextInt();
                if (vector[2] < vector[1]) {
                    aux = vector[2];
                    if (vector[2] < vector[0]) {
                        vector[2] = vector[1];
                        vector[1] = vector[0];
                        vector[0] = aux;
                    } else {
                        vector[2] = vector[1];
                        vector[1] = aux;
                    }
                }

                System.out.println("Los numero ordenados son:");
                for (int i = 0; i < 3; i++) {
                    System.out.println(vector[i]);
                }
                break;

            case 3:
                System.out.println("3) Realizar un pequeño programa que permita el ingreso de un número e imprimir por consola su paridad.");
                int numeroAdivinar = 15;
                System.out.println("Adivina un numero entero entre 0 y 20 ");
                int numero = leer.nextInt();
                if (numero == numeroAdivinar) {
                    System.out.println("Lo Adivinaste");
                } else {
                    System.out.println("No lo Adivinaste");
                    System.out.println("El numero a adivinar era: "+numeroAdivinar);
                }
                break;

            case 4:
                System.out.println("4) Crear el código correspondiente que permita ingresar 2 cadenas de caracteres e imprima por consola si son iguales o no");
                System.out.print("ingrese la frase 1: ");
                String frase1 = leer.nextLine();
                System.out.print("ingrese la frase 2: ");
                String frase2 = leer.nextLine();
                if (frase1.toLowerCase().equals(frase2)) {
                    System.out.println("Las frases son iguales");
                } else {
                    System.out.println("Las frases no son iguales");
                }
                break;

            case 5:
                System.out.println("5) Realizar un pequeño programa que permita el ingreso de números, almacenarlos en una colección hasta ingresar un 0");
                ArrayList<Integer> listaNumeros = new ArrayList<>();
                int numeroIng = 0;
                do {
                    System.out.print("Ingrese un numero: ");
                    numeroIng = leer.nextInt();
                    listaNumeros.add(numeroIng);
                } while (numeroIng != 0);
                System.out.println("Los numero ingresados son");
                for (int num : listaNumeros) {
                    System.out.println(num);
                }
                break;

            case 6:
                System.out.println("6)  Crear una función que imprima un mensaje de bienvenida en la consola.");
                saludar();
                break;

            case 7:
                System.out.println("7) Crear una función que reciba un número entero y devuelva si es par o impar en forma de texto.");
                System.out.print("Ingrese un numero entero: ");
                int numP = leer.nextInt();
                boolean respuesta = pares(numP);
                if (respuesta == true) {
                    System.out.println("El numero es PAR");
                } else {
                    System.out.println("El numero es IMPAR");
                }
                break;

            case 8:
                System.out.println("8) Crear una función que reciba un número y devuelva si el mismo es primo o no.");
                System.out.print("Por favor ingrese un número entero positivo: ");
                int num = leer.nextInt();
                if (primos(num) == true) {
                    System.out.println("El numero es primo");
                } else {
                    System.out.println("El numero no es primo");
                }
                break;

            case 9:
                System.out.println("9) Crear una función que reciba una colección de números y devuelva la suma de los números impares.");
                ArrayList<Integer> lista = new ArrayList<>();
                char res = 'S';
                int sumador = 0;
                do {
                    System.out.print("Ingrese un numero: ");
                    int numeroL = leer.nextInt();
                    lista.add(numeroL);
                    if (pares(numeroL) == false) {
                        sumador += numeroL;
                    }
                    System.out.print("Quiere ingresar otro numero S/N?: ");
                    res = leer.next().toUpperCase().charAt(0);
                } while (res == 'S');

                System.out.println("el resultado es: " + sumador);
                break;

            case 10:
                System.out.println("10) Crear una función que reciba una colección de números e imprima los números pares y la suma de los números primos.");
                ArrayList<Integer> lista2 = new ArrayList<>();
                char resp = 'N';
                int sumador2 = 0;
                do {
                    System.out.print("Ingrese un numero: ");
                    int numeroL = leer.nextInt();
                    if (pares(numeroL) == true) {
                        lista2.add(numeroL);
                    }
                    if (primos(numeroL) == true) {
                        sumador2 += numeroL;
                    }
                    System.out.print("Quiere ingresar otro numero S/N?: ");
                    resp = leer.next().toUpperCase().charAt(0);
                } while (resp == 'S');

                System.out.println("La suma de los numeros primos es : " + sumador2);
                System.out.println("Los lista de los numeros pares es: ");
                for (int i = 0; i < lista2.size(); i++) {
                    System.out.println(lista2.get(i));
                }
                break;
            case 11:
                System.out.println("11) Crear una función que imprima por consola un pequeño menú con las opciones básicas de una calculadora agregando la opción 0 para salir del mismo.");
                menuCalculadora();
                break;
            case 12:
                System.out.println("12) Crear otra función que ocupe la del punto anterior para poder crear una pequeña calculadora usando switch. Tener en cuenta el caso de la división por 0.");
                calculadora();
                break;
            case 13:
                System.out.println(" 13)Crear el algoritmo necesario para poder gestionar el ingreso a un boliche. El mismo deberá contar con un pequeño menú con las siguientes opciones:");
                System.out.println("Ingreso de datos, Capacidad disponible, Dinero recaudado, Salir del sistema.");
                System.out.println("Crear las variables correspondientes para controlar la capacidad y el dinero recaudado.");
                System.out.println("Siendo la capacidad máxima de 500 personas y la entrada costar 1500 por persona y 2000 la entrada vip.");
                System.out.println("La primera opción del menú deberá tomar los datos personales del ingresante (nombre, edad, DNI y pase).");
                System.out.println("El algoritmo deberá detectar si la persona está apta para el ingreso, ya que solo se dejará pasar a los mayores de 21 años.");
                System.out.println("Verificar antes de cobrar la entrada si posee pase vip con el cual ingresará gratis o si posee pase con descuento el cual le permitirá solo abonar la mitad del valor de la entrada.");
                System.out.println(" Al momento de hacer el cobro se deberá preguntar si quiere comprar la entrada normal o vip y finalmente darle la bienvenida en caso de que todo haya salido bien, volviendo al menú principal.");
                System.out.println("Las variables correspondientes tendrán que reflejar el ingreso tanto de personas como de dinero.");

                boliche();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    //SALUDAR
    public static void saludar(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Bienvenido!!!! "+nombre);
    }
    //NUMEROS PARES

    public static Boolean pares(int num){
        boolean resultado;
        if (num%2==0){
           resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }
    //NUMEROS PRIMOS
    public static Boolean primos (int numero){
        int contador=0;
        boolean respuesta;
        for (int i = 1; i < numero; i++) {
            if(numero%i==0){
                contador +=1;
            }
        }
        if(contador>1){
            respuesta=false;
        }else{
            respuesta=true;
        }
        return respuesta;
    }
    //CALCULADORA

    public static int menuCalculadora(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese:");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicación");
        System.out.println("4-Division");
        System.out.println("0-Salir");
        int opcion = leer.nextInt();
        return opcion;

    }
    public static void calculadora(){
        Scanner leer = new Scanner(System.in);
        int numero1,numero2,opcion;

        do{
            System.out.println("Por favor ingrese dos números enteros mayores a 0");
            numero1 = leer.nextInt();
            numero2 = leer.nextInt();
        }while(numero1<1 || numero2<1);

        opcion = menuCalculadora();
        switch(opcion){
            case 0:
                break;
            case 1:
                System.out.println(numero1+" + "+numero2+" = "+(numero1+numero2));
                break;
            case 2:
                if(numero1>numero2){
                    System.out.println(numero1+" - "+numero2+" = "+(numero1-numero2));
                }else{
                    System.out.println(numero2+" - "+numero1+" = "+(numero2-numero1));
                }
                break;
            case 3:
                System.out.println(numero1+" x "+numero2+" = "+(numero1*numero2));
                break;
            case 4:
                if(numero1>numero2){
                    System.out.println(numero1+" / "+numero2+" = "+(numero1/numero2));
                }else{
                    System.out.println(numero2+" / "+numero1+" = "+(numero2/numero1));
                }
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }
    //BOLICHE

    public static void boliche() {
        Scanner leer = new Scanner(System.in);
        int capacidadMaxima = 500;
        int capacidadDisponible = capacidadMaxima;
        int dineroRecaudado = 0;

        while (true) {
            System.out.println("--- Menú del Boliche ---");
            System.out.println("1. Ingreso de datos.");
            System.out.println("2. Capacidad disponible.");
            System.out.println("3. Dinero recaudado.");
            System.out.println("4. Salir del sistema.");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("--- Ingreso de datos ---");
                    System.out.print("Nombre: ");
                    String nombre = leer.next();
                    System.out.print("Edad: ");
                    int edad = leer.nextInt();
                    System.out.print("DNI: ");
                    String dni = leer.next();
                    System.out.print("Pase (normal/vip/descuento): ");
                    String pase = leer.next();

                    if (edad < 21) {
                        System.out.println("Lo siento, solo se permite el ingreso a mayores de 21 años.");
                        break;
                    }

                    int costoEntrada = 1500;
                    if (pase.equalsIgnoreCase("vip")) {
                        costoEntrada = 0;
                    } else if (pase.equalsIgnoreCase("descuento")) {
                        costoEntrada = costoEntrada / 2;
                    }

                    System.out.println("Elija el tipo de entrada:");
                    System.out.println("1. Normal (1500 pesos).");
                    System.out.println("2. VIP (2000 pesos).");
                    System.out.print("Ingrese la opción deseada: ");
                    int tipoEntrada = leer.nextInt();

                    if (tipoEntrada == 2) {
                        costoEntrada = 2000;
                    }

                    if (capacidadDisponible > 0) {
                        capacidadDisponible--;
                        dineroRecaudado += costoEntrada;
                        System.out.println("¡Bienvenido(a), " + nombre + "! Disfruta de la noche.");
                    } else {
                        System.out.println("Lo siento, el boliche está lleno. Vuelve otro día.");
                    }
                    break;

                case 2:
                    System.out.println("Capacidad disponible: " + capacidadDisponible + " personas.");
                    break;

                case 3:
                    System.out.println("Dinero recaudado: " + dineroRecaudado + " pesos.");
                    break;

                case 4:
                    System.out.println("Saliendo del sistema.");
                    leer.close();
                    return;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }



}