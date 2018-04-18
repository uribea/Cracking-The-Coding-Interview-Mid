/*I: Re-state the problem with your own words
	retrieve element at length - k in a linked list
D: Define your goals; state the format of your solution
	first find length of linked list the subtract k from the length. move through the linked list n = length -k times and return element
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
  
  Step 1: Work some small instances by hand
    aa, ba, fa, de 2 = fa 
	aa, ba, fa, de, ata, b, a, ded 4 =ata  
  Step 2: Write down what you did
    find end of lined list get length-k element
  Step 3: Find Patterns
    go through list once, get length
	go through nodes length-(k-1) times return result
  Step 4: Check by hand
    aa, ba, fa, de 2
	aa, ba, fa, de = 4
	4-(2-1) = 3
	1.aa
	2.ba
	3.fa
	return fa
	
  Step 5: Translate to Code

/*  Step 6: Run Test Cases

  Step 7: Debug Failed Test Cases

L: Reflect on the whole problem-solving process you went though, and state what you learned 
	 thought of the physical solution, you see a list, you go to the end and you erase the length-kth node on th list. this does not transfer directly to the computer as five minus 2 is three, but the second to last node is five minus (2-1) which is why the final returned node is length-(k-1)
*/