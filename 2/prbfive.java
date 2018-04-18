/*I: Re-state the problem with your own words
	add numbers retrieved from linked list with first number seen of each list being the smallest
D: Define your goals; state the format of your solution
  we can add node data to a string with string s = data+s and then parse the string to an int
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
    5->7->8 + 9->4->3 = 1224
  Step 2: Write down what you did
    put the numbers with largest first and do normal integer addition
  Step 3: Find Patterns
    we add new numbers to string but since normal integer has revere order of given data we add to the front of the string
  Step 4: Check by hand
     5->7->8 + 9->4->3
	 s = ""
	 s2 = ""
	 s = 5 
	 s = 75
	 s = 875
	 s2 = 9
	 s2 = 49
	 s2 = 349
	 int i = 875
	 int i2 = 349
	 return (i+i2) = 1224
  Step 5: Translate to Code
*/

/*  Step 6: Run Test Cases
		false
		true
		false
  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 thought of problem and requirments that show true, realized innate rules of programming languages, ran ideas through tested them.
*/