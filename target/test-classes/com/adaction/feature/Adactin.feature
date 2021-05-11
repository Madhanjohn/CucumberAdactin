Feature: Hotel Booking In Adactin Application
Scenario: User Login Fuctionality
Given user Launch The Application
When user Enter The UserName In UserName Field
And user Enter The Password In Password Field
Then user Click On The Login Button And It Navigate To Search Hotel Page

Scenario: User Searching Hotel
When user Select The Location
When user Select The Hotel
When user Select The Room Type
When user Select The Number Of Rooms
When user Enter The Check In Date
When user Enter The Check Out Date
When user Select Adult Person Number Per Room
When user Select Children Person Number Per Room
Then user Click On The Search Button And It Navigate To Select Hotel Page

Scenario: User Select The Hotel
When user Select the Hotel
Then user Click On The Continue Button And It Navigate To Book A Hotel Page

Scenario: User Booking The Hotel
When user Enter The First Name In First Name Field
When user Enter The Last Name In Last Name Field
When user Enter The Billing Address In Billing Address Field
When user Enter The Credit Card Number In Credit Card No Field
When user Select Credit Card Type In Credit Card Type Field
When user Select Expiry Date In Expiry Date Field
When user Select Expiry Year In Expiry Year Field
When user Enter the CVV Number In CVV Number Field
Then user Click Book Now Button And It Navigate To Book Confirmation Page

Scenario: User Conform Booking In Booking Conformation Page
Then user Click On The My Itinerary Button And It Navigate To Booked Itinerary Page

Scenario: User Entered Booked Itinerary Page
When user Click On The Order Id Check Box In Order Id Field
Then user Click On The Logout Button And It Succefully Logout From Adaction