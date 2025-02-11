@FullTest
Feature: Login to StartSharp,
  As an user's StartSharp, I wish to log in to the site to manage my tests.

  Background:
    Given the user logged in to the StartSharp website with the username "admin" and the password "serenity"

  @Scenario1
  Scenario: I need to create a new business unit
    When I try to create a business unit "Prueba Aut"
    Then I validate the creation of the unit "Prueba Aut"

  @Scenario2
  Scenario Outline: I need to generate a meeting for the business unit created earlier
    When I try to create a meeting
    And complete all the fields of the form for the business unit <MeetingName><MeetingNumber><StartDate><EndDate><Unit>
    Then validate the meeting creation <MeetingName>
    Examples:
      | MeetingName    | MeetingNumber | StartDate          | EndDate            | Unit         |
      | "Reto Tecnico" | "121212"      | "11/01/2025 08:25" | "11/01/2025 09:25" | "Prueba Aut" |