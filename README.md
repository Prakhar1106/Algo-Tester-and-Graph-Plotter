# Algo-Tester-and-Graph-Plotter

- An Algo Tester and Graph Plotter is a software developed using Java Swing technology to demonstrate the actual execution of various algorithms used in computer graphics and numerical methods. 
- The application provides graphical representation of the execution of C.G. algorithms related to circle drawing, line drawing, various transformations 
- Another section of Numerical Method related algorithms includes, Interpolation and Extrapolation, Root Finding Algorithm and Simultaneous Linear Equation solving algorithms.
- The proposed system is flexible and user friendly. The end-user who is related to mathematics or computer science field can operate this calculator very easily.
- The end users of this application may be scientists, researchers, CS or math students, computer science teachers. In short, anybody related to CS or mathematics field.

# Objective
1.	To represent real time execution of graphical algorithms on the user’s screen.
2.	Real time plotting of graph of polynomial equation and transformaions. 
3.	To integrate various graphical and mathematical algorithms into one system.
4.	To make system easy to use with increased accuracy and effectiveness.
5.	To validate the input given by the user.
6.	To provide better interface to the user so that he/she doesn’t face any difficulty to understand the working of system.

# Data Flow Diagram
<img src="https://github.com/Prakhar1106/Algo-Tester-and-Graph-Plotter/blob/main/Numerical%20Integrato%20v2.0/Project%20pics/level%200%20dfd.png" width="800" height="500">
<img src="https://github.com/Prakhar1106/Algo-Tester-and-Graph-Plotter/blob/main/Numerical%20Integrato%20v2.0/Project%20pics/level1.png" width="800" height="500">
<img src="https://github.com/Prakhar1106/Algo-Tester-and-Graph-Plotter/blob/main/Numerical%20Integrato%20v2.0/Project%20pics/Level1NM.png" width="800" height="500">

## User Interface

<img src="https://github.com/Prakhar1106/Algo-Tester-and-Graph-Plotter/blob/main/Numerical%20Integrato%20v2.0/Project%20pics/ProjectGUIDE.jpg" width="800" height="500">

## System Design

The aim of the design phase is to transform the requirements specified in the SRS document into a structure that is suitable for implementation in some programming language.
Based on the above requirements analysis and SRS document the system design is to prepared
The system design as per the requirement analysis of this project should comprises of have three module:
This system can only be used by Scientists or mathematics field person. They can use this application easily by simply clicking on their required module and enter required information. 

### Root of equation Module:
To find root of equation through this application, user simply has to click on ‘Root of equation’ button from the side panel.
Next step is to enter coefficients of the equation.
This module supports up to 3 degrees of equation solving. 
If user wants to calculate root of quadratic equation, then he/she only has to put ‘0’ in coefficient of x cube.
User is allowed to enter numeric values only.	
Here I implemented Bisection method, Regular Falsi Method, and Newton Raphson Method to solve the given equation.
User also has to select method from which he wants to calculate his answer.


### Interpolation Module:
Interpolation module firstly accept number of data which user want to enter. After pressing submit, entered number of text fields will appear (‘n’ text fields for both X and Y), where user have to fill data value of X and Y. Now, user has to enter value of X for which value of Y is needed. After filling all the information, press ‘calculate’. 
If there is any mistake while entering data then this application give appropriate warning to the user.
This module supports max 20 data entry text fields.
In this module, I used Newton’s Forward and Backward interpolation formula and my program automatically detects where to use forward Interpolation and where to use backward interpolation formula. 

### Simultaneous Linear Equation:
Here, this module firstly requires number of equations to solve. After entering number of equation. It displays such number of empty boxes (if user enter 3, then 12 boxes will created). After entering data, it will calculate ‘n’ unknowns.      
User is allowed to enter numeric values only. Otherwise it will show warning.
Here I used gauss elimination method to find the values of unknowns.
 
### Line Generation Module
Here, this module requires end points of a line to plot on graph in the format of pixel. After then user has to select algorithm either DDA Line generation or Bresenham’s Line Generation algorithm.  
User is allowed to enter numeric values only. Otherwise it will show warning.

### Circle Generation Module
In this module, user has a choice to plot circle in two different ways: 
1)	Through Center and radius of circle.
2)	Through concyclic points.
In first, simply user has to input center and radius of circle. And in second, user has to enter any three points that lie on circle. After choosing method, then user has to opt algorithm, either midpoint circle generation or bresenham’s circle generation algorithm.
User is allowed to enter numeric values only. Otherwise it will show warning.

### Tranformation Module
This is very interesting module. Here we can perform 2D transformations i.e. translation, rotation, scaling, and shearing of given polygon.
In this module, user firstly has to enter coordinates of polygon on which transformation has to perform.
Now if user wants to perform translation then he has to provide translation parameter (Tx , Ty). and if user want to apply another transformation on the resulting polygon of previous transformation, then user only has to click on ‘Use previous values’ button and then give parameters of transformation to be performed.
User is allowed to enter numeric values only. Otherwise it will show warning.

### Graph Plotter:
This is also very interesting module, here one can plot graph of any algebraic and transcendental function.
Here user can plot algebraic equation graph, sine, cosine, tangent, logarithm, exponential graph by only giving function parameter value

# ScreenShots

<img src="https://github.com/Prakhar1106/Algo-Tester-and-Graph-Plotter/blob/main/Numerical%20Integrato%20v2.0/Project%20pics/LineDraw.JPG" width="800" height="500">
<img src="https://github.com/Prakhar1106/Algo-Tester-and-Graph-Plotter/blob/main/Numerical%20Integrato%20v2.0/Project%20pics/LineDrawGraph.JPG" width="800" height="500">

