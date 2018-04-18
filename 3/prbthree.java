/*I: Re-state the problem with your own words
  make stacks of limited size that still work as a singular stack 
D: Define your goals; state the format of your solution
  make an arraylist of stacks and a counter for the size of the stacks along with a max size variable. 
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
   arr{s}, s = 1,2,3,4
   arr{s,s2}, s = 1,2,3,4 s2 = 1,8,4,1
   arr{s,s2,s3}, s = 1,2,3,4, s2 = 1,8,4,1, s3 = 1,4,9,4
  Step 2: Write down what you did
    when stack size reches max, make new stack use new stack till empty or full, if full make new stack, if empty go to previous stack
  Step 3: Find Patterns
    we can tell if stack is empty, a size counter for the stacks need only be implemented once a if its full its equal to the max size, if its empty its equal to zero, we can add and remove stacks
  Step 4: Check by hand
    arr{s}, mx = 2, c =0
	s = {1} c = 1
	s = {2,1} c = 2
	arr{s,s2} c = 0
	s2 = {3} c = 1
	s2 = {4,3} c =2
	arr{s,s2, s3} c = 0
	pop, c = 0, arr -1, pop 
	s2 = {1}
	arr = {s,s2}
  Step 5: Translate to Code
*/

/*  Step 6: Run Test Cases
		
  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 im not sure if we can make stacks of stacks, but we can certainly make stack of array lists, with this as long as a counter is runnin we can simulate a stack of stacks, and even use it somewhat like the extra question which asks to remove from a specific stack 
*/