Feature: verify search
Scenario: verify search buttons
Given login page should be open in default browser
When click on username field and add valid user username
And then click on password button and enter valid password
And now click on submit button
And go to search button and click add inputs
Then list of products
And add product to wishlist
And add product to cart
And open shopping cart
And proceed to checkout
Then close browser