package esercizio3;

import java.util.Arrays;

public class TestMyBrownianMotion {
	
	public static void main(String[] args) {
		
		double T = 2;
		double deltaT = 0.01;
		double[] times = new double[201];
		double sum = 0;
		for (int i = 0; i < times.length; i++) {
			times[i] = sum;
			sum = sum + deltaT;
		}
		//System.out.println(Arrays.toString(times));
		int numberOfPaths = 10000;
		
		BrownianMotion brownianX = new BrownianMotion(times, numberOfPaths);
		//sembra davvero un moto browniano
		System.out.println(Arrays.toString(brownianX.constructBrownianIncrementOnePath()));
		System.out.println(Arrays.toString(brownianX.constructBrownianOnePath()));
		brownianX.constructBrownianIncrement();
		brownianX.constructBrownianPaths();
		
		BrownianMotion brownianY = new BrownianMotion(times, numberOfPaths);
		brownianY.constructBrownianIncrement();
		brownianY.constructBrownianPaths();
		
		
		//2 V.A. indipendenti hanno covarianza nulla
		//stimiamo quindi il valore atteso di XY, che deve essere 0
		//fissiamo un tempo (uno vale l'altro)
		int index = 199;
		double tempo = brownianX.getTime(index);
		double sumXY = 0;
		double sumX = 0;
		double sumY = 0;
		for (int i = 0; i < numberOfPaths; i++) {
			sumXY += brownianX.getBrownianPaths()[index][i]*brownianY.getBrownianPaths()[index][i];
			sumX += brownianX.getBrownianPaths()[index][i];
			sumY += brownianY.getBrownianPaths()[index][i];
		}
		double valoreAttesoXY = sumXY/numberOfPaths;
		double valoreAttesoX = sumX/numberOfPaths;
		double valoreAttesoY = sumY/numberOfPaths;
		
		System.out.println(valoreAttesoXY);
		System.out.println(valoreAttesoX*valoreAttesoY);
		System.out.println(valoreAttesoXY - valoreAttesoX*valoreAttesoY);
		
		System.out.println("Gli ordini di grandezza non coincidono");
		
	}
	
}
