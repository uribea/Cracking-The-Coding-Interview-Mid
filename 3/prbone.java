/*I: Re-state the problem with your own words
  make three stacks in one array
D: Define your goals; state the format of your solution
  stacks are first in first out, we need a counter to keep track of where the last stack variable is located for each of the three stacks within the array.
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
    st = {1,2,3}
	st2 = {1,2,4}
	st3 = {1,2,7,9,1} array should be 3*(MAth.max(st.length,st2.length,st3.length))
	arr = {n=1,2,3 ... 14}
	arr = {1,2,3,0,0,1,2,4,0,0,1,2,7,9,1}
  Step 2: Write down what you did
    we add stacks to the array limiting each to the max size of the largest stack. we basically add 3 program counters that start where the stacks stop adding to the array but each stack starts adding to the array a 0*max, 1*max, 2*max, when we remove we retunr number at responsible pc and subtract 1 from the pc until the pc is equal to its initial value.
  Step 3: Find Patterns
    keep track of initial values then increment or decrement values as needed
  Step 4: Check by hand
    
  Step 5: Translate to Code
*/

/*  Step 6: Run Test Cases

  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 this problem made me think about how memmory works in a computer, this program though is able to have multiple "program counters" because it is not hte main computer and is actually just a slow clunky not as usefull computer used to treat an array as multiple stacks.
*/