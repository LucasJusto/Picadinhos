/**
	author: Lucas Dimer Justo
	Date: 20/05/2018
	Código adptado de python para java feito em 2018 para resolver o problema dos picadinhos, trabalho 3 de introdução à ciência da 	 		computação, primeiro contato e tentativa de solução do problema. Atualmente ja produzi 2 soluções melhores.
*/
import java.util.Scanner;
public class PicadinhosRuim{
	public static int picadinhos(int a){
		int res = 1;//o proprio numero ja é seu picadinho.
		int inicio = 1;
		int fim = (a/2)+1;//só precisamos ir até metade+1, por que metade+1 + metade+2 ja passa o número.
		while(inicio<fim){
			for(int i = inicio;i<fim;i++){
				int somatorioAtual = 0;
				for(int j = i;j<=fim;j++){
					somatorioAtual+=j;
				}
				if(somatorioAtual==a)res++;
			}
			fim--;
		}
		return res;
	}
	public static void main(String[] args){
		System.out.println("Digite o número até o qual a pesquisa será realizada: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int resposta = 1;
		int jeitos = 1;
		long initialTime = System.currentTimeMillis();
		for(int i = 1;i<=n;i++){
			int resDeI = picadinhos(i);
			System.out.println(i+ " "+resDeI);
			if(resDeI>jeitos){
				jeitos=resDeI;
				resposta=i;
			}
		}
		long finalTime = System.currentTimeMillis();
		long time = finalTime-initialTime;
		System.out.println("Número com mais picadinhos: "+resposta+"   Picadinhos: "+jeitos+"   tempo: "+time+"ms");
	}
}

