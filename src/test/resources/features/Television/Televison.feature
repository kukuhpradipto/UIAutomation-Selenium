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

    @Television
    Scenario: Purchase using the Amazon web in Hamburger Button All Feature Electronics to sub menu Television & Video
      Given User already on Home page website amazon
      When User click Hamburger Button All
      And  User click on Electronics on Hamburger Menu Item
      Then User click on Television and Video list item
      And USer click on Television list item
      And User click on branch Samsung
      When User choose television SAMSUNG 32
      Then User click button Add to Cart
      When User click Hamburger Button All
      And  User click on Electronics on Hamburger Menu Item
      Then User click on Television and Video list item
      And USer click on Television list item
      And User click on branch Samsung
      When User choose television SAMSUNG M5
      Then User click button Add to Cart
      And User click on Icon Cart
