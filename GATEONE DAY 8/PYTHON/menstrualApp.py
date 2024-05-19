from datetime import datetime, timedelta

def get_next_menstruation_start(cycle_length, days_menstrual_ended):
	next_cycle_date = days_menstrual_ended + timedelta(cycle_length)
	return next_cycle_date
	

def get_next_menstruation_end_date(period_length, days_menstruation_started):
	menstruation_ends = days_menstruation_started  + timedelta(period_length)
	return menstruation_ends


def get_ovulation_date(cycle_length, days_mestruation_ends):
	ovulation_date = timedelta(cycle_length / 2) + days_mestruation_ends
	return ovulation_date


date_format = '%d/%m/%Y'

def get_fertile_days(ovulation_date):
	fertile_date_start = ovulation_date - timedelta(5)
	fertile_date_end = ovulation_date + timedelta(4)
	return f'{fertile_date_start.strftime(date_format)} to {fertile_date_end.strftime(date_format)}'


period_length = int(input("Enter your PERIOD length: "))
last_period_date = input("Enter your last period date(DD-MM-YYYY):  ")
date = datetime.strptime(last_period_date, "%d-%m-%Y")

cycle_length = int(input("Enter your cycle length: "))

next_menstruation_start =  get_next_menstruation_start(cycle_length,date)

next_menstruation_end = get_next_menstruation_end_date(period_length, next_menstruation_start)

ovulation_date = get_ovulation_date(cycle_length, next_menstruation_end)

fertile_days = get_fertile_days(ovulation_date)

print(f"Next Menstruation Date : {next_menstruation_start.strftime(date_format)}")
print(f'Next Menstruation Ends : {next_menstruation_end.strftime(date_format)}')
print(f'Ovulation Date : {ovulation_date.strftime(date_format)}')
print(f'Next fertile Days : {fertile_days}')