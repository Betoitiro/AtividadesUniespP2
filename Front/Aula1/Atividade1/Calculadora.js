// Solicitação das entradas
var n1 = parseFloat(prompt("Digite o primeiro número: "));
var n2 = parseFloat(prompt("Digite o segundo número: "));
var op = prompt("Digite a operação desejada: soma \n subtração \n multiplicação \n divisão");

//switch dado para recorrer a opção desejada pelo usuario

switch (op) {
    case "soma":
        var resultado = n1 + n2;
        break;

    case "subtração":
        var resultado = n1 - n2;
        break;

    case "multiplicação":
        var resultado = n1 * n2;
        break;

    case "divisão":  
        var resultado = n1 / n2;
        break;
        
    default: 
        var resultado = "Operação inválida";
        break;
}

// Exibe o resultado
alert("RESULTADO: " + resultado);
