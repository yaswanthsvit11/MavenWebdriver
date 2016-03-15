Feature: About Testers

In order to get a high Paid Job
As a tester
I want to learn Automation

Scenario Outline: I am a Manual Tester
Given I am a "<testerType>" Tester
|	Location	|	Position	|
|	USA			|	Contract	|
|	India		|	Permanent	|
When I apply for a job
Then I got "<value>" paid job
And I am "<checkValue>" satisfied with my salary
But my parents are "<value>" satisfied

Examples:

	|	testerType	| value	|	checkValue	|	value	|
	|	Manual		| less  | 	Low			|	low		|
	|	Automation	| very	|	very		|	much	|