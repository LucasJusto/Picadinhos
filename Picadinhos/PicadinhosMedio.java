/**
	author: Lucas Dimer Justo
	Date: 15/10/2018
	Segundo contato com o problema dos picadinhos, na cadeira de matemática concreta, aqui consegui desenvolver um algoritmo que resolve
	de 1 a 1milhão em 30 minutos. Melhor que o primeiro contato que demoraria vários dias. Porém ainda fiz uma versão melhor após esta.
*/
import java.util.Scanner;
import java.util.ArrayList;
public class PicadinhosMedio{
    public static int gauss(int i, int f){
        return (i+f) * (f-i+1) / 2;
    }
    public static int particoesSeq(int n){
        int count=1;
        int i =1;
        int f = 1;
        while(i <= n/2){
            int aux = gauss(i,f);
            if(n>aux)f++;
            else if(n<aux)i++;
            else{
                count++;
                f++;
            }
            
        }
        return count;
    }
    public static void add(ArrayList<Integer> v,int n){
        if(v.get(v.size()-1)!=n)v.add(n);
    }
    public static void show(ArrayList<Integer> v){
        System.out.print("[");
        for(int i = 0;i<v.size();i++){
            if(i==v.size()-1)System.out.print(v.get(i));
            else System.out.print(v.get(i) + ", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero ate o qual a pesquisa sera realizada: ");
        int k = in.nextInt();
        int maior = 0;
        int indice = 1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(0);
	long initialTime = System.currentTimeMillis();
        for(int i = 0;i<=k;i++){
            int p = particoesSeq(i);
            if(p>maior){
                maior=p;
                
                indice = i;
                add(res,indice);
            }
        }
	long finalTime = System.currentTimeMillis();
	long time = finalTime - initialTime;
        System.out.println("Fomos ate: "+k+"    Numero com mais particoesSeq: "+indice+"   Numero de particoesSeq dele: "+maior);
        show(res);
	System.out.println("Tempo: "+time+"ms");

    }
}
