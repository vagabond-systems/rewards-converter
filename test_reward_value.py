from reward_value import RewardValue

def test_to_airline_miles():
    reward = RewardValue(100)  # 100 dollars
    assert reward.to_airline_miles() == 1000  # Expecting 1000 miles

def test_cash_to_miles():
    reward = RewardValue(10.0)  # Provide a cash value here
    cash_amount = 10.0
    expected_miles = 100.0  # Assuming the rate is 10 miles per dollar
    assert reward.cash_to_miles(cash_amount) == expected_miles

def test_miles_to_cash():
    reward = RewardValue(100.0)  # Provide a cash value here
    miles_amount = 100.0
    expected_cash = 10.0  # Assuming the rate is 1 dollar per 10 miles
    assert reward.miles_to_cash(miles_amount) == expected_cash

if __name__ == "__main__":
    test_to_airline_miles()
    test_cash_to_miles()
    test_miles_to_cash()
    print("All tests passed!")
