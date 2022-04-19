Feature: Search name in google
  @test
  Scenario Outline: Search name on Google Home page
    Given Can we able to loading or not
    When Search for name "<first_name>" and " <last_name>" on the web page
    And load page by given name
    Then open LinkedIn Profile by Name
    Then Close the page
    Examples:
      | first_name | last_name |
      |  Pushkar   | Gujarathi  |
