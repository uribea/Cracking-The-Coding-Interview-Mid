/*
I: Re-state the problem with your own words
	delete node that is given in the middle of the list
D: Define your goals; state the format of your solution
	remove current node, nodes only have access to next node
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
	Step 1: Work some small instances by hand
		aa, ba, fa, de : fa = aa, ba, de
		aa, ba, fa, de, ata, b, a, ded : ata = aa, ba, fa, de, 	b, a, ,ded
	Step 2: Write down what you did
		the given node must be removed only next nodes are visible we cannot actually remove this node 
	Step 3: Find Patterns
		make this node the next node, remove next node
	Step 4: Check by hand
		aa, ba, fa, de : fa
		fa = de
		aa, ba, de, de
		de next remove
		aa, ba, de
  Step 5: Translate to Code
*/

/*  Step 6: Run Test Cases

  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 assuming its a singly linked list, we have to remove a node, we cannot remove the node we are on as we do not have prev. we can only remove the next node. to remove next node without removing it we must make this node a copy of the next node, then the removal of the next node will have accomplished the same goal
*/