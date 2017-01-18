# cs480_calculator

Assignment 1 for CS 480 Software Engineering.
Estimated development time: 6 hours.

Started: Sunday - 1:45  - Requirements Analysis & Design.
			- Wrote small description of classes.
			- Set up Git
			- Wrote requirements?

	 Sunday - 2:07 	- Development
			-Set up GUI design.

Stopped: Sunday 2:35 	- Had to greet visiting relatives.
Started: Sunday 2:50 	- Development
		3:00	- Found bug. Buttons not appearing until mouseover
		3:15	- Found bug. Display sizes not appearing correctly.
Stopped: Sunday 3:20	- Bugs probably with java on this old laptop. Will resume development on desktop.




Calculator Class with add, subtract, multiply and divide methods.
Gui class looks like iphone one. Simple. 
Don't allow long expressions all at once. 
Don't have to worry about PEMDAS. 
Use Java Swing.
Constant window size.

Requirements:
	Add
	Subtract
	Mult
	Divide


Bugs found:
	JButtons not appearing until mouseover.
		Solved: Removed setLayout(null) on top level JFrame.
		Didn't actually solve.