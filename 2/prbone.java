/*I: Re-state the problem with your own words
	remove for duplicates on a linked list
D: Define your goals; state the format of your solution
  I want to check that each node is unique
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
    45, 46, 47, 48, 49 = 45, 46, 47, 48, 49 
	45, 46, 47, 48, 45, 46, 47, 48 = 45, 46, 47, 48,
  Step 2: Write down what you did
    if a piece of data is seen for the second time it is ignored.
  Step 3: Find Patterns
    if variable is seen more than once skip the variable, leave first of type alone
  Step 4: Check by hand
	ab , abc, abcd, abc
	ab
	ab , abc
	ab , abc, abcd
	ab , abc, abcd, abc => ab , abc, abcd
	ab , abc, abcd
  Step 5: Translate to Code
*/

/*  Step 6: Run Test Cases
	
  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 start a new list, add unseen variables to the list, if the list already has a variable do not add said variable, return new list.
*/