$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 2,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User Login Fuctionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-fuctionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cUserName\u003e\" In UserName Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-fuctionality;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactin-application;user-login-fuctionality;;1"
    },
    {
      "cells": [
        "AAA",
        "123"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;user-login-fuctionality;;2"
    },
    {
      "cells": [
        "NNN",
        "345"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;user-login-fuctionality;;3"
    },
    {
      "cells": [
        "Madhanjohn",
        "T02AP9"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;user-login-fuctionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "User Login Fuctionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-fuctionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"AAA\" In UserName Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 11149552100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_UserName_Field(String)"
});
formatter.result({
  "duration": 2697134600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 368792000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2545245000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Login Fuctionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-fuctionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"NNN\" In UserName Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"345\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 430404500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NNN",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_UserName_Field(String)"
});
formatter.result({
  "duration": 256873800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "345",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 213213100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1019815800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User Login Fuctionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-fuctionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Madhanjohn\" In UserName Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"T02AP9\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 451320800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Madhanjohn",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_UserName_Field(String)"
});
formatter.result({
  "duration": 343603000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T02AP9",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 180658300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4807333400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User Searching Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-searching-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select The Room Type",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Select The Number Of Rooms",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user Enter The Check In Date",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user Enter The Check Out Date",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user Select Adult Person Number Per Room",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Select Children Person Number Per Room",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user Click On The Search Button And It Navigate To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location()"
});
formatter.result({
  "duration": 2367860300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 308246900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 273102500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 591837400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date()"
});
formatter.result({
  "duration": 353954300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date()"
});
formatter.result({
  "duration": 225694200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Adult_Person_Number_Per_Room()"
});
formatter.result({
  "duration": 424279700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Children_Person_Number_Per_Room()"
});
formatter.result({
  "duration": 399072300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Search_Button_And_It_Navigate_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1708277100,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User Select The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Select the Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Click On The Continue Button And It Navigate To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Hotel()"
});
formatter.result({
  "duration": 412263100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1706450300,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User Booking The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-booking-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Billing Address In Billing Address Field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Credit Card Number In Credit Card No Field",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user Select Credit Card Type In Credit Card Type Field",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "user Select Expiry Date In Expiry Date Field",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user Select Expiry Year In Expiry Year Field",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user Enter the CVV Number In CVV Number Field",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "user Click Book Now Button And It Navigate To Book Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 485659300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 211208600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 360117900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 239003200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 282254600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Expiry_Date_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 259453600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Expiry_Year_In_Expiry_Year_Field()"
});
formatter.result({
  "duration": 222815500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_the_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 191677900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Book_Now_Button_And_It_Navigate_To_Book_Confirmation_Page()"
});
formatter.result({
  "duration": 156067200,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "User Conform Booking In Booking Conformation Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-conform-booking-in-booking-conformation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "user Click On The My Itinerary Button And It Navigate To Booked Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_My_Itinerary_Button_And_It_Navigate_To_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 7843689100,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "User Entered Booked Itinerary Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-entered-booked-itinerary-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "user Click On The Order Id Check Box In Order Id Field",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "user Click On The Logout Button And It Succefully Logout From Adaction",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Order_Id_Check_Box_In_Order_Id_Field()"
});
formatter.result({
  "duration": 264659400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Logout_Button_And_It_Succefully_Logout_From_Adaction()"
});
formatter.result({
  "duration": 798930500,
  "status": "passed"
});
});