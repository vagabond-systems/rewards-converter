class RewardValue:
    def __init__(self, cash_value):
        self.cash_value = cash_value

    def to_airline_miles(self):
        # Example conversion rate: 1 dollar = 10 airline miles
        conversion_rate = 10
        return self.cash_value * conversion_rate

    def cash_to_miles(self, cash_amount):
        # Conversion rate example
        conversion_rate = 10
        return cash_amount * conversion_rate

    def miles_to_cash(self, miles_amount):
        # Conversion rate example
        conversion_rate = 10
        return miles_amount / conversion_rate