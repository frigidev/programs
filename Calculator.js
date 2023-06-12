class Calculator {

    constructor(){
        this.aux = 0
    }

    calculate(height, weight){
      if(height, weight > 0){
          this.aux = height * height
          res = weight / this.aux
          console.log("Your body mass index is: " + Math.floor(res))
      }else{
        console.log("Enter a valid entry")
        }if(res <= 18.5 && res < 0){
          console.log("Your weight is below normal")
        }else if(res >= 18.5 && res <= 24.9){
          console.log("You are at normal weight")
        }else if(res >= 25 && res <= 29.9){
          console.log("You are overweight")
        }else if(res >= 30 && res <= 39.9){
          console.log("You are obese")
        }else if(res >= 40){
          console.log("You are morbidly obese, try to improve your diet and seek medical advice")
        }else{
          console.log("Enter a valid entry")
        }
    }
}

const calculator = new Calculator()

let height = 0
let weight = 0
let res = 0

calculator.calculate()
