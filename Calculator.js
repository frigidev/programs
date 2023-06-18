class Calculator {
    calculateBMI(height, weight) {
      if (height && weight > 0) {
          const bmi = weight / (height * height);
          alert("Your body mass index is: " + Math.floor(bmi));
  
          if(res <= 18.5) {
          alert("Your weight is below normal")
        } else if (bmi <= 24.9) {
          alert("You are at normal weight")
        } else if (bmi <= 29.9) {
          alert("You are overweight")
        } else if (bmi <= 39.9) {
          alert("You are obese")
        } else {
          alert(
              "You are morbidly obese, try to improve your diet and seek medical advice"
          );
        }
    } else {
          alert("Enter valid values for height and weight.");
    }
  }
}

const calculator = new Calculator()

function getUserInput() {
    const height = parseFloat(prompt("Enter your height in meters:"));
    const weight = parseFloat(prompt("Enter your weight in kilograms:"));
    calculator.calculateBMI(height, weight);
}
    
getUserInput();
