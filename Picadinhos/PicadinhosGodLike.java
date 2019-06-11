import java.util.Scanner;
public class PicadinhosGodLike{
	public static void main(String[] args){
		System.out.println("Digite o número até o qual a pesquisa será realizada: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] res = new int[n];
		int maior = res[0]+1;
		int indice = 1;
		long initialTime = System.currentTimeMillis();
		for(int i = 1;i<(n/2)+1;i++){
			int result = i;
			for (int j =i+1;j<=(n/2)+1;j++){
				result+=j;
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
		long time = finalTime-initialTime;
		System.out.println("Sem gauss:   "+indice+" "+maior+"    Tempo: "+time+"ms");
	
	}
}
