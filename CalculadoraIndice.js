/*
    Programa que recebe o valor da altura e do peso do usuário e calcula o seu IMC (Índice de Massa Corporal) e exibe seu valor em inteiro
    e uma mensagem correspondente às recomendações para aquele IMC que a pessoa possui.
*/

const readline = require('readline');

class CalculadoraIndice {

    calcularIMC(altura, peso) {

        if (altura > 0 && peso > 0) {
            const imc = peso / (altura * altura);
            console.log("Seu índice de massa corporal é: " + Math.floor(imc));

            if (imc <= 18.5) {
                console.log("Seu peso está abaixo do normal");
            } else if (imc <= 24.9) {
                console.log("Seu peso está normal");
            } else if (imc <= 29.9) {
                console.log("Você está em sobrepeso");
            } else if (imc <= 39.9) {
                console.log("Você está obeso");
            } else {
                console.log("Você está obeso mórbido, tente melhorar sua alimentação e procure orientação médica");
            }
        } else {
            console.log("Insira valores válidos para o peso e altura.");
        }
    }
}

const calculadora = new CalculadoraIndice();

function capturarEntradaUsuario() {

    const leitura = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    leitura.question("Digite a sua altura em metros: ", (altura) => {
        leitura.question("Digite o seu peso em quilogramas: ", (peso) => {
            calculadora.calcularIMC(parseFloat(altura), parseFloat(peso));
        });
    });
}

capturarEntradaUsuario();
