package esercizio4;

import java.util.Arrays;
import esercizio3.BrownianMotion;

public class TestBrownianMotionProperties {

	public static void main(String[] args) {
		
		double T = 2;
		double deltaT = .01;
		double[] times = new double[201];
		double sum = 0;
		for (int i = 0; i < times.length; i++) {
			times[i] = sum;
			sum = sum + deltaT;
		}
		int numberOfPaths = 10000;
		
		BrownianMotion brownianX = new BrownianMotion(times, numberOfPaths);
		brownianX.constructBrownianIncrement();
		brownianX.constructBrownianPaths();
		
		//verifichiamo la prima proprietà
		int index = 120;
		double tempoS= brownianX.getTime(index);
		int index2 = 190;
		double tempoT= brownianX.getTime(index2);
		
		double sum1 = 0;
		for (int i = 0; i < numberOfPaths; i++) {
			sum1 += brownianX.getBrownianPaths()[index2][i] * brownianX.getBrownianPaths()[index][i];
		}
		double valoreAtteso = sum1/numberOfPaths;
		System.out.println(valoreAtteso);
		System.out.println(tempoS);
		System.out.println("purtroppo i due valori non coincidono");
		//verifichiamo la seconda proprietà
		brownianX.constructBrownianIncrementOnePath();
		brownianX.constructBrownianOnePath();
		
		double sum2 = 0;
		for (int i = 0; i < times.length-1; i++) {
			sum2 += brownianX.getBrownianOnePath()[i] * brownianX.getBrownianIncrementsOnePath()[i];
		}
		System.out.println(sum2);
		System.out.println(brownianX.getBrownianOnePath()[times.length-2]*brownianX.getBrownianOnePath()[times.length-2]/2 - times[200]/2);
		System.out.println("neanche questi coincidono");
		
		

	}

}
