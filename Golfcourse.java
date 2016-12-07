/* Name: Ji Eun Han       
 * Assignment Number: Project 02
 * Section: Mon, Wed 12:30 
 * Lab TA: Jack, Sofia, Xena
 * I collaborated with Mackenzie Lee. 
 */

public class Golfcourse {
	//instances 
	private int [] par;
	private int [] hole;
	private int [] yards;
	private String [] names;
	
	//constructor for Genesee golf course and California Country Club Course
	public Golfcourse(int [] par, int [] hole, int [] yards){
		this.par = par; 
		this.hole = hole;
		this.yards = yards;
	}
	//constructor for St. Andrews course 
	public Golfcourse(int [] par, int [] hole, int [] yards, String [] names){
		this.par = par; 
		this.hole = hole;
		this.yards = yards;
		this.names = names;
	}
	
//getters and setters 
	public int [] getPar() {
		return par;
	}

	public void setPar(int [] par) {
		this.par = par;
	}

	public int [] getHole() {
		return hole;
	}

	public void setHole(int [] hole) {
		this.hole = hole;
	}

	public int [] getYards() {
		return yards;
	}

	public void setYards(int [] yards) {
		this.yards = yards;
	}

	public String [] getNames() {
		return names;
	}

	public void setNames(String [] names) {
		this.names = names;
	}
	
	
}
