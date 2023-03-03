@Complete
Feature: Completed order
  As a user I want buy storage data without login

  Scenario: user buy product data storage
    Given User open website Amazon and already landing page
    When User click All main menu
    And User click list menu "Computers" in category shop by departement
    And User click list menu "Data Storage" in category computers
    And User sort list product Data Storage by featured brands "Seagate"
    And User choice product from Storage Data "produk" and "produk"
#      Then User click on icon cart
#      And User delete product "deleteProduct"
#      And User click button procced to checkout
#      Then User is directed to the login page and must login for the next process
