Feature: Truck Insuarance 
Scenario: Verify user can buy a insurance for truck


#Given Browser is Open and "url=http://sampleapp.tricentis.com" is entered
And User clicks on truck link and provide all vehicle details and clicks on next button
And User enter insurant data and clicks on next botton
And user enter all product data and clicks on next button
And user select choise of price option and clicks on view quote button
When user enters mailing valid data and clicks on next button
Then user is promted with sending email success message
And user clicks on ok button of successfull message board
And user clicks on home button at footer page to land on home page