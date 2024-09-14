public class App {
    public static void main(String[] args) throws Exception {
        byte edad = 18;
        short codigo = 1234; 
        int cantidad = 10000;
        long poblacionmundial = 800000000L;
        float precio = 19.45f; 
        double salario = 25000.30;
        int salario2 = (int) salario;
        char letra = 'A';
        String varioscaracteres = "cesar alberto cazares chavan";
        boolean estadoActivo = true; // o false 
        int numero = 10;
        double numero2 = numero; // convierte la variable anterior a decimal
        char letraA = 'A';
        int valorA = letraA;
        int valorB = '8';
        char segundaletra = (char) valorB;
        String nombre = "alberto";
        String nombreusuario = "Cesar";
        String Apellidousuario = "Cazares";
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        int x1 = 10;
        int x2 = 15;
        int suma = x1 + x2;
        int resta = x1 - x2;
        int multi = x1 * x2;
        int divi = x1 / x2;
        int modulo = x1 % x2;
        int incremento = ++x1;
        int decremento = --x2;
        String texto3 = "La presentación se llama \"Fundamentos de java\" con los conceptos para este lenguaje";
        System.out.println(texto3);
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());

        //operadores de asignación
        int a = 10;
        System.out.println(a);
        System.out.println(a += 5); //a = a + 5 asignacion de suma
        System.out.println(a -= 2); //a = a - 2 asignacion de resta
        System.out.println(a *= 1); //a = a * 2 asignación de multiplicación
        System.out.println(a /= 1); //a = a / 1 asignación de división
        System.out.println(a %= 1); //a = a % 1 asignación de módulo
        System.out.println(a);
        // operadores de asignación

        // operadores de comparacióm
        int b = 5;
        int c = 3;
        System.out.println(b == c); //¿b es igual que c?
        System.out.println(b != c); //¿b no es igual que c?
        System.out.println(b > c); //¿b es mayor que c?
        System.out.println(b < c); //¿b es menor que c?
        System.out.println(b >= c); //¿b es mayor o igual que c?
        System.out.println(b <= c); //¿b es menor o igual que c?
        //operadores de comparación 

        //operadores lógicos
        System.out.println(b > 4 && b < 10); //¿b es mayor que 4 y 5 es menor que 10?
        System.out.println(c == 2 || c > 5); //¿c es igual a 2 o c es mayor que 6 ?
        System.out.println(!(b > 1 || b > 3)); // negacion de: ¿b es mayo ue a 1 o b es mayor a 1?
        //operadores lógicos
        
        //Números en cadenas 
        int num1 = 10;
        int num2 = 20;
        int sumaDeNumeros = num1 + num2;
        System.out.println(sumaDeNumeros);
        String txt1 = "10";
        String txt2 = "20";
        String concatDecadenas = txt1 + txt2;
        System.out.println(concatDecadenas);
        String combinacionNumYTxT = txt1 + num2;
        System.out.println(combinacionNumYTxT);

        //Número en cadenas 

        //biblioteca 
        int absoluto = Math.abs(-20);
        System.out.println(absoluto);
        //biblioteca 
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(divi);
        System.out.println(modulo);
        System.out.println(incremento);
        System.out.println(decremento);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(nombreusuario + " " + Apellidousuario);
        System.out.println(letra);
        System.out.println(edad);
        System.out.println(codigo);
        System.out.println(cantidad);
        System.out.println(poblacionmundial);
        System.out.println(precio);
        System.out.println(salario);
        System.out.println(salario2);
        System.out.println(estadoActivo);
        System.out.println(varioscaracteres);
        System.out.println(numero2);
        System.out.println(valorB);
        System.out.println(segundaletra);
        System.out.println(valorA);
        System.out.println("la longitud de la cadena es:" + " " + nombre.length());
    }
}

