def main():
    lista_compras = []

    while True:
        print("\n===== Lista de Compras =====")
        print("1. Adicionar item")
        print("2. Remover item")
        print("3. Editar item")
        print("4. Listar itens")
        print("5. Sair")
        
        escolha = input("Escolha uma opção: ")

        if escolha == '1':
            item = input("Digite o nome do item a ser adicionado: ")
            lista_compras.append(item)
            print(f"{item} foi adicionado à lista de compras.")

        elif escolha == '2':
            item = input("Digite o nome do item a ser removido: ")
            if item in lista_compras:
                lista_compras.remove(item)
                print(f"{item} foi removido da lista de compras.")
            else:
                print(f"{item} não foi encontrado na lista de compras.")

        elif escolha == '3':
            item_antigo = input("Digite o nome do item a ser editado: ")
            if item_antigo in lista_compras:
                index = lista_compras.index(item_antigo)
                novo_item = input("Digite o novo nome do item: ")
                lista_compras[index] = novo_item
                print(f"{item_antigo} foi alterado para {novo_item} na lista de compras.")
            else:
                print(f"{item_antigo} não foi encontrado na lista de compras.")

        elif escolha == '4':
            print("\nItens na lista de compras:")
            for item in lista_compras:
                print(item)

        elif escolha == '5':
            print("Saindo...")
            break

        else:
            print("Opção inválida. Por favor, escolha uma opção válida.")

if __name__ == "__main__":
    main()
