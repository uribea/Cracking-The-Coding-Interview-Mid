/*I: Re-state the problem with your own words
	check if String can be palindrome
D: Define your goals; state the format of your solution
	what are the rules of a palindrome, write formula for it, check if permutations means a boolean check method
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
	
  Step 1: Work some small instances by hand
    "tact cao" = true
	"dog food lid" = false
	"plow lwp" = true
  Step 2: Write down what you did
    must have even number of any type of characters and no more than one of any odd numbered count of characters, not counting spaces
  Step 3: Find Patterns
    return false if more than one character is found an odd number of times
  Step 4: Check by hand
    "tact cao" = t = 2
				 a = 2
				 c = 2 
				 o = 1
  Step 5: Translate to Code
*/
public class prbfour {
	public static void main (String[] args){
		String str = "tact cao";
		System.out.println(unique(str));
		str = "plow lpw";
		System.out.println(unique(str));
		str = "dog food lid";
		System.out.println(unique(str));
		
	}
	public static boolean unique(String str){
		
		boolean[] uni = new boolean[255];
		for(int i = 0; i< str.length(); i++){
			int n = str.charAt(i);
			if(n != (int)' ')
			uni[n] = !uni[n];			
		}
		int t = 0;
		for(int i = 0; i<uni.length; i++){
			if(uni[i])
				t++;
			if(t == 2)
				return false;
		}
		return true;
	}
}
/*  Step 6: Run Test Cases
		true
		true
		false
  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	
*/