/*I: Re-state the problem with your own words
	check if strings are permutations or strings contain same characters and size
D: Define your goals; state the format of your solution
	compare characters to ensure that every value within the the first string is 1 to 1 with the other string
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
		"pled" "ledp" = true
		"please" "notyou" = false
		"for" "fort" = false
		
	Step 2: Write down what you did
		compare string sizes, then compare values within each string
	Step 3: Find Patterns
		if they can be reorganized into eachother without leftovers then its true
  Step 4: Check by hand
    "pled" "ledp"
	p = p t
	l = l t
	e = e t 
	d = d t
	
  Step 5: Translate to Code
*/
public class prbtwo {
	public static void main (String[] args){
		String str = "abcdefa";
		String b = "faabcde";
		System.out.println(unique(str, b));
		str = "asdvbnm";
		b = "zxcvbnmasdfghjklqwertyuiopp";
		System.out.println(unique(str, b));
		//System.out.println(unique(str));
		
	}
	public static boolean unique(String str, String b){
		if(str.length() != b.length())
			return false; //chars are 1 bit
		boolean[] uni = new boolean[255];
		for(int i = 0; i< str.length(); i++){
			int n = str.charAt(i);
			uni[n] = !uni[n];
			int j = b.charAt(i);
			uni[j] = !uni[j];
			
		}
		for(int i = 0; i<uni.length; i++)
			if(uni[i])
				return false;
		return true;
	}
}
/*  Step 6: Run Test Cases
		true
		false
  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 thought of problem and requirments that show true, decided boolean array would work fine as any combination of two words if "equal" will return all false. 
*/