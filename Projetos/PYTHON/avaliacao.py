import tkinter as tk
from tkinter import messagebox

# Função para exibir a mensagem em uma nova janela
def exibir_mensagem():
    nome = nome_entry.get()
    mensagem = mensagem_entry.get()
    if nome and mensagem:
        # Cria uma nova janela de mensagem
        messagebox.showinfo("Mensagem Recebida", f"Nome: {nome}\nMensagem: {mensagem}")
    else:
        messagebox.showerror("Erro", "Por favor, preencha todos os campos.")

# Cria a janela principal
root = tk.Tk()
root.title("Enviar Mensagem")

# Rótulos e campos de texto
nome_label = tk.Label(root, text="Nome:")
nome_label.pack()
nome_entry = tk.Entry(root)
nome_entry.pack()

mensagem_label = tk.Label(root, text="Mensagem:")
mensagem_label.pack()
mensagem_entry = tk.Entry(root)
mensagem_entry.pack()

# Botão para enviar a mensagem
enviar_button = tk.Button(root, text="Enviar", command=exibir_mensagem)
enviar_button.pack()

# Inicia o loop principal
root.mainloop()