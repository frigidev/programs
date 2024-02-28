/*
    Program receives user's height and weight value and calculates their BMI (Body Mass Index) and displays its value in
    integer and a message in accordance with the recommendations for that BMI that the person has.
*/

class IndexCalculator {

    calculateBMI(height, weight) {

        if (height > 0 && weight > 0) {
            const bmi = weight / (height * height);
            console.log("Your mass body index is: " + Math.floor(bmi));

            if (bmi <= 18.5) {
                console.log("Your weight is below the normal");
            } else if (bmi <= 24.9) {
                console.log("Your weight is normal");
            } else if (bmi <= 29.9) {
                console.log("You are overweight");
            } else if (bmi <= 39.9) {
                console.log("You are obese");
            } else {
                console.log("You are morbid obese, try to improve your diet and seek for medical orientation");
            }
        } else {
            console.log("Type valid values for the height and the weight.");
        }
    }
}

const calculator = new IndexCalculator()

//Pass in the arguments of the method below the height and weight
calculator.calculateBMI();
