/**
 * Validação de campos formulario
 */
function validarcampos(){
	
	let nome = frmContato.nome.value
	let fone = frmContato.fone.value
	if (nome === ""){
	alert('preencha o campo Nome')
	frmContato.nome.focus()
	return false
	} else if (fone === ""){
	alert('preencha o campo fone')
	frmContato.fone.focus()
	return false
	}else{
    documento.forms["frmContato"].submit();
}
}


