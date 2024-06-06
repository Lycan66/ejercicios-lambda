package practicalambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class PracticaLambdas {

    public static void main(String[] args) {
        
        /*EJERCICIOS PRACTICOS DE LAMBDAS*/
        //List<String> strings = List.of("Ojo");
        //int[] enteros = {5,12,30,4,7,1};
        
        /*Sacar el promedio en un array de numeros enteros*/
        //var promedio = Arrays.stream(enteros).average().getAsDouble();
        
        /*Sacar el numero mayor en un array de numeros enteros*/
        //int mayor = Arrays.stream(enteros).max().getAsInt();
        
        /*Sumar todos los numeros en un array de numeros enteros*/
        //int suma = Arrays.stream(enteros).sum();
        
        /*Filtrar las cadenas que empiecen por la letra 'A' en una lista de cadenas*/
        //strings.stream().filter(c -> c.startsWith("A")).forEach(System.out::println);
        
        /*Convertir las cadenas a mayusculas en una lista de cadenas*/
        //strings.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        
        /*Ordernar de mayor a menor un array de numeros enteros*/
        //Arrays.stream(enteros).sorted().forEach(System.out::println);
        
        /*Multiplicar por 2 cada numero de un array de enteros*/
        //Arrays.stream(enteros).map(n -> n*2).forEach(System.out::println);
        
        /**/
        //String cadena = strings.stream().reduce((str1,str2) -> str1.concat(", "+str2)).get();
        
        /*Encontrar la primera cadena que tenga mas de 5 caracteres*/
        //Optional<String> cadena = strings.stream().filter(s -> s.length() > 5).findFirst();
        
        /*Sacar el cuadrado de cada numero en una lista de enteros*/
        //Arrays.stream(enteros).map(n -> n*n).forEach(System.out::println);
        
        /*Contar el numero de cadenas que tengan mas de 3 caracteres*/
        //var conteo = strings.stream().filter(s -> s.length() > 3).count();
                
        
        //System.out.println(conteo);
        
        
    }
    
}
