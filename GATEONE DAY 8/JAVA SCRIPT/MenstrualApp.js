const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const formatDate = (date) => {
  return date.toLocaleDate;
};

console.log("Enter your last menstrual cycle date (dd-MM-yyyy): ");
rl.on('line', (input) => {
  const lastCycleDateStr = input.trim();
  const cycleLengthPrompt = "Enter your cycle length: ";
  
  if (lastCycleDateStr) {
    console.log(cycleLengthPrompt);
  } else {
    console.log("Invalid date format. Please enter the date in dd-MM-yyyy format.");
    console.log("Enter your last menstrual cycle date (dd-MM-yyyy): ");
  }

  rl.on('line', (input) => {
    const cycleLengthStr = input.trim();
    const cycleLength = parseInt(cycleLengthStr, 10);
    
    if (!isNaN(cycleLength)) {
      const lastCycleDate = new Date(lastCycleDateStr.split('-').reverse().join('-'));
      const nextFlow = calculateNextFlowDate(lastCycleDate, cycleLength);
      
      const safePeriodStart = new Date(nextFlow);
      safePeriodStart.setDate(safePeriodStart.getDate() - 9);
      
      const safePeriodEnd = new Date(nextFlow);
      safePeriodEnd.setDate(safePeriodEnd.getDate() - 1);
      
      const fertilityCycleStart = new Date(nextFlow);
      fertilityCycleStart.setDate(fertilityCycleStart.getDate() - 18);
      
      const fertilityCycleEnd = new Date(nextFlow);
      fertilityCycleEnd.setDate(fertilityCycleEnd.getDate() - 10);
      
      console.log(`Your possible next flow date is ${formatDate(nextFlow)}
Your possible safe cycle is ${formatDate(safePeriodStart)} to ${formatDate(safePeriodEnd)}
Your possible fertility cycle ${formatDate(fertilityCycleStart)} to ${formatDate(fertilityCycleEnd)}`);
      
      rl.close();
    } else {
      console.log("Invalid cycle length. Please enter a number.");
      console.log(cycleLengthPrompt);
    }
  });
});

function calculateNextFlowDate(lastCycleDate, cycleDuration) {
  const resultDate = new Date(lastCycleDate);
  resultDate.setDate(resultDate.getDate() + cycleDuration);
  return resultDate;
}
