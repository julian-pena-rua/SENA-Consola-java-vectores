public class Imprimir_Vector_estatura {
    public static void main(String args[]) {
       /*           VECTORES          */
       // Para crear un array o vector se realiza: 
       //   Tipo_de_variable[ ]   Nombre_del_array = new  Tipo_de_variable[dimensión];
       //Para números reales

       double[ ] estatura = {1.73, 1.67, 1.56}; //Array de 3 elementos, de la misma forma procederíamos para el tipo float, 
       // pero teniendo en cuenta que los números deberán llevar al final la letra “f” o “F”. Por ejemplo 1.73f o 1.73F.
       

      System.out.println(estatura[0]); // imprimire el valor asignado en la posición 0
      System.out.println(estatura[1]); // imprimire el valor asignado en la posición 1
      System.out.println(estatura[2]); // imprimire el valor asignado en la posición 2

    }
}