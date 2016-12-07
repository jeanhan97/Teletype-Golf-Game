/* Name: Ji Eun Han       
 * Assignment Number: Project 02
 * Section: Mon, Wed 12:30 
 * Lab TA: Jack, Sofia, Xena
 * I collaborated with Mackenzie Lee. 
 */

//This class if for math calculations 
import java.util.Random;

//instances 
public class GolfCalc {
	private int [] clubnum;
	private String [] clubname;
	private int [] mean;
	private int [] std; 
	private int [] power; 
	
	static Random random = new Random();
	
	//constructors for the club information 
	public GolfCalc(int [] clubnum, String [] clubname,int [] mean,int [] std){
		this.clubnum = clubnum;
		this.clubname = clubname;
		this.mean = mean;
		this.std = std; 
	}
	
	//constructors for power information 
	public GolfCalc(int[] power, int[] mean, int[] std){
		this.power = power;
		this.mean = mean;
		this.std = std; 
	}
	
	//calculation equation
		public static int nextDistance(int mean, int stddev, int power) {
		    double mean_adj = mean * power / 10.0;
		    double stddev_adj = stddev * power / 10.0;
		    int distance;
		    do {
		        double val = (random.nextGaussian() * stddev_adj) + mean_adj;
		        distance = (int) val;
		    } while (distance < 0);
		    return distance;
		}
		
		
//getters and setters 
	public int [] getClubnum() {
		return clubnum;
	}

	public void setClubnum(int [] clubnum) {
		this.clubnum = clubnum;
	}

	public String [] getClubname() {
		return clubname;
	}

	public void setClubname(String [] clubname) {
		this.clubname = clubname;
	}

	public int [] getMean() {
		return mean;
	}

	public void setMean(int [] mean) {
		this.mean = mean;
	}

	public int [] getStd() {
		return std;
	}

	public void setStd(int [] std) {
		this.std = std;
	}

	public int [] getPower() {
		return power;
	}

	public void setPower(int [] power) {
		this.power = power;
	}
}
