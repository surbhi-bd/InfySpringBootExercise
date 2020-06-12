Feature: As an api user I want to find the oldest user accounts with zero followers

  Scenario: Get the oldest user accounts with zero followers
    Given url microserviceUrl
    And path '/users'
    When method GET
    Then status 200
    And match header Content-Type contains 'application/json'
    And match response == 
    """
    { 
      id : '#number',
      login : '#string',
      html_url : '#string'
     }
    }
    """