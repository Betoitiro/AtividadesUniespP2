/*Script responsavel por verificar a idade do usuario atravez do prompt*/

alert("Indentificador de idade: ");

var ano = parseInt(prompt("Digite o ano que voce nasceu: "));
var idade = parseInt(2023 - ano);
if(idade >=18 ){
    alert("Acesso permitido! \n o usuario ja é maior de idade")
    alert("voce tem "+ idade + " anos de idade");
}else{
    alert("Acesso negado!! \n usuario ainda é de menor")
    alert("voce tem "+ idade + " anos de idade");
}

