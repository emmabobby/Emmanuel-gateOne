from datetime import datetime, timedelta

def get_next_menstruation_start(cycle_length, days_menstrual_ended):
	next_cycle_date = menstrual_ended + timedelta(cycle_length)
	return next_cycle_date
	

def get_next_menstruation_end_date(day, days_menstruation_started):
	menstruation_ends = days_menstruation started  + timedelta(day)
	return menstruation_ends


def get_ovulation_date(cycle_length, days_mestruation_ends):
	ovulation_date = timedelta(cycle_length / 2) + days_mestruation_ends
	return ovulation_date


period_length = int(input("Enter your PERIOD length: "))
last_period_date = input("Enter your last period date(DD-MM-YYYY):  ")
date = datetime.strptime(last_period_date, "%d-%m-%Y")

cycle_length = int(input("Enter your cycle length: "))
print("Next Menstruation Date : "+ get_next_menstruation_start(cycle_length,date))