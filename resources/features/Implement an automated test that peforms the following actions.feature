Feature: PWC Automation Testing Challenge - Bragadeesh Murthy 

Background: 
	Given I navigate to the PwC Digital Pulse website 
	
@pwcTestChallenge 
Scenario: carousel functionality 
	Then I am presented with a carousel displaying 3 featured articles 
		|Articles|
		|Human behaviours: Understanding decision making for a successful cyber strategy|
		|Leading the way through a digital transformation|
		|101: Predicting the future with digital twin technology|
	And click on "Next" button 
	Then I am presented with a carousel displaying 3 featured articles 
		|Articles|
		|How to redefine employee experience for the post-pandemic world|
		|Being brave: Customer behaviour, consumption and expectations and COVID-19|
		|Preventative measures: How your tech, legal and risk functions should prepare for a cyber attack|
	And click on "Previous" button 
	Then I am presented with a carousel displaying 3 featured articles 
		|Articles|
		|Human behaviours: Understanding decision making for a successful cyber strategy|
		|Leading the way through a digital transformation|
		|101: Predicting the future with digital twin technology|
		
@pwcTestChallenge 
Scenario: Contact Us Link Verification 
	Then click on hamburger menu 
	When I select "Contact us" from the hamburger menu 
	And I am presented with the below options for contacts 
		|Heading                     |Contact Link                                      |
		|PwC Digital Services        |https://digital.pwc.com/en/contact-us.html        |
		|Digital Pulse editorial team|                                                  |
		|Careers at PwC              |https://www.pwc.com/gx/en/careers.html            |
		|General enquiries           |https://www.pwc.com/gx/en.html                    |
		
@pwcTestChallenge 
Scenario: Verify Search Result Functionality 
	When I click on the "Magnifying glass" icon to perform a search 
	And I enter the text "Single page applications" and search 
	And I am presented with at least 1 search result 
    