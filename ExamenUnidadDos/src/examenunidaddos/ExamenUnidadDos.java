package examenunidaddos;

import java.util.Scanner;



public class ExamenUnidadDos {
    static Scanner leer=new Scanner(System.in);
    
    public static void EjercicioN1(){   
        int nVehiculos,inc=1;
        double precio1=1,precio2=1, precio3=1,Total=1;
        Scanner i=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de caterigorias : ");
        nVehiculos=i.nextInt();
        while(inc<=nVehiculos){
            System.out.println("ingrese la cateria: "+inc);
            int cater=i.nextInt();
            System.out.println("ingrese el valor de la categoria: ");
            int cate1=i.nextInt();
            if(cater==1){
                precio1=cate1*0.10;
            }else if(cater==2){
                precio2=cate1*0.07;
            }else if(cater==3){
                precio3=cate1*0.05;
            }
          inc++; 
          Total=precio1+precio2+precio3;
        }
        System.out.println("El impuesto total: "+Total);
        System.out.println("El impuesto de la categoria 1: "+precio1);
        System.out.println("El impuesto de la categoria 2: "+precio2);
        System.out.println("El impuesto de la categoria 3: "+precio3);
        
        
    }

    public static void EjercicioN4(){
          int[] arreglo={1,10,9,8,11,7,6,12,2,3,4,5};
          int dato;
          boolean fals= false;
          
          System.out.println("DIJITE EL MES A BUSSCAR");
          dato =leer.nextInt();
          int i=0;
          while(i<12 && fals == false){
              if(arreglo [i] == dato){
                  fals= true;
              }
              i++;
          }
          
          if (fals== false){
              System.out.println("EL MES NO SE ENCUENTRA EN EL ARREGLO");
          }
          else{
              System.out.println("El número ha sido encontrado en la posición "+(i-1));
          }
    }
    
    public static void main(String[] args) {
        System.out.println("INGRESA LA OPCION DEL NUMERO QUE DESEA PROBAR");
        Scanner leer=new Scanner (System.in);
        int opcion=leer.nextInt();
        while (opcion!=0){
            switch (opcion){
                case 4:EjercicioN4();break;
                case 1:EjercicioN1();break;
                default:System.out.println("OBCION INVALIDA!!! ");break; 
            }
            System.out.println("INGRESE LA OPCION DEL ALGORITMO QUE DESEA PROBAR");
            opcion= leer.nextInt();
        }
    }
    
    
}
