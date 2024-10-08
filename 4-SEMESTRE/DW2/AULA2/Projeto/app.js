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
		console.log(id)
		const result = JSON.parse(localStorage.getItem(id))
		const despesa = new Despesa(
			result.ano,
			result.mes,
			result.dia,
			result.tipo,
			result.descricao
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

function consultarDespesas () {
	const lista = document.getElementById("lista")
	const { ano, mes, dia, tipo, descricao, valor } = extrairInputsDadosDespesa()
	const { despesas } = bd.buscarDespesas()

	console.log(despesas)

	const despesasFiltradas = despesas.filter((despesa) => {
		let filtrar = true;

		if (despesa.ano) {
			filtrar = despesa.ano === ano
		} else if (despesa.mes) {
			filtrar = despesa.mes === mes
		} else if (despesa.dia) {
			filtrar = despesa.dia === dia
		} else if (despesa.tipo) {
			filtrar = despesa.tipo === tipo
		} else if (despesa.descricao) {
			filtrar = despesa.descricao === descricao
		} else if (despesa.valor) {
			filtrar = despesa.valor === valor
		}

		return filtrar
	})


	despesasFiltradas.forEach((despesa) => {
		const linha = document.createElement("tr")
		linha.innerHTML = `
			<td>${despesa.data}</td>
			<td>${despesa.tipo}</td>
			<td>${despesa.descricao}</td>
			<td>${despesa.valor}</td>
		`
		lista.append(linha)
	})
}

// Cálculo mensal - Extrato