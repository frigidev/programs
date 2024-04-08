/* 
Based on the formula: f(x) = a(x^2) + bx + c of the second degree function,
This function below calculates the result of a second degree function operation,
where first function call argument = a, second = b, third = x and fourth = c.
The program was made using some JavaScript concepts like scope, closures and currying,
which is a different method to write functions, working based on a function with multiple 
functions returns.
*/
function secondDegreeFunction(a) {
    return (b) => {
        return (x) => {
            return(c) => {
                return a*Math.pow(x, 2) + b*x + c;
            }
        }
    }; 
}
//Example of usage, where f(5) = 2*5^2 + 3*5 + 10
console.log(secondDegreeFunction(2)(3)(5)(10));
