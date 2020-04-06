package esercizio3;

import net.finmath.functions.NormalDistribution;

public class BrownianMotion {

	private double[] times;
	private int numberOfPaths;
	//come campi direttamente le realizzazioni 
	double[] brownianIncrementsOnePath;
	private double[][] brownianIncrements;
	private double[] brownianOnePath;
	private double[][] brownianPaths;
	
	//costruttore
	public BrownianMotion(double[] times, int numberOfPaths) {
		this.times=times;
		this.numberOfPaths=numberOfPaths;
		
	}
	
	
	//getters e setters
	public double[] getTimes() {
		return times;
	}

	public void setTimes(double[] times) {
		this.times = times;
	}

	public int getNumberOfPaths() {
		return numberOfPaths;
	}

	public void setNumberOfPaths(int numberOfPaths) {
		this.numberOfPaths = numberOfPaths;
	}

	public double[] getBrownianIncrementsOnePath() {
		return brownianIncrementsOnePath;
	}
	
	public double[][] getBrownianIncrements() {
		return brownianIncrements;
	}
	
	public double[] getBrownianOnePath() {
		return brownianOnePath;
	}

	public double[][] getBrownianPaths() {
		return brownianPaths;
	}
	
	public double getTime(int index) {
		return times[index];
	}
	
	public double getTimeLessOrEqual(double time) {
		int index = 0;
		for (int i = 0; i < times.length; i++) {
			if(times[index] >time) {
				break;
			}else {
				index += 1;
			}
			
		}
		return times[index-1];
	}
	
	
	//metodi che simulano gli incrementi browniani
	public double[] constructBrownianIncrementOnePath() {
		brownianIncrementsOnePath = new double[times.length-1];
		brownianIncrementsOnePath[0] = 0;
		for (int j = 1; j < brownianIncrementsOnePath.length; j++) {
			brownianIncrementsOnePath[j] = 
					NormalDistribution.inverseCumulativeDistribution(Math.random())*Math.sqrt(times[j+1]-times[j]);
		}
		
		return brownianIncrementsOnePath;
	}
	
	public double[][] constructBrownianIncrement() {
		brownianIncrements = new double[times.length-1][numberOfPaths];
		for (int i = 0; i < numberOfPaths; i++) {
			brownianIncrements[0][i] = 0;
			for (int j = 1; j < brownianIncrements.length; j++) {
				brownianIncrements[j][i] = 
						NormalDistribution.inverseCumulativeDistribution(Math.random())*Math.sqrt(times[j+1]-times[j]);
			}
		}
		
		return brownianIncrements;
	}
	
	
	//metodi che costruiscono i percorsi del moto browniano relativi agli incrementi simulati sopra
	public double[] constructBrownianOnePath(){
		brownianOnePath = new double[times.length-1];
		
		double sum = 0;
		for (int j = 0; j < brownianIncrementsOnePath.length; j++) {
			sum += brownianIncrementsOnePath[j];
			brownianOnePath[j] = sum;
		}
		
		return brownianOnePath;
	}
	
	public double[][] constructBrownianPaths(){
		brownianPaths = new double[times.length-1][numberOfPaths];
		
		for (int i = 0; i < numberOfPaths; i++) {
			double sum = 0;
			for (int j = 0; j < brownianIncrements.length; j++) {
				brownianPaths[j][i] = sum + brownianIncrements[j][i];
			}
		}
		
		return brownianPaths;
	}


	


	
	
}
