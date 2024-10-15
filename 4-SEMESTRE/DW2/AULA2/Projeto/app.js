class Despesa {
	constructor(ano, mes, dia, tipo, descricao, valor) {
		this.ano = ano
		this.mes = mes
		this.dia = dia
		this.tipo = tipo
		this.descricao = descricao
		this.valor = valor
	}

	validarDados() {
		for(let i in this) {
			if(this[i] == undefined || this[i] == '' || this[i] == null) {
				return false
			}
		}
		return true
	}
}

class Bd {

	constructor() {
		let id = localStorage.getItem('id')

		if(id === null) {
			localStorage.setItem('id', 0)
		}
	}

	getProximoId() {
		let proximoId = localStorage.getItem('id')
		return parseInt(proximoId) + 1
	}

	gravar(d) {
		let id = this.getProximoId()
		
		localStorage.setItem(id, JSON.stringify(d))

		localStorage.setItem('id', id)
	}

	buscarDespesaPeloId (id) {
		const result = JSON.parse(localStorage.getItem(id))

		const despesa = new Despesa(
			result.ano,
			result.mes,
			result.dia,
			result.tipo,
			result.descricao,
			result.valor
		)

		return despesa
	}

	buscarDespesas() {
		const lastId = parseInt(localStorage.getItem('id'))
		const despesas = []
		for (let i = lastId; i >= 1; i--) {
			despesas.push(this.buscarDespesaPeloId(i))
		}
		return { despesas }
	}
}

let bd = new Bd()

function extrairInputsDadosDespesa() {
	let ano = document.getElementById('ano')
	let mes = document.getElementById('mes')
	let dia = document.getElementById('dia')
	let tipo = document.getElementById('tipo')
	let descricao = document.getElementById('descricao')
	let valor = document.getElementById('valor')

	return { ano, mes, dia, tipo, descricao, valor }
}

function cadastrarDespesa() {

	const { ano, mes, dia, tipo, descricao, valor } = extrairInputsDadosDespesa()

	let despesa = new Despesa(
		ano.value, 
		mes.value, 
		dia.value, 
		tipo.value, 
		descricao.value,
		valor.value
	)


	if(despesa.validarDados()) {
		bd.gravar(despesa)

		document.getElementById('modal_titulo').innerHTML = 'Registro inserido com sucesso'
		document.getElementById('modal_titulo_div').className = 'modal-header text-success'
		document.getElementById('modal_conteudo').innerHTML = 'Despesa foi cadastrada com sucesso!'
		document.getElementById('modal_btn').innerHTML = 'Voltar'
		document.getElementById('modal_btn').className = 'btn btn-success'

		//dialog de sucesso
		$('#modalRegistraDespesa').modal('show') 
	} else {
		
		document.getElementById('modal_titulo').innerHTML = 'Erro na inclusão do registro'
		document.getElementById('modal_titulo_div').className = 'modal-header text-danger'
		document.getElementById('modal_conteudo').innerHTML = 'Erro na gravação, verifique se todos os campos foram preenchidos corretamente!'
		document.getElementById('modal_btn').innerHTML = 'Voltar e corrigir'
		document.getElementById('modal_btn').className = 'btn btn-danger'

		//dialog de erro
		$('#modalRegistraDespesa').modal('show') 
	}
}

function limparListaDeDespesas({ lista }) {
	if (!lista) {
		document.getElementById('modal_titulo').innerHTML = 'Erro na consulta'
		document.getElementById('modal_titulo_div').className = 'modal-header text-danger'
		document.getElementById('modal_conteudo').innerHTML = 'Erro na Consulta! Elemento lista não encontrado'
		document.getElementById('modal_btn').innerHTML = 'Cancelar'
		document.getElementById('modal_btn').className = 'btn btn-danger'
		$('#modalFeedback').modal('show') 
		return	
	}

	lista.innerHTML = "";
}

