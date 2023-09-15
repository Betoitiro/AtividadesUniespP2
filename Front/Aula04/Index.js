function calcularMedia() {
    var valor1 = parseFloat(document.getElementById("Numero1").value);
    //pega o valor solicitado pelo usuario referente a primerira nota;
    var valor2 = parseFloat(document.getElementById("Numero2").value);
    //valor solicitado pelo usuario referente a segunda nota;
    var media = (valor1 + valor2) / 2;
    //variavel responsavel por calcular a media aritrimetrica

    if (media >= 4) {
        var ap = document.getElementById("Status");
        ap.textContent ="O aluno foi aprovado com a media " + media.toFixed(2);
    } else{
        var rp = document.getElementById("Status");
        rp.textContent = "O aluno foi reprovado com a media " + media.toFixed(2);
    }
    var resultadosElement = document.getElementById("Resultados");
    resultadosElement.textContent = "O valor da média é de " + media.toFixed(2);
}
