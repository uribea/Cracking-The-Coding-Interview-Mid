/*I: Re-state the problem with your own words
	make a queue using two stacks.
D: Define your goals; state the format of your solution
  stacks are first in last out queues are last in last out, push everything to first stack, pop and push from there to second stack, any po from second stack wil now be in queue format
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
    push{4->3->2->1}
	s = {1,2,3,4} s2 = {}
	s = {}, s2 = {4,3,2,1}
	pop.s2() = 4;
	
  Step 2: Write down what you did
    put all values in first stack, use first stack to second stack after filling it, second stack acts as queue 
  Step 3: Find Patterns
    full stack pushed to another stack will return queue form of stack addition.
  Step 4: Check by hand
	s={1}
	s = {2,1}
	s2 = {2}
	s2 = {1,2}
	s2 now formatted as queue
  Step 5: Translate to Code
*/

/*  Step 6: Run Test Cases
		
  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 this method only works if all varaible are pushed before trying to use combination of stacks as a queue but two stacks can easily pass as a queue if used correctly.
 */