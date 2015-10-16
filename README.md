Michael Gibbons Project 2 Answers to Questions Throughout Code.

Through testing each Array List and Linked List at different sizes in the TestPerformance.java file it is easily seen what structure is faster for which situation. The Linked list performed much faster than the Array List for adding/removing to the list. With a size of 10,000 the array list took 4.49s to complete while the linked list only took 1.178s. This makes sense because the array list will have to shift every index up one if inserting in the middle. A linked list needs just to change what the index points to. However, when it comes to just accessing a certain element, Array lists are much faster than linked lists. For a size of 10,000, it took the linked list 4.548s but the array list took only 1.102s.

                  Size  10     100    1000   10000

Linked List Add/Remove: 1.132, 1.241, 1.200, 1.178

Array List  Add/Remove: 1.148, 1.207, 1.466, 4.490

Linked List Access    : 1.117, 1.141, 1.404, 4.548

Array List Access     : 1.140, 1.100, 1.115, 1.102