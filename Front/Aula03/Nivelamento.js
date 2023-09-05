
var quantidadeMulher = 0;
var AlturaMediaHomens = 0.0;
var quantidadeHomens = 0;
var maiorAltura = Number.NEGATIVE_INFINITY;
var menorAltura = Number.POSITIVE_INFINITY;


for(var i = 1; i <=15; i++){
    var sexoI = prompt("Digite seu sexo: ");
    var sexo = sexoI.toLowerCase();
    var altura = parseFloat(prompt("Informe a sua altura: "));

    if(sexo =="feminino"){
        quantidadeMulher ++;
    }else if (sexo == "masculino"){
        quantidadeHomens ++;
        AlturaMediaHomens +=altura;
    }

    if (altura > maiorAltura) {
        maiorAltura = altura;
    }
    if (altura < menorAltura) {
        menorAltura = altura;
    }

    AltmediaH = AltmediaH / QuantidadeH;

}