/*
I: Re-state the problem with your own words
	seperate a linked list into two sides, one greater than or eual to the chosen number the other less than the chosen number.
D: Define your goals; state the format of your solution
	partition a linked list according from var x 
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
    1 -> 4 -> 5 -> 2 -> 3 : 2 = 1 -> 2 -> 5 -> 4 -> 3
	1 -> 4 -> 5 -> 2 -> 3 -> 7 -> 8 -> 9 : 5 = 1 -> 2 -> 3  -> 4 -> 5 -> 7 -> 8 -> 9
  Step 2: Write down what you did
    find characters smaller than the linked list and add them to the front of the linked list before removing them from their prior location
  Step 3: Find Patterns
    if smaller than x move to front of linked list something like new node t = n<x , t.next = head;
  Step 4: Check by hand
    1 -> 4 -> 5 -> 2 -> 3 : 3 
	1 -> 4 -> 5 -> 2 -> 3
	2 -> 1 -> 4 -> 5 -> 3
	return 2 -> 1 -> 4 -> 5 -> 3
  Step 5: Translate to Code
*/
/*  Step 6: Run Test Cases

  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 read problem, asked for input was recommended to make two lists one greater or equal and one less, realized i could add smaller numbers directly to front of the list as it is a listthen did that
*/