/* 
Based on the formula: f(x) = ax + b of the first degree function,
This function below calculates the result of a first degree function operation,
where first function call argument = a, second = b, and third = x.
The program was made using some JavaScript concepts like scope, closures and currying,
which is a different method to write functions, working based on a function with multiple 
functions returns.
*/
function firstDegree(a) {
    return (b) => {
        return (x) => {
          return a * x + b;
        }
    };
}
//Example of usage, where f(30) = 4*30 + 5
console.log(firstDegree(4)(5)(30));
