/*I: Re-state the problem with your own words
  sort stack using only another stack
D: Define your goals; state the format of your solution
    sort stack using only another stack cannot use anything but stack, stack has push pop peek isempty
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
    s = {8,2,4,5,9,3,1}
	
	s = {2,4,5,9,3,1}2 needs to be after 8
	s2 = {8}
	int  t = 2, s = {8,4,5,9,3,1}
	s2 = {2}
	
  Step 2: Write down what you did
    int holds temp smaller var till isempty or smaller pushes to s2, when s2 has all vars, pop push s2 to s so that smaller numbers are at top, like a similar to the solution to the queueu from stacks probem
  Step 3: Find Patterns
    use stacks as queues, push smallest numbers to top of second queue
  Step 4: Check by hand
    s = {1,4,3,2}
	s2 = {}
	s2 = {1}, s = {4,3,2}
	s2 = {4,1}, s= {3,2}
	3 < 4
	int t = 3
	s = {4,2} s2 = {1}
	3>1
	s2 = {3,1}
	s2 = {4,3,1}, s = {2}
	2 < 4
	int t = 2
	s = {4} s2 = {3,1}
	2 < 3
	s = {3,4} s2 = {1}
	2 > 1
	s2 = {2,1}, s = {3,4}
	s2 = {3,2,1} s = {4}
	s2 = {4,3,2,1} s = {}
	pop push all to s
	s2 = {}, s = {1,2,3,4}
	return s = {1,2,3,4}
  Step 5: Translate to Code
*/

/*  Step 6: Run Test Cases

  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 what is a data structure, we can use only one more stack and no other structure, an int value is not considered a structure, this means we can use 
*/