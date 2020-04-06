package base;

import java.util.Arrays;

public class TestMontecarloIntegration {

	public static void main(String[] args) {
		//PRIMA PARTE 
		/*Monomio f1 = new Monomio(-.4);
		Monomio f2 = new Monomio(-2.0/3.0);
		
		//l'integrale tra 0 e 1 può essere già visto come un valore atteso senza riscalare
		//(vedi esempio1.5)
		int M = 100000; 
		
		double sum1 = 0;
		double sum2 = 0;
		for(int i = 0; i < M; i++){
			//estraiamo dall'uniforme
			double rand1 = Math.random();
			double rand2 = Math.random();
			
			//calcoliamo il valore di f ad ogni possibile realizzazione
			double value1 = f1.evaluateFunction(rand1);
			double value2 = f2.evaluateFunction(rand2);
			
			sum1 += value1;		
			sum2 += value2;	
		}
		
		double valoreAtteso1 = sum1 / M; 
		double valoreAtteso2 = sum2 / M; 
		
        System.out.println(valoreAtteso1);  //il valore "esatto" è 1.666666666667
        System.out.println(valoreAtteso2);*/  //il valore esatto è 3
        
		//Lo stimatore monte carlo converge in distribuzione, in media quadratica e in probabilità, si vedano infatti i
        //risultati di convergenza Teorema1.1, Teorema1.2, Teorema1.3
        
        
        //SECONDA PARTE
        int M = 100000;
        Monomio f1 = new Monomio(-.4);
        Monomio f2 = new Monomio(-2.0/3.0);
        MontecarloIntegrator integratoreDif1 = new MontecarloIntegrator(f1, 0, 1, M);
        System.out.println("L'integrale di f1 vale " + integratoreDif1.doIntegration());
        System.out.println("con deviazione standard " + integratoreDif1.getDeviazioneStandard());
        System.out.println();
        
        MontecarloIntegrator integratoreDif2 = new MontecarloIntegrator(f2, 0, 1, M);
        System.out.println("L'integrale di f2 vale " + integratoreDif2.doIntegration());
        System.out.println("con deviazione standard " + integratoreDif2.getDeviazioneStandard());
        System.out.println();
        
        //l'errore assoluto è il modulo della differenza tra il valore esatto e il valore stimato
        System.out.println("Per il primo integrale l'errore assoluto è " + integratoreDif1.getErroreAssoluto(1.66666666666667));
        System.out.println("mentre per il secondo è " + integratoreDif2.getErroreAssoluto(3));
        System.out.println();
        
        System.out.println("Gli intervalli di confidenza al 95% sono rispettivamente");
        System.out.println(Arrays.toString(integratoreDif1.getIntervalloDiConfidenza(.95)));
        System.out.println(Arrays.toString(integratoreDif2.getIntervalloDiConfidenza(.95)));
	}

}
