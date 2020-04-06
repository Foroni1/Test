package esercizio2;

import java.util.Arrays;

public class TestMyRandomVariables {

	public static void main(String[] args) {
		/*double lambda = 2;
		int N = 10000;
		ExponentialRandomVariable exp = new ExponentialRandomVariable(lambda, N);
		double[] campioneExp = exp.getSample();
		System.out.println(Arrays.toString(campioneExp));
        
		//per vedere se funziona correttamente calcoliamone media e varianza campionarie
		double sum=0;
		for (int i = 0; i < N; i++) {
			sum += campioneExp[i];
		}
		double mean = sum/N;
		System.out.println("La media è " + mean + ", e notiamo che è corretta in quanto circa 1/lambda");
		
		double sum2 = 0;
		for (int i = 0; i < N; i++) {
			sum2 += (mean - campioneExp[i])*(mean - campioneExp[i]);
		}
		double variance = sum2/(N-1);
		System.out.println("La varianza è " + variance + ", e notiamo che è corretta in quanto circa 1/lambda^2");
		*/
		
		
		double mu = 2;
		double sigma = 3;
		int N = 10000;
		NormalRandomVariable normal = new NormalRandomVariable(mu, sigma, N);
		double[] campioneNormal = normal.getSample();
		System.out.println(Arrays.toString(campioneNormal));
        
		//per vedere se funziona correttamente calcoliamone media e varianza campionarie
		double sum=0;
		for (int i = 0; i < N; i++) {
			sum += campioneNormal[i];
		}
		double mean = sum/N;
		System.out.println("La media è " + mean + ", e notiamo che è corretta in quanto circa mu");
		
		double sum2 = 0;
		for (int i = 0; i < N; i++) {
			sum2 += (mean - campioneNormal[i])*(mean - campioneNormal[i]);
		}
		double variance = sum2/(N-1);
		System.out.println("La varianza è " + variance + ", e notiamo che è corretta in quanto circa sigma^2");
		
		
	}

}