function consultarDespesas () {
	const lista = document.getElementById("lista")
	limparListaDeDespesas({ lista })
	const { ano, mes, dia, tipo, descricao, valor } = extrairInputsDadosDespesa()
	const { despesas } = bd.buscarDespesas()


	const despesasFiltradas = despesas.filter((despesa) => {
		let filtrar = true;

		if (ano.value && ano.value !== "Ano") {
			filtrar = despesa?.ano === ano.value
		} else if (mes.value && mes.value !== "Mês") {
			filtrar = despesa?.mes === mes.value
		} else if (dia.value) {
			filtrar = despesa?.dia === dia.value
		} else if (tipo.value && tipo.value !== "Tipo") {
			filtrar = despesa?.tipo === tipo.value
			console.log(tipo.value)
		} else if (descricao.value) {
			filtrar = despesa?.descricao === descricao.value
		} else if (valor.value) {
			filtrar = despesa?.valor === valor.value
		}

		return filtrar
	})



	despesasFiltradas.forEach((despesa) => {
		const linha = document.createElement("tr")
		linha.innerHTML = `
			<td>${despesa.dia}/${despesa.mes}/${despesa.ano}</td>
			<td>${despesa.tipo}</td>
			<td>${despesa.descricao}</td>
			<td>${despesa.valor}</td>
		`
		lista.append(linha)
	})
}

function limparConsultaDespesaMensalAnterior({ cardsWrapper, valorTotal }) {
	if (!cardsWrapper || !valorTotal) {
		document.getElementById('modal_titulo').innerHTML = 'Erro na consulta'
		document.getElementById('modal_titulo_div').className = 'modal-header text-danger'
		document.getElementById('modal_conteudo').innerHTML = 'Erro na Consulta! Elemento não encontrado'
		document.getElementById('modal_btn').innerHTML = 'Cancelar'
		document.getElementById('modal_btn').className = 'btn btn-danger'
		$('#modalFeedback').modal('show') 
		return	
	}

	cardsWrapper.innerHTML = ""
	valorTotal.innerHTML = ""
}

const tipos = {
	"1": "Alimentação",
	"2": "Educação",
	"3": "Lazer",
	"4": "Saúde",
	"5": "Transporte",
}


function consultarDespesaMensal() {

	const elementValorTotal = document.getElementById("valorTotal")
	const elementCardWrapper = document.getElementById("cardWrapper")
	limparConsultaDespesaMensalAnterior({ cardsWrapper: elementCardWrapper, valorTotal: elementValorTotal })

	const { mes } = extrairInputsDadosDespesa()
	console.log(mes.value)
	if (mes.value && mes.value === "Mês") {
		return
	}


	const { despesas } = bd.buscarDespesas()

	const despesasDoMes = despesas.filter((despesa) => {
		console.log(despesa)
		if (mes.value && mes.value === "Mês") {
			return false
		}
		console.log(despesa.mes.includes(mes.value))
		return despesa.mes.includes(mes.value)
	})

	console.log(despesasDoMes)

	const somaDoMes = despesasDoMes.reduce((soma, despesa) => {
		if (despesa.valor) {
			return soma + parseFloat(despesa.valor)
		} else {
			return soma
		}
	}, 0)

	elementValorTotal.innerText = `R$ ${somaDoMes}`
	let finalHtml = ""
	despesasDoMes.forEach((despesa) => {
		const cardToAppend = `
		<div class="col-sm-4 mb-4">
			<div class="card">
			<div class="card-body">
				<h4 class="card-title mb-4 text-secondary font-weight-bold">${despesa?.descricao}</h4>
				<p class="card-text"><b>Valor:</b> R$ ${despesa?.valor}</p>
				<p class="card-text"><b>Data:</b> ${despesa?.dia}/${despesa?.mes}/${despesa?.ano}</p>
				<p class="card-text btn btn-info">${tipos[despesa?.tipo]}</p>
			</div>
			</div>
		</div>
		`
		finalHtml += cardToAppend
	})

	elementCardWrapper.innerHTML = finalHtml
}