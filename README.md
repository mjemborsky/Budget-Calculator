# Budget-Calculator

Budget Calculator (Due 11/27)

The user enters total revenue, the program takes out taxes and employee salaries. Users can add sections they want to put money toward and then choose what percent of their after-taxes revenue they want to put their money toward

Methods
Calculate Revenue
Calculate sub area (percentage * revenue after salaries and taxes)


Employee

Option 1
Employee (super)
This will include drop-down input areas for the user to enter further information, for example, if it's the commission they will have to enter the total amount of sales and their commission rate. If it's hourly it's the number of hours they worked and their hourly rate.
Sub Classes
Commission
Salary
Hourly

Option 2
Employee (super)
This option will allow the user to input what positions make what amounts, their hourly rate, or their commission rate before they run their monthly revenue budget. Stores the information for future uses of the program so every month, so the user doesn't need to input the same information. They will only enter the number of hours or their revenue (for hourly or commission). This info can be changed in the menu. 
Sub classes
Manager
Hourly Employee
Custodian
	



Calculate Revenue Method

totalRevenue: User entered value
taxRate: User entered value through a slider

afterTax = totalRevenue - (totalRevenue * taxRate)

afterTax will be used as the total number of money for expenditures for the pie graph

Add Section

One we will need to find out. User can click on a “+” symbol and add a new empty section that has black space for a name to be entered as well as a slider for percent. This will also be needed to be placed into the pie graph

UI
Portrat Mode
Menu?
Maybe have the main business calculator and depending if it is easy we can duplicate it and create a personal budget maker. Same thing just more preset fields
Stages
Will need 2 scenes (menu and calculator portion)
