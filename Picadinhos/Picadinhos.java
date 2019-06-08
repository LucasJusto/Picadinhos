/**
	author: Lucas Dimer Justo
	Date: 05/05/2019
	Terceiro contato com o problema dos picadinhos, agora consegui fazer uma solução rápida. Resolve para 1 a 1milhão em 27 milisegundos.
*/
import java.util.Scanner;
public class Picadinhos {
	public static int gauss(int i, int f){
        return (i+f) * (f-i+1) / 2;
    }
	public static void main (String[] args){
		System.out.println("Digite o número até o qual a pesquisa será realizada: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] res = new int[n];
		int maior = res[0]+1;
		int indice = 1;
		long inicialTime = System.currentTimeMillis();
		//i = inicio ; j=fim;
		for(int i = 1;i<(n/2)+1;i++){
			for (int j =i+1;j<=(n/2)+1;j++){
				int result = gauss(i,j);
				if(result<=n && result >0){
					res[result-1]++;
					if(res[result-1]+1>maior){
						maior = res[result-1]+1;
						indice = result;
					}
				}
				else{
					break;
				}
			}
		}
		long finalTime = System.currentTimeMillis();
		long time = finalTime-inicialTime;
		System.out.println(indice+" "+maior+"   Tempo:"+time+"ms");
	}
}
