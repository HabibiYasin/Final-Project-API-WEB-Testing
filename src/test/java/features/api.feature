 Feature: Test Automation Rest Api

   @api
   Scenario: Test get list data normal
      Given prepare url for "GET_LIST_USERS"
      And hit api get list data
      Then validation status code should be 200
      Then validation response body get list users
      Then validation response json with JSONSchema "get_list_users_normal.json"

    @api
    Scenario: Test create new user normal
       Given prepare url for "CREATE_USER"
       And hit api post create new user
       Then validation status code should be 200
       Then validation response body post create new user
       Then validation response json with JSONSchema "post_create_new_user_normal.json"

    @api
    Scenario: Test create new user with minimum criteria #firstName,lastName,andEmail
       Given prepare url for "CREATE_USER"
       And hit api post create new user min
       Then validation status code should be 200
       Then validation response body post create new user min

   @api
   Scenario: Test create new user without email
     Given prepare url for "CREATE_USER"
     And hit api post create new user without email
     Then validation status code should be 400

   @api
   Scenario: Test delete user normal
     Given prepare url for "CREATE_USER"
     And hit api post create new user
     Then validation status code should be 200
     Then validation response body post create new user
     And hit api delete new
     Then validation status code should be 200

   @api
   Scenario: Test delete invalid user
     Given prepare url for "INVALID_USER"
     And hit api delete
     Then validation status code should be 404

  # @api (Website tidak bisa update user, sudah dicoba di postman)
   #Scenario: Test update user normal
     #Given prepare url for "CREATE_USER"
     #And hit api post create new user
     #Then validation status code should be 200
     #Then validation response body post create new user
     #And hit api update data
     #Then validation status code should be 200
     #Then validation response body update user