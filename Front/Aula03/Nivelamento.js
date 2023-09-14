document.addEventListener("DOMContentLoaded", function () {
    var quantidadeMulher = 0;
    var AlturaMediaHomens = 0.0;
    var quantidadeHomens = 0;
    var maiorAltura = Number.NEGATIVE_INFINITY;
    var menorAltura = Number.POSITIVE_INFINITY;
    var i = 0;

    document.getElementById("proximoButton").addEventListener("click", function () {
        if (i < 5) {
            var sexoI = document.getElementById("sexoInput").value;
            var sexo = sexoI.toLowerCase();
            var altura = parseFloat(document.getElementById("alturaInput").value);

            if (sexo == "feminino") {
                quantidadeMulher++;
            } else if (sexo == "masculino") {
                quantidadeHomens++;
                AlturaMediaHomens += altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }

            i++;
        } else {
            // Após as 5 iterações, calcular a altura média dos homens e exibir as informações.
            AlturaMediaHomens = AlturaMediaHomens / quantidadeHomens;
            document.getElementById("qntM").innerHTML = quantidadeMulher;
            document.getElementById("maiorAltura").innerHTML = maiorAltura;
            document.getElementById("menorAltura").innerHTML = menorAltura;
            document.getElementById("alturaMediaHomens").innerHTML = AlturaMediaHomens;
            
            alert("Você já completou as 5 iterações.");
        }
    });
});
