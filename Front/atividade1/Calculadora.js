const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function calculate(num1, operator, num2) {
  num1 = parseFloat(num1);
  num2 = parseFloat(num2);

  switch (operator) {
    case '+':
      return num1 + num2;
    case '-':
      return num1 - num2;
    case '*':
      return num1 * num2;
    case '/':
      return num1 / num2;
    default:
      return 'Operador inválido';
  }
}

function startCalculator() {
  rl.question('Digite o primeiro número: ', num1 => {
    rl.question('Digite o operador (+, -, *, /): ', operator => {
      rl.question('Digite o segundo número: ', num2 => {
        const result = calculate(num1, operator, num2);
        console.log(`Resultado: ${result}`);
        rl.close();
      });
    });
  });
}

startCalculator();
