# cs480_calculator

Assignment 1 for CS 480 Software Engineering.
Estimated development time: 6 hours.

Started: Sunday -  1:45 - Requirements Analysis & Design.
			- Wrote small description of classes.
			- Set up Git

	 Sunday -  2:07 - Development
			- Set up GUI design.

Stopped: Sunday -  2:35 - Had to greet visiting relatives.
Started: Sunday -  2:50 - Development
		   3:00	- Found bug. Buttons not appearing until mouseover
		   3:15	- Found bug. Display sizes not appearing correctly.
Stopped: Sunday -  3:20	- Bugs probably with java on this old laptop. Will resume development on desktop.


Started: Tuesday - 8:37pm
Stopped: 	 - 9:10 pm - slacking off			
Started: 	 - 9:48 pm
Stopped: 	 - 11:58 pm - done				

Started: Wednesday 1:30 pm - testing
			   - found bugs
		           - fixed bugs
Stopped: Wednesday 2:20 pm - DONE				

TOTAL DEVELOPMENT TIME: 4.9 hours

Class Descriptions:
	Calculator 
		add, subtract, multiply and divide methods.
	CalculatorGui 
		Simple design like windows calculator 
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
	JComponents not appearing until mouseover.
		Solved: Don't call setVisible(true) until after all components initialized
	Could input multiple decimal places in number
		Solved: Check if decimal place already inserted in DigitRestrictedDocument
	Clicking any operation button with no number input will throw exception
		Solved: Exception checking. Added override text for display.
	Could not display zeroes.
		Solved: Allowed ascii value for zero in digit restricted document.
	Number input with no operation would throw exception
		Solved: Equals now returns same number if no operation selected.
	Negative numbers not displayed
		Solved: Added hyphen to ascii values allowed


Conclusion: Surprisingly my estimated time was greater than the amount of time that I actually spent working on the project. It still was off by almost 20%, which is not very accurate. This exercise was a good example of how difficult it is to estimate the required time for a software project.