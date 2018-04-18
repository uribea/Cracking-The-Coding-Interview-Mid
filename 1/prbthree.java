/*I: Re-state the problem with your own words
	replace all spaces with %20
D: Define your goals; state the format of your solution
	replace spaces with %20 keep word order
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
	Step 1: Work some small instances by hand
		"ret fort" = "ret%20fort"
		"poet weak" = "poet%20weak"
	Step 2: Write down what you did
		replace spaces with a %20
	Step 3: Find Patterns
		" " = "%20"
	Step 4: Check by hand
		"ret fort poor"
		"ret" + "%20" + "fort" + "%20" + "poor"
	Step 5: Translate to Code
*/
public class prbthree {
	public static void main (String[] args){
		String str = "abc def a";
		System.out.println(unique(str));
		str = "as dvb nm";
		System.out.println(unique(str));
		str = "zxcvbnmasdfg  hjklqwertyuiopp  ";
		System.out.println(unique(str));
		
	}
	public static String unique(String str){
		String s = null;
		String[] uni = str.split(" ");
		for(int i = 0; i< uni.length; i++)
			if(s==null)
				s = uni[i];
			else if(i <= uni.length )
				s+="%20" + uni[i];
			else
				s += uni[i];
		return s;

	}
}
/*  Step 6: Run Test Cases
		abc%20def%20a
		as%20dvb%20nm
		zxcvbnmasdfg%20hjklqwertyuiopp
	Step 7: Debug Failed Test Cases
		will ignore all spaces at end of string 
L: Reflect on the whole problem-solving process you went though, and state what you learned 
	realized that strings can be split, if we append a %20 after each word addition then we should solve for almost all conversions
*/