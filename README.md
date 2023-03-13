# Amazon UI Automation Testing used Selenium

### The framework has following features

1. Modular Design
2. Maven 
3. Report Generation (cucumber-reporting)
4. Helper class to handle web component such as (Button,Link etc)
5. Centralized Configuration (Using Properties file)
6. POM
7. Hooks for browser support using chrome

### The feature file

Add the feature file under `features/Complete.feature`

```gherkin
  Feature: Menu Television & Video

    @Television
    Scenario Outline: Purchase using the Amazon web in Hamburger Button All Feature Electronics to sub menu Television & Video
      Given User already on Home page website amazon
      When User click Hamburger Button All
      And  User click on "<hamburgerMenuItem>" on Hamburger Menu Item
      Then User click on "<hamburgerListItem>" list item
      And USer click on "<listItem>" list item
      And User click on branch "<branch>"
      When User choose television "<productPertama>"
      Then User click button Add to Cart
      When User click Hamburger Button All
      And  User click on "<hamburgerMenuItem>" on Hamburger Menu Item
      Then User click on "<hamburgerListItem>" list item
      And USer click on "<listItem>" list item
      And User click on branch "<branchKedua>"
      When User choose one more television "<productKedua>"
      Then User click button Add to Cart
      And User click Button Cart
      And User Delete one product "<delete>"
      And User click button Process to Checkout
      When User input username "<UserName>"
      And User click on Button continue
      Then Appear error to message "<ErrorMessage>"

    Examples:
      | hamburgerMenuItem | hamburgerListItem  | listItem    | branch  | productPertama                                                                          | branchKedua | productKedua                                                                                                                                                                                 | UserName  | ErrorMessage                                      | delete                                                                                                                                                                                       |
      | Electronics       | Television & Video | Televisions | SAMSUNG | SAMSUNG 32-inch Class The Frame Customizable Bezel - Beige (VG-SCFT32BE/ZA, 2020 Model) | SAMSUNG     | SAMSUNG M5 Series 32-Inch FHD 1080p Smart Monitor & Streaming TV (Tuner-Free), Netflix, HBO, Prime Video, & More, Apple Airplay, Height Adjustable Stand, Built-in Speakers (LS32AM502HNXZA) | Abogobofa | We cannot find an account with that email address | SAMSUNG M5 Series 32-Inch FHD 1080p Smart Monitor & Streaming TV (Tuner-Free), Netflix, HBO, Prime Video, & More, Apple Airplay, Height Adjustable Stand, Built-in Speakers (LS32AM502HNXZA) |
      
   ```

### To see this project and run this command:

>`mvn clean` and `mvn test`



### Record run the testing 
>https://youtu.be/ajfAbF5fl4c

## Cucumber Report

The Feature Report:
![image](https://user-images.githubusercontent.com/114077446/224584395-89687a7f-6ca8-4405-846e-a4f72e1ae466.png)

The Steps Report:
![image](https://user-images.githubusercontent.com/114077446/224584483-6adeddbe-fa4e-42bc-b58a-74570aa3458e.png)

The Statistics Report:
![image](https://user-images.githubusercontent.com/114077446/224584569-e72c538b-7dd6-4a90-8907-3ee46349e6e6.png)


