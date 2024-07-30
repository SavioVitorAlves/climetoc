import socket
import pickle

# Criando o socket UDP
cliente = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

# Endereço e porta do servidor
servidor_endereco = '10.113.60.226'
servidor_porta = 9090

terminando = False

print('Digite "tt" para terminar o chat.')

while not terminando:
    try:
        # Enviando mensagem para o servidor
        msg = input('Mensagem: ')

        # Serializando a mensagem usando pickle
        data = pickle.dumps(msg)

        # Enviando os dados para o servidor
        cliente.sendto(data, (servidor_endereco, servidor_porta))

        if msg == 'tt':
            terminando = True
        else:
            # Recebendo resposta do servidor
            data, addr = cliente.recvfrom(1024)

            # Desserializando os dados usando pickle
            resposta = pickle.loads(data)

            print(f'Resposta do servidor ({addr}): {resposta}')

    except KeyboardInterrupt:
        print("\nChat encerrado pelo usuário.")
        break

# Fechando o socket do cliente
cliente.close()
