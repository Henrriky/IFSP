let botaoCandidatar = document.getElementById("button");    
let campoNome = document.getElementById("nome");
let botaoPersonagem = document.getElementById("buttonRandom");
let personagem = document.getElementById("personagem");

botaoCandidatar.addEventListener("click", verificarNome);
function verificarNome (){
    
    if (campoNome.value == "") {
        alert("Você precisa preencher o campo nome para se candidatar!");
    } else  {
        alert("Enviado")
    }
}

botaoPersonagem.addEventListener("click", nomeAleatorio) 
function nomeAleatorio (){
    let personagens = ["Asta: Touros Negros", "Yuno: Alvorecer Dourado", "William Vangeance: Alvorecer Dourado", "Nozel Silva: Águias de Prata", "Zoro: Touros Negros"];
    let tamanhoArray = personagens.length;
    let numeroAleatorio = Math.floor(Math.random() * tamanhoArray);
    let personagemAleatorio = personagens[numeroAleatorio];
    personagem.textContent = personagemAleatorio;

}