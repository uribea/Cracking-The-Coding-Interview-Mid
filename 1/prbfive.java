/*I: Re-state the problem with your own words
	check if only one or no changes are needed to make one word equal to another
D: Define your goals; state the format of your solution
	count additions subtractions, and swaps
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
		"pale" "ple" = 1 true remove
		"pl" "pale" = 2 false 
		"baked" "pake" = 2 false replace remove
		"pale" "elap" = 4 false replace 4
		"pat" "pale" = 2 false replace and insert
  Step 2: Write down what you did
		if length differences > 1 false, check for word order, check to see whether the second word can be built by ading or removing another word, if same size only check for char location differences 
  Step 3: Find Patterns
		might have same characters but at locations not reachable by a simple insert or remove, if same size then only check on differing characters is needed, but due to 1 character change availability more work is required, if at difference, next char on longest string is not equal to this char on smaller string the false.
  Step 4: Check by hand
    "pale" "ple" 
	p = p
	a != l
	l != e
	e 
	due to differing sizes check must be done for smaller word at location i+1
	p = p 
	a != l 	
	l = l 
	e = e
	
  Step 5: Translate to Code
*/
public class prbfive {
	public static void main (String[] args){
		String str = "abcdefa";
		String b = "fabcdef";
		System.out.println(unique(str, b));
		str = "asdvbnm";
		b = "asdv";
		System.out.println(unique(str, b));
		str = "asdvb";
		b = "asdv";
		System.out.println(unique(str, b));
		
	}
	public static boolean unique(String str, String b){
		if(Math.abs(str.length()-b.length()) > 1)
			return false; //chars are 1 bit
		//rest of code recovered from cracking the coding interview book 
		/*String s = str.length()<b.length() ? str : b;
		String l = str.length()<b.length() ? b : str;
		
		int i = 0;
		int j = 0; 
		boolean dif = false; 
		while (j < l.length() && i < s.length()) {
			if (s.charAt(i) != l.charAt(j)) 
			{
				if (dif) return false;
				dif = true; 
				if (s.length() == l.length()) {
					i++; 
				} 
				else { i++; 
				} 
				j++; 
			} 
			return true; 
		}
	}		
/*  Step 6: Run Test Cases
		
  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 look at problem and solve it by hand, think of requirements that you checked for  and do it conciously. think of ways to implement your thought process into code, what does your code need to check for, how do you see the problem.
*/