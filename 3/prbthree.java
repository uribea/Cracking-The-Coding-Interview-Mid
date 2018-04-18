/*I: Re-state the problem with your own words
  make method to check that all chars in char array are unique
D: Define your goals; state the format of your solution
  i want to check char by char to ensure all chars are unique
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
    AA = flase
    ABC = true
    ABCA = false
  Step 2: Write down what you did
    if a character matches a previous character then the answer is false
  Step 3: Find Patterns
    if var seen twice return false
  Step 4: Check by hand
    AtBtCtAf = f
    AtAf = f
    AtBtCt = t
  Step 5: Translate to Code
*/
public class prbthree {
	public static void main (String[] args){
		String str = "abcdefa";
		System.out.println(unique(str));
		str = "asdvbnm";
		System.out.println(unique(str));
		str = "zxcvbnmasdfghjklqwertyuiopp";
		System.out.println(unique(str));
		
	}
	public static boolean unique(String str){
		if(str.length() > 255)
			return false; //chars are 1 bit
		boolean[] uni = new boolean[255];
		for(int i = 0; i< str.length(); i++){
			int n = str.charAt(i);
			if(uni[n])
				return false;
			uni[n] = true;
		}
		return true;
	}
}
/*  Step 6: Run Test Cases
		false
		true
		false
  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 thought of problem and requirments that show true, realized innate rules of programming languages, ran ideas through tested them.
*/