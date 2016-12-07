/* Name: Ji Eun Han       
 * Assignment Number: Project 02
 * Section: Mon, Wed 12:30 
 * Lab TA: Jack, Sofia, Xena
 * I collaborated with Mackenzie Lee. 
 */

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Random;

//This class is for printing and results 

public class GolfPrinting {

	//Information for Genesee Valley Park North Course 
	int [] hole = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18}; 
	int [] par = {5,4,4,3,5,3,4,4,3,4,4,3,5,4,5,4,4,3}; 
	int [] yards = {530,305,331,201,500,226,409,410,229,433,363,174,545,419,512,410,320,170};
	//constructor for genesee valley course 
	Golfcourse Geneseevalley = new Golfcourse(par,hole,yards);
		
	//Information for Old Course at St. Andrews)
	int [] hole2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18}; 
	int [] par2 = {4,4,4,4,5,4,4,3,4,4,3,4,4,5,4,4,4,4};
	int [] yards2 = {376,453,397,480,568,412,371,175,352,386,174,348,465,618,455,423,495,357};
	String [] names = {"Burn", "Dyke", "Cartgate(Out)", "Ginger Beer", "Hole O'Cross (Out)", "Heathery(Out)", "High(Out)", "High(Out)","Short","End","Bobby Jones", "High(In)","Heathery(In)","Hole O'Cross(In)","Long","Cartgate(In)","Long","Cartgate(In)","Corner of the Dyke","Road","Tom Morris"};
	//constructor for st. andrews course 
	Golfcourse Standrews = new Golfcourse(par2,hole2,yards2,names);
	
	//Information for California Country Club Course 
	int[] hole3 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18}; 
	int[] par3 = {5,3,4,4,3,4,4,4,5,3,5,4,4,4,4,5,3,4};
	int[] yards3 = {506,151,356,461,176,387,359,381,501,167,567,417,454,427,337,480,214,463};	
	//constructor for California Country Club Course 
	Golfcourse cccc = new Golfcourse(par3,hole3,yards3);
	
	//club information array 
	int [] clubnum = {1,2,3,4,5,6,7,8,9,10};
	String [] clubname = {"Drive","3-wood","3-iron","4-iron","5-iron","6-iron","7-iron","8-iron","9-iron","Wedge"};
	int [] mean = {230,215,180,170,155,145,135,125,110,50};
	int [] std = {30,20,20,17,15,15,15,15,10,10};
	GolfCalc clubinfo = new GolfCalc(clubnum, clubname, mean, std); 
	
	//power information array 
	int [] putpower = {1,2,3,4,5,6,7,8,9,10};
	int [] putmean = {1,2,4,8,12,16,20,25,30,40};
	int [] putstd = {1,1,2,2,3,3,4,4,5,5};
	GolfCalc putpowerinfo = new GolfCalc(putpower, putmean, putstd); 
	
	Scanner input = new Scanner(System.in);
	
	int coursechoice;
	int counter=0; 
	int finalscore;
	int i;
	int yardsleft; 
	
	public void StartGame(){
		
		if (counter==0){
			System.out.println("Hi there! Welcome to TTY Golf-- a virtual, modified game of golf!");
			System.out.println("Please select a course: ");
			System.out.println("1. Genesee Valley Park North Course");
			System.out.println("2. The Old Course at St. Andrews");
			System.out.println("3. California Country Club Course");
			System.out.print("Pick 1, 2 or 3: ");
		} else {
			System.out.println("Please select a course: ");
			System.out.println("1. Genesee Valley Park North Course");
			System.out.println("2. The Old Course at St. Andrews");
			System.out.println("3. California Country Club Course");
			System.out.print("Pick 1, 2 or 3: ");
		}		
		
		coursechoice = input.nextInt();

		while (coursechoice != 1 && coursechoice != 2 && coursechoice != 3){
			System.out.println("Only pick either course 1, 2 or 3");
			coursechoice = input.nextInt();
		}		
			 
		if (coursechoice == 1){
			System.out.println("You are playing Genesee Valley Park North Course");
			System.out.println("Type in 0 if you want to quit at any point of the game." );
			playGame(Geneseevalley);

		} else if (coursechoice == 2){
			System.out.println("You are playing the Old Course at St. Andrews");
			System.out.println("Type in 0 if you want to quit at any point of the game." );
			playGame(Standrews);
		} else if (coursechoice == 3){
			System.out.println("You are playing the California Country Club course");
			System.out.println("Type in 0 if you want to quit at any point of the game." );
			playGame(cccc);
		}
	}
	

	public void playGame (Golfcourse course) {
		Random randint = new Random(); 
		int stroke = 0; 
		outerloop: //so when break to outer loop, the program goes outside the for loop
			
		for (i=0; i< 18; i++){ //18 holes 
			if (coursechoice == 1){ //Genesee Valley Park North Course 
				System.out.println("You're currently on hole " + hole[i] + " with the distance of " + yards[i] + " and par "+par[i]); 	

			}else if (coursechoice == 2){ //St. Andrews Course 
				System.out.println("You're currently on hole " + hole2[i] + " called " + names[i] + " with the distance of " + yards2[i] + " and par "+par2[i]); 	
			}else if (coursechoice == 3){
				System.out.println("You're currently on hole " + hole3[i] + " with the distance of " + yards3[i] + " and par "+par3[i]); 	

			}
			
			boolean exitloop = false; 
			int holestroke = 0;
			
			
			if (coursechoice == 1){ //Genesee Valley Park North Course 
				yardsleft = yards[i];
			}else if (coursechoice == 2){ //St. Andrews Course 
				yardsleft = yards2[i];
			}else if (coursechoice == 3){
				yardsleft = yards3[i];
			}
			
			while (exitloop == false){ 
				stroke++;
				counter++;
				
				if (yardsleft > 20){
					printclubinfo();
					System.out.println("Choose your club:");
					int clubs = input.nextInt();
					if (clubs == 0){ //if user types 0, quit the game 
						break outerloop;
					}
					
					while (clubs > 10 || clubs < 0){ //if the person puts clubs that's not from 1-10 
						System.out.println("Please choose clubs between 1 and 10: ");
						clubs = input.nextInt(); 
					}
					
					System.out.println("Choose your power [1-10]:");
					int powers = input.nextInt();
					if (powers == 0){ //if user types 0, quit the game 
						break outerloop;
					}
					
					while (powers > 10 || powers < 0){ //if the person puts powers that's not from 1-10 
						System.out.println("Please choose power between 1 and 10: ");
						powers = input.nextInt(); 
					}
					
					int distancego = GolfCalc.nextDistance(mean[clubs-1],std[clubs-1], powers); 
					System.out.println("Your shot went "+ distancego +" yards.");
					
					if (distancego > yardsleft && yardsleft >20){
						int overshotsentence1 = randint.nextInt(2); //random sentence generator (3 sentences) 
						if (overshotsentence1 == 0){
							System.out.println("It went over the hole dude!");
						} else if (overshotsentence1 == 1){
							System.out.println("Your shot went over" );
						} else if (overshotsentence1 == 2){
							System.out.println("You hit it too far.");
						}
					}
					yardsleft = Math.abs(yardsleft -distancego);
					
					holestroke++; 
					System.out.println("You still have " + yardsleft + " yards left" );
					
					
					
				} else if (yardsleft <= 20){ //putting 
					System.out.println("You are on the green.");
					System.out.println("Choose your power [1-10]");
					int powers2 = input.nextInt();
					if (powers2 == 0){ //if user types 0, quit the game 
						break outerloop;
					}
					while (powers2 > 10 || powers2 < 0){ //if the person puts powers that's not from 1-10 
						System.out.println("Please choose power between 1 and 10: ");
						powers2 = input.nextInt(); 
					}
					holestroke++;
					
					int feetleft = yardsleft*3; //convert yards to feet
					
					int putgo = GolfCalc.nextDistance(putmean[powers2-1], putstd[powers2-1], putpower[powers2-1]);
					System.out.println("Your shot went " + putgo + " feet.");
				
					if (feetleft < putgo){ //still in feet
						int overshotsentence = randint.nextInt(2); //random sentence generator (3 sentences) 
						if (overshotsentence == 0){
							System.out.println("It went over the hole!");
						} else if (overshotsentence == 1){
							System.out.println("It's overshot." );
						} else if (overshotsentence == 2){
							System.out.println("HAH You hit it too far.");
						}
					}
					
					if (feetleft < 0){ //if overshot, then distance should be added to reduce the negative feetleft
						feetleft = feetleft + putgo; 
					} else { //however if feet left is positive from the start, you subtract the distance the ball went 
						feetleft = feetleft - putgo;
					}
				
					
					System.out.println("You have " + Math.abs(feetleft) + " ft left");
					

					yardsleft = Math.abs(feetleft)/3; //because the condition for the base while loop is in yards, set the distance left into yardsleft

									
					if (feetleft > 60){ 
						yardsleft = feetleft/3; //so it would go to the initial if statement of yardsleft > 20
					}
					
					if (Math.abs(feetleft) <= 1){ //if ball within 1 feet of hole 
						int madeholesent = randint.nextInt(2); //random sentence generator (3 sentences) 
						if (madeholesent == 0){
							System.out.println("You finally made it to the hole!");
						} else if (madeholesent == 1){
							System.out.println("Great job! It's in!" );
						} else if (madeholesent == 2){
							System.out.println("Good job mate! It went in the hole!");
						}
						
						//calculation of final score at the end of the hole 
						if (coursechoice == 1){
							finalscore = holestroke - par[i]; //score is number of strokes minus the par of hole
						} else if (coursechoice == 2){
							finalscore = holestroke - par2[i];
						} else if (coursechoice == 3){
							finalscore = holestroke - par3[i]; 
						}
						
						System.out.println("Your final score for this hole is " + finalscore); 
						
						//random sentences for making hole 
						if (holestroke == par[i]){
							int rsentence1 = randint.nextInt(2); //random sentence generator (3 sentences) 
							if (rsentence1 == 0){
								System.out.println("You made par! Nice job!");
							} else if (rsentence1 == 1){
								System.out.println("Congrats! You made par." );
							} else if (rsentence1 == 2){
								System.out.println("You got it! You made par. I admit. You're pretty good!");
							}
							
						} else if (holestroke > par[i]){
							int rsentence2 = randint.nextInt(2); //random sentence generator (3 sentences) 
							if (rsentence2 == 0){
								System.out.println("You were over par. That's okay.. At least you made it to the hole!");
							} else if (rsentence2 == 1){
								System.out.println("Wow you're over par.. That was NOT the best game but maybe you'll do better in the future.." );
							} else if (rsentence2 == 2){
								System.out.println("You were over par.. Come on you can do better than this.");
							}
							
						} else if (holestroke < par[i]){
							int rsentence2 = randint.nextInt(2); //random sentence generator (3 sentences) 
							if (rsentence2 == 0){
								System.out.println("You were under par. Great job! Are you a professional?");
							} else if (rsentence2 == 1){
								System.out.println("Dayummm you were under par! You're hella good at this!" );
							} else if (rsentence2 == 2){
								System.out.println("Under par! That's impressive!");
							}

						}
						
						if (holestroke == par2[i]){
							int rsentence1 = randint.nextInt(2); //random sentence generator (3 sentences) 
							if (rsentence1 == 0){
								System.out.println("Great job mate! You made par");
							} else if (rsentence1 == 1){
								System.out.println("My sincere congrats! You have made par young lad" );
							} else if (rsentence1 == 2){
								System.out.println("Just there! You made par on this one");
							}
							
						} else if (holestroke > par2[i]){
							int rsentence2 = randint.nextInt(2); //random sentence generator (3 sentences) 
							if (rsentence2 == 0){
								System.out.println("Sorry you're over par. Could've made par if you practiced more beforehand.");
							} else if (rsentence2 == 1){
								System.out.println("You could've done better pal. You're over par");
							} else if (rsentence2 == 2){
								System.out.println("Better luck next time? You're over par. Don't be too harsh on yourself.");
							}
							
						} else if (holestroke < par2[i]){
							int rsentence2 = randint.nextInt(2); //random sentence generator (3 sentences) 
							if (rsentence2 == 0){
								System.out.println("That was one of the best hits I've seen! No wonder you got under par");
							} else if (rsentence2 == 1){
								System.out.println("I wish I was as good at golf as you! You're under par" );
							} else if (rsentence2 == 2){
								System.out.println("You are over par... just kidding! You're under! You did so well!");
							}

						}
						
						if (holestroke == par3[i]){
							int rsentence1 = randint.nextInt(2); //random sentence generator (3 sentences) 
							if (rsentence1 == 0){
								System.out.println("Great shot! You made par.");
							} else if (rsentence1 == 1){
								System.out.println("Have you played golf before lad? You're quite good at this. You made par." );
							} else if (rsentence1 == 2){
								System.out.println("You have made par. Hope the next one's par as well");
							}
							
						} else if (holestroke > par3[i]){
							int rsentence2 = randint.nextInt(2); //random sentence generator (3 sentences) 
							if (rsentence2 == 0){
								System.out.println("Over par.. You can do better than this");
							} else if (rsentence2 == 1){
								System.out.println("That was disappointing.. You're over par" );
							} else if (rsentence2 == 2){
								System.out.println("Lad.. *pat on shoulder* do better.. you're over par");
							}
							
						} else if (holestroke < par3[i]){
							int rsentence2 = randint.nextInt(2); //random sentence generator (3 sentences) 
							if (rsentence2 == 0){
								System.out.println("*High five!* You're under par!");
							} else if (rsentence2 == 1){
								System.out.println("Woah I didn't expect that. You are under par" );
							} else if (rsentence2 == 2){
								System.out.println("Under par! Keep it up!");
							}

						}
						
						exitloop = true; //breaks out of the loop
					} 
					
				} 
				System.out.println("You made total of " + holestroke + " strokes for this hole.");
				
			}//end of while loop
			
			System.out.println("You made total of " + stroke + " strokes so far in the game.");
			
			//calculation of final score for each of the different par numbers for different courses 
			int sum = 0;
			if (coursechoice == 1){
				for (int parindex = 0; parindex <= i; parindex++){
					sum = sum+ par[parindex]; //calculates the sum of given par until par[i]
				}
			} else if (coursechoice == 2){
				for (int parindex = 0; parindex <= i; parindex++){
					sum = sum+ par2[parindex]; 
				}
			} else if (coursechoice == 3){
				for (int parindex = 0; parindex <= i; parindex++){
					sum = sum+ par3[parindex]; 
				}
			}
			
			int finalscore = stroke-sum; //printing the final score of each hole
			System.out.println("Your total score so far is " + finalscore);
			
			//at the last hole, if breaks out of the for loop
			if (i == 17){
				break outerloop;
			}
			
			//will ask if they want to quit after every hole 
			System.out.println("Type 'q' if you want to quit or 'c' if you want to continue playing the game.");
			String quitoption2 = input.next(); 
			if (quitoption2.equalsIgnoreCase("q")){
				int quitsent1 = randint.nextInt(2); //random sentence generator (3 sentences) 
				if (quitsent1 == 0){
					System.out.println("Sorry to hear that you quit. Maybe better luck next time. ");
				} else if (quitsent1 == 1){
					System.out.println("Going so soon? Hope you come back soon!" );
				} else if (quitsent1 == 2){
					System.out.println("");
				}
				break outerloop;
			
			}  else if (quitoption2.equalsIgnoreCase("c")){
				
			}
			
		}//end of for loop
		
		
		int donegamesent = randint.nextInt(2); //random sentence generator (3 sentences) 
		if (donegamesent == 0){
			System.out.println("You're done with the game.");
		} else if (donegamesent == 1){
			System.out.println("Game Over Lad" );
		} else if (donegamesent == 2){
			System.out.println("GG Game's over");
		}


		//option to quit after round in course 
		System.out.println("You sure you don't want to play another game? Type 'q' if you want to quit or 'c' if you want to continue playing the game.");
		String quitoption = input.next(); 
		
		
		if (quitoption.equalsIgnoreCase("q")){
			int quitsent = randint.nextInt(2); //random sentence generator (3 sentences) 
			if (quitsent == 0){
				System.out.println("Bye bye");
			} else if (quitsent == 1){
				System.out.println("Hope we see you again!" );
			} else if (quitsent == 2){
				System.out.println("Come play again!");
			}
		
		}  else if (quitoption.equalsIgnoreCase("c")){
			 StartGame();//if entered continue, another game starts 
			
		}
		
	}
	
	//printing the club information for presentation
	public void printclubinfo(){
		for (int i=0; i< clubnum.length; i++){
			System.out.println(clubnum[i] + " "+ clubname[i]);
		}	
	}
	
}
