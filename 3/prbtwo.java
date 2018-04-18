/*I: Re-state the problem with your own words
	keep track of smallest number in a stack
D: Define your goals; state the format of your solution
  stack only has push and pop methods, we want to know the minimun number of the stack at all times.
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
	{8} min =8	
	{5,8} m = 5
	{9,5,8} m = 5
	{1,9,5,8} m = 1
	{9,5,8} m = 5
  Step 2: Write down what you did
    change min as you see smaller number added or removed from stack 
  Step 3: Find Patterns
    if smaller number pushed change smaller number, if smaller number popped revert, easy if you make another stack which keeps only pushes smaller numbers, and when the peekable number on the stack is popped on the normal stack it is also popped on the min stack
  Step 4: Check by hand
    s={8} m = {8}
	s={5,8} m = {5,8}
	s={9,5,8} m = {5,8}
	s={1,9,5,8} m = {1,5,8}
	s={9,5,8} m = {5,8}
  Step 5: Translate to Code
*/

/*  Step 6: Run Test Cases

  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 many solutions can be simplified with stacks, this is something we learned in automata and the whole concept of push down automaton. we use multiple stacks to answer this problem.
*/