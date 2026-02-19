info = "Soma = 10 + 20 ;"

dados = info.split(" ")

identificador = dados[0]
atribuicao = dados[1]
numero1 = dados[2] 
numero2 = dados[4]
operador = dados[3]
fim = dados[5]

print(f"Identificação: {identificador}, Atribuição: {atribuicao}, Número1: {numero1}, Número2: {numero2}, Operador: {operador}, Fim de Instrução: {fim}")
