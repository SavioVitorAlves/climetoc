import socket
import pickle

# Criando o socket UDP
servidor = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

# Ligando o socket ao endereço e porta desejados
servidor.bind(('10.113.60.225', 9000))

print("Servidor UDP iniciado. Aguardando mensagens...")

while True:
    # Recebendo dados do cliente
    data, addr = servidor.recvfrom(1024)

    # Desserializando os dados usando pickle
    msg = pickle.loads(data)

    if msg == 'tt':
        print("Cliente solicitou encerramento da conexão.")
        break
    else:
        print(f"Mensagem recebida do cliente ({addr}): {msg}")

    # Criando a resposta para o cliente
    resposta = f"Ola! Mensagem recebida: {msg}"

    # Serializando a resposta usando pickle
    data_resposta = pickle.dumps(resposta)

    # Enviando a resposta de volta para o cliente
    servidor.sendto(data_resposta, addr)

# Fechando o socket do servidor
servidor.close()
