import java.util.Arrays;
import java.util.Scanner;

public class ExamenCasaDCCS {
 public static void main(String[] args) {
	System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA EJECUTAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: BusquedaBinariaRecursivaDCCS(); break;
            case 2: OrdenamientoRecursivoDCCS(); break;
                  default: System.out.println("Error obción incorrecta!!");break;
            }  
            System.out.println("\nINGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
    }
 
 
	public static int busca(int[] array, int chave) {
		return busqdaBinariaRecursivaDCCS(array, 0, array.length - 1, chave);
	}
        
        
	public static int busqdaBinariaRecursivaDCCS(int[] array, int menor, int maior,int chave) {
		int media = (maior + menor) / 2;
		int valorMeio = array[media];

		if (menor > maior)
			return -1;
		else if(valorMeio == chave) 
			return media;
		else if (valorMeio < chave)
			return busqdaBinariaRecursivaDCCS(array, media+1, maior, chave);
		else
			return busqdaBinariaRecursivaDCCS(array, menor, media-1, chave);
	}
        
        
        public static void BusquedaBinariaRecursivaDCCS() {
            int[] array = {7, 4, 45, 67, 59 , 6, 15 , 12 , 56, 61 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
                System.out.println("Tamaño: "+array.length);
		System.out.println("El numero 12 esta en la posicion: "+busca(array, 12));
		System.out.println("El numero 6 esta en la posicion: "+busca(array, 6));
		System.out.println("El numero 45 esta en la posicion: "+busca(array, 45));
    }
        

        public  static int vec[]={22,12,55,9,18,32,1,91,35,17};
        
        public static void OrdenamientoRecursivoDCCS() {
                System.out.println("Vector inicial");
                imprimirVector(vec);
                ordenacionRapida(vec);
                System.out.println("\nVector ordenado en forma acendente2");
                imprimirVector(vec);
        }
        
        public static void ordenacionRapida(int vec[]){
                int N=vec.length;
                quickSort(vec, 0, N-1);
        }
        
        public static void quickSort(int vec[], int inicio, int fin){
                if(inicio>=fin) return;
                int pivote=vec[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && vec[elemIzq]<pivote){
                                elemIzq++;
                        }
                        while(elemDer>inicio && vec[elemDer]>=pivote){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                int temp=vec[elemIzq];
                                vec[elemIzq]=vec[elemDer];
                                vec[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        int temp=vec[inicio];
                        vec[inicio]=vec[elemDer];
                        vec[elemDer]=temp;
                }
                quickSort(vec, inicio, elemDer-1);
                quickSort(vec, elemDer+1, fin);
        }
        public static void imprimirVector(int vec[]){
                for(int i=0;i<vec.length;i++){
                        System.out.print(vec[i]+" ");
                }
        }
    
}