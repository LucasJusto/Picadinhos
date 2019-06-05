import java.util.Scanner;
public class Picadinhos {
	public static int gauss(int i, int f){
        return (i+f) * (f-i+1) / 2;
    }
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] res = new int[n];
		//i = inicio ; j=fim;
		for(int i = 1;i<(n/2)+1;i++){
			for (int j =i+1;j<=(n/2)+1;j++){
				int result = gauss(i,j);
				if(result<=n && result >0){
					res[result-1]++;
				}
				else{
					break;
				}
			}
		}
		int maior = res[0]+1;
		int indice = 1;
		for(int k = 0;k<res.length;k++){
			if(res[k]+1>maior){
				maior=res[k]+1;
				indice=k+1;
			}
		}
		System.out.println(indice+" "+maior);
	}
}