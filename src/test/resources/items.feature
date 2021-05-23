Feature: Items

  Background: Create Items
    When I send POST request 'api/items.json' with json and BASIC authentication
      """
     {
      "Content": "New Item"
     }
     """
    And I get the property value 'Id' and save on ID_ITEM

  Scenario: I want to Update an Item

    And I have the ID_ITEM
    When I send PUT request 'api/items/ID_ITEM.json' with json and BASIC authentication
        """
        {
       "Checked": "true"
        }
        """
    Then I expected the response code 200

  Scenario: I want to get the item with the given Id

    And I have the ID_ITEM
    When I send GET request 'api/items/ID_ITEM.json' with json and BASIC authentication
    """

    """
    Then I expected the response code 200
    And I expected the response body is equal
        """
    {
        "Id": EXCLUDE,
        "Content": "New Item",
        "ItemType": 1,
        "Checked": false,
        "ProjectId": null,
        "ParentId": null,
        "Path": "",
        "Collapsed": false,
        "DateString": null,
        "DateStringPriority": 0,
        "DueDate": "",
        "Recurrence": null,
        "ItemOrder": null,
        "Priority": 4,
        "LastSyncedDateTime": EXCLUDE,
        "Children": [],
        "DueDateTime": null,
        "CreatedDate": EXCLUDE,
        "LastCheckedDate": null,
        "LastUpdatedDate": EXCLUDE,
        "Deleted": false,
        "Notes": "",
        "InHistory": false,
        "SyncClientCreationId": null,
        "DueTimeSpecified": true,
        "OwnerId": EXCLUDE
    }
       """
  Scenario: I want to DELETE the item with the given Id

    And I have the ID_ITEM
    When I send DELETE request 'api/items/ID_ITEM.json' with json and BASIC authentication
    """

    """
    Then I expected the response code 200