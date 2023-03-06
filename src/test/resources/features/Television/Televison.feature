  Feature: Menu Television & Video
#    As a User, I want to purchasing in Amazon Web, So I can access amazon.com
#    As a User, I want to click Hamburger all menu, So I can click Electronics
#    As a User, I want to click Television and Video Department, So I can click on list item Television
#    As a User, I want to click Samsung Featured Brands, So I can choose product SAMSUNG 32
#    As a User, I want to click button add to cart, So that cart the increase the number of shopping queues
#    As a User, I want  to choose one more product SAMSUNG 32, So that cart the increase the number of shopping queues
#    As a User, I want click on icon cart, So I can see the product list
#    As a User, I want to delete one product, So that in cart there is only one product
#    As a User, I want to click button Check out Amazon Cart, So that appear sign in
#    As I User, I want to input random username, So that appear error message

    @Television @Team
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
      And User click on Button Cart
      And User Delete one product "<deleteProduct>"
      And User click On button Process to Checkout
      When User input username "<UserName>"
      And User click on Button continue
      Then Appear error message "<ErrorMessage>"

    Examples:
      | hamburgerMenuItem | hamburgerListItem  | listItem    | branch  | productPertama                                                                       | branchKedua | productKedua                                                                                                                                                                                 | deleteProduct                                                                        | UserName  | ErrorMessage                                      |
      | Electronics       | Television & Video | Televisions | SAMSUNG | SAMSUNG 32-inch Class The Frame Customizable Bezel - White (SCFT32WT/ZA, 2020 Model) | SAMSUNG     | SAMSUNG M5 Series 32-Inch FHD 1080p Smart Monitor & Streaming TV (Tuner-Free), Netflix, HBO, Prime Video, & More, Apple Airplay, Height Adjustable Stand, Built-in Speakers (LS32AM502HNXZA) | SAMSUNG 32-inch Class The Frame Customizable Bezel - White (SCFT32WT/ZA, 2020 Model) | Abogobofa | We cannot find an account with that email address |