expressao = "soma = 10 + 20 ;"

tokens = expressao.split()

for token in tokens:
    if token.isidentifier():
        print(f"{token} -> Identificador")
    elif token.isdigit():
        print(f"{token} -> Número")
    elif token == "=":
        print(f"{token} -> Atribuição")
    elif token in ["+", "-", "*", "/"]:
        print(f"{token} -> Operador")
    elif token == ";":
        print(f"{token} -> Fim de instrução")
    else:
        print(f"{token} -> Token desconhecido")
