package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		int sol;

		sol = num1*num2;

		return num1 + " x " + num2 + " = " + sol;
	}

	public static int findBrokenEgg(List<String> eggs) {
		int e = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int e = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)==true) {
				e++;
			}
		}
		return e;	
	}

	public static double findTallest(List<Double> peeps) {
		int tallest = 0;

		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > peeps.get(tallest)) {
				tallest = i;
			}
		}

		return peeps.get(tallest);
	}

	public static String findLongestWord(List<String> words) {
		int longest = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()>words.get(longest).length()) {
				longest = i;
			}
		}

		return words.get(longest);
	}

	public static boolean containsSOS(List<String> message) {
		if (message.contains("... --- ...")) {
			return true;
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> scores) {
		for(int i = 0; i < scores.size(); i++) {
			for(int j = i+1; j<scores.size(); j++) {
				if(scores.get(i) > scores.get(j)) {

					double temp = scores.get(i);
					scores.set(i, scores.get(j));
					scores.set(j, temp);
				}
			}
		}
		return scores;
	}

	public static List<String> sortDNA(List<String> dnas){
		for (int i = 0; i < dnas.size(); i++) {
			for (int e = i + 1; e<dnas.size(); e++) {

				if (dnas.get(i).length() > dnas.get(e).length()) {
					String temp = dnas.get(i);
					dnas.set(i, dnas.get(e));
					dnas.set(e, temp);
				}
			}
		}

		return dnas;
	}

	public static List<String> sortWords(List<String> words){
		for (int i = 0; i < words.size(); i++) {
			for (int e = i + 1; e<words.size(); e++) {
				if (words.get(i).compareTo(words.get(e)) > 0) {
					String temp = words.get(i);
					words.set(i, words.get(e));
					words.set(e, temp);

				}
			}
		}

		return words;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num/2; i++) {
			if (num%i==0) {
				return false;
			}
		}


		return true;
	}

	public static boolean isSquare(int num) {
		for (int i = 0; i < num+1; i++) {
			if (i*i == num) {
				return true;
			}
		}
		return false;
	}


	public static boolean isCube(int num) {
		for (int i = 0; i < num+1; i++) {
			if (i*i*i == num) {
				return true;
			}
		}
		return false;
	}
}
