import java.util.Scanner;
import java.util.ArrayList;

public class Tracker {

 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);

 double pYards = 0;
 double pTouchdowns = 0;
 double pConversions = 0;
 double rConversions = 0;
 double cConversions = 0;
 double interceptions = 0;
 double fumbles = 0;
 double rYards = 0;
 double rTouchdowns = 0;
 double cYards = 0;
 double cTouchdowns = 0;
 double receptions = 0;
 double fieldGoals = 0;
 double extraPoints = 0;
 double sacks = 0;
 double safeties = 0;
 double touchdowns = 0;
 
 boolean ppr = false;
 double score = 0;
 double total = 0;
 double percent = 0;
 double players = 0;
 double opponents = 0;
 double pick = 0;
 double value = 0;
 double returnV = 0;
 String answer = "";
 String position = "";
 ArrayList<Double> scores = new ArrayList<Double>();

  System.out.println("Welcome to Fantasy Football Calculator!");
  System.out.println("How many opponents are in your fantasy league?");
  opponents = s.nextDouble();
  System.out.println("How many players are on your fantasy team?");
  players = s.nextDouble();
  System.out.println("Is your league PPR? (Y/N)");
  answer = s.next();
  if (answer.equals("Y")) {
	  ppr = true;
  }
  
  for (int i = 0; i < players; i++) {
	  System.out.println("Enter the position of your player. (QB, HB, WR, TE, K, DEF)");
	  position = s.next();
	  System.out.println("Which pick was this player drafted at?");
	  pick = s.nextDouble();
	  
	  if (position.equals("QB")) {
		  System.out.println("Enter the number of pass yards thrown: ");
		  pYards = s.nextDouble();
		  System.out.println("Enter the number of pass touchdowns thrown: ");
		  pTouchdowns = s.nextDouble();
		  System.out.println("Enter the number of pass 2 point conversions thrown: ");
		  pConversions = s.nextDouble();
		  System.out.println("Enter the number of interceptions thrown: ");
		  interceptions = s.nextDouble();
		  System.out.println("Enter the number of fumbles: ");
		  fumbles = s.nextDouble();
		  System.out.println("Enter the number of rushing yards: ");
		  rYards = s.nextDouble();
		  System.out.println("Enter the number of rushing 2 point conversions: ");
		  rConversions = s.nextDouble();
		  System.out.println("Enter the number of rushing touchdowns: ");
		  rTouchdowns = s.nextDouble();
		  
		  score = ((pYards * 0.04) + (pTouchdowns * 4) + pConversions + (rConversions * 2) + (interceptions * -1) + (fumbles * -1) + (rYards * 0.1) + (rTouchdowns * 6));
		  scores.add(score);
		  System.out.println("Your QB's total score is: " + score);
		  
		  value = 100 - (100 * (pick / ((opponents + 1) * 15)));
		  
		  if (score <= 78.6) {
			  System.out.println("Your QB performed within the bottom quartile in the league.");
		  }
		  else if (score <= 95) {
			  System.out.println("Your QB performed within the bottom half of the league.");
		  }
		  else if (score <= 116) {
			  System.out.println("Your QB performed within the top half of the league.");
		  }
		  else {
			  System.out.println("Your QB performed within the top quartile in the league.");
		  }
		  
		  percent = (score/398.3) * 100;
		  System.out.println("Your QB's score was " + percent + "% highest among fantasy starters.");
		  
		  returnV = percent - value;
		  System.out.println("You valued this player at " + value + "%.");
		  if (percent >= value) {
			  System.out.println("This was a good pick.");
		  }
		  else {
			  System.out.println("This was a bad value pick.");
		  }
		  System.out.println("This player gave you " + returnV + "% value than expected.");
		  System.out.println();
			  
	  }
	  else if (position.equals("HB")) {
		  System.out.println("Enter the number of rushing yards: ");
		  rYards = s.nextDouble();
		  System.out.println("Enter the number of rushing touchdowns: ");
		  rTouchdowns = s.nextDouble();
		  System.out.println("Enter the number of rushing 2 point conversions: ");
		  rConversions = s.nextDouble();
		  System.out.println("Enter the number of 2 point conversions caught: ");
		  cConversions = s.nextDouble();
		  System.out.println("Enter the number of receptions caught: ");
		  receptions = s.nextDouble();
		  System.out.println("Enter the number of receiving yards caught: ");
		  cYards = s.nextDouble();
		  System.out.println("Enter the number of receiving touchdowns caught: ");
		  cTouchdowns = s.nextDouble();
		  System.out.println("Enter the number of fumbles lost: ");
		  fumbles = s.nextDouble();
		  
		  if (ppr == true) {
			  score = ((fumbles * -1) + (rYards * 0.1) + receptions + (rTouchdowns * 6) + (rConversions * 2) + (cConversions * 2)+ (cYards * 0.1) + (cTouchdowns * 6));
		  }
		  
		  else {
			  score = ((fumbles * -1) + (rYards * 0.1) + (rTouchdowns * 6) + (rConversions * 2) + (pConversions * 2) + (cYards * 0.1) + (cTouchdowns * 6));
		  }
		  
		  scores.add(score);
		  System.out.println("Your HB's total score is: " + score);
		  
		  value = 100 - (100 * (pick / ((opponents + 1) * 15)));
		  
		  if (score <= 69.4) {
			  System.out.println("Your HB performed within the bottom quartile in the league.");
		  }
		  else if (score <= 99.7) {
			  System.out.println("Your HB performed within the bottom half of the league.");
		  }
		  else if (score <= 120.2) {
			  System.out.println("Your HB performed within the top half of the league.");
		  }
		  else {
			  System.out.println("Your HB performed within the top quartile in the league.");
		  }
		  
		  percent = (score/452.8) * 100;
		  System.out.println("Your HB's score was " + percent + "% highest among fantasy starters.");
		  
		  returnV = percent - value;
		  System.out.println("You valued this player at " + value + "%.");
		  if (percent >= value) {
			  System.out.println("This was a good pick.");
		  }
		  else {
			  System.out.println("This was a bad value pick.");
		  }
		  System.out.println("This player gave you " + returnV + "% value than expected.");
		  System.out.println();
	  }
	  else if (position.equals("WR") || position.equals("TE")) {
		  System.out.println("Enter the number of receptions caught: ");
		  receptions = s.nextDouble();
		  System.out.println("Enter the number of receiving yards caught: ");
		  cYards = s.nextDouble();
		  System.out.println("Enter the number of receiving touchdowns caught: ");
		  cTouchdowns = s.nextDouble();
		  System.out.println("Enter the number of 2 point conversions caught: ");
		  cConversions = s.nextDouble();
		  System.out.println("Enter the number of fumbles lost: ");
		  fumbles = s.nextDouble();
		  
		  if (ppr == true) {
			  score = ((fumbles * -1) + (cYards * 0.1) + receptions + (cConversions * 2) + (cTouchdowns * 6));
		  }
		  
		  else {
			  score = ((fumbles * -1) + (cYards * 0.1) + (cConversions * 2) + (cTouchdowns * 6));
		  }
		  
		  scores.add(score);
		  System.out.println("Your WR/TE's total score is: " + score);
		  
		  value = 100 - (100 * (pick / ((opponents + 1) * 15)));
		  
		  if (position.equals("WR")) {
			  if (score <= 63.3) {
			  System.out.println("Your WR performed within the bottom quartile in the league.");
		  }
		  else if (score <= 72.4) {
			  System.out.println("Your WR performed within the bottom half of the league.");
		  }
		  else if (score <= 115.6) {
			  System.out.println("Your WR performed within the top half of the league.");
		  }
		  else {
			  System.out.println("Your WR performed within the top quartile in the league.");
		  }
		if (ppr == true){
			percent = (score/439.5) * 100;
			System.out.println("Your WR's score was " + percent + "% highest among fantasy starters.");
			
			returnV = percent - value;
			  System.out.println("You valued this player at " + value + "%.");
			  if (percent >= value) {
				  System.out.println("This was a good pick.");
			  }
			  else {
				  System.out.println("This was a bad value pick.");
			  }
			  System.out.println("This player gave you " + returnV + "% value than expected.");
			  System.out.println();
		}
		else {
			percent = (score/294.5) * 100;
			System.out.println("Your WR's score was " + percent + "% highest among fantasy starters.");
			  
			returnV = percent - value;
			  System.out.println("You valued this player at " + value + "%.");
			  if (percent >= value) {
				  System.out.println("This was a good pick.");
			  }
			  else {
				  System.out.println("This was a bad value pick.");
			  }
			  System.out.println("This player gave you " + returnV + "% value than expected.");
			  System.out.println();
		}
			  
		  }
		  else {
			  if (score <= 25.8) {
				  System.out.println("Your TE performed within the bottom quartile in the league.");
			  }
			  else if (score <= 33.3) {
				  System.out.println("Your TE performed within the bottom half of the league.");
			  }
			  else if (score <= 57.2) {
				  System.out.println("Your TE performed within the top half of the league.");
			  }
			  else {
				  System.out.println("Your TE performed within the top quartile in the league.");
			  }
			  if (ppr == true){
					percent = (score/262.8) * 100;
					System.out.println("Your TE's score was " + percent + "% highest among fantasy starters.");
					
					returnV = percent - value;
					  System.out.println("You valued this player at " + value + "%.");
					  if (percent >= value) {
						  System.out.println("This was a good pick.");
					  }
					  else {
						  System.out.println("This was a bad value pick.");
					  }
					  System.out.println("This player gave you " + returnV + "% value than expected.");
					  System.out.println();
				}
				else {
					percent = (score/170.8) * 100;
					  System.out.println("Your TE's score was " + percent + "% highest among fantasy starters.");
					  
					  returnV = percent - value;
					  System.out.println("You valued this player at " + value + "%.");
					  if (percent >= value) {
						  System.out.println("This was a good pick.");
					  }
					  else {
						  System.out.println("This was a bad value pick.");
					  }
					  System.out.println("This player gave you " + returnV + "% value than expected.");
					  System.out.println();
		  }
		  
	  }
	  }
	  else if (position.equals("K")) {
		  System.out.println("Enter the number of field goals made: ");
		  fieldGoals = s.nextDouble();
		  System.out.println("Enter the number of extra points made: ");
		  extraPoints = s.nextDouble();
		  
		  score = ((fieldGoals * 3) + extraPoints);
		  scores.add(score);
		  System.out.println("Your K's total score is: " + score);
		  
		  if (score <= 93) {
			  System.out.println("Your K performed within the bottom quartile in the league.");
		  }
		  else if (score <= 111) {
			  System.out.println("Your K performed within the bottom half of the league.");
		  }
		  else if (score <= 124) {
			  System.out.println("Your K performed within the top half of the league.");
		  }
		  else {
			  System.out.println("Your K performed within the top quartile in the league.");
		  }
		  percent = (score/148) * 100;
		  System.out.println("Your K's score was " + percent + "% highest among fantasy starters.");
		  value = 100 - (100 * (pick / ((opponents + 1) * 15)));
		  
		  returnV = percent - value;
		  System.out.println("You valued this player at " + value + "%.");
		  if (percent >= value) {
			  System.out.println("This was a good pick.");
		  }
		  else {
			  System.out.println("This was a bad value pick.");
		  }
		  System.out.println("This player gave you " + returnV + "% value than expected.");
		  System.out.println();
	  }
	  else if (position.equals("DEF")) {
		  System.out.println("Enter the number of interceptions caught: ");
		  interceptions = s.nextDouble();
		  System.out.println("Enter the number of sacks made: ");
		  sacks = s.nextDouble();
		  System.out.println("Enter the number of safeties scored: ");
		  safeties = s.nextDouble();
		  System.out.println("Enter the number of touchdowns scored: ");
		  touchdowns = s.nextDouble();
		  System.out.println("Enter the number of fumbles recovered: ");
		  fumbles = s.nextDouble();
		  
		  score = ((interceptions * 2) + sacks + (safeties * 2) + (touchdowns * 6) + (fumbles * 2));
		  scores.add(score);
		  System.out.println("Your DEF's total score is: " + score);
		  
		  if (score <= 79) {
			  System.out.println("Your DEF performed within the bottom quartile in the league.");
		  }
		  else if (score <= 96) {
			  System.out.println("Your DEF performed within the bottom half of the league.");
		  }
		  else if (score <= 120) {
			  System.out.println("Your DEF performed within the top half of the league.");
		  }
		  else {
			  System.out.println("Your DEF performed within the top quartile in the league.");
		  }
		  percent = (score/156) * 100;
		  System.out.println("Your DEF's score was " + percent + "% highest among fantasy starters.");
		  value = 100 - (100 * (pick / ((opponents + 1) * 15)));
		  
		  returnV = percent - value;
		  System.out.println("You valued this player at " + value + "%.");
		  if (percent >= value) {
			  System.out.println("This was a good pick.");
		  }
		  else {
			  System.out.println("This was a bad value pick.");
		  }
		  System.out.println("This player gave you " + returnV + "% value than expected.");
		  System.out.println();
  }
  
  } while (answer == "Y");
  
  for (Double d : scores)
	  total +=d;
  System.out.println("The list of combined scores for your team: " + scores);
  System.out.println("Your total fantasy score: " + total);

 }
 }