# Microsserviço de Envio de email

Este é um pequeno microsserviço desenvolvido em Java com o framework Spring Boot, que permite o envio de emails de forma simples e eficiente.

# Configuração
Certifique-se de ter instalado:

Java JDK 8 ou superior
Maven
Um servidor SMTP válido (por exemplo, Gmail)
MySQL

# Instalação
Clone este repositório para o seu ambiente local:

Copie o código
git clone https://github.com/seu-usuario/nome-do-repositorio.git

Configure as propriedades do servidor SMTP e do banco de dados no arquivo application.properties:

```
spring.mail.host=smtp.seu-servidor-smtp.com
spring.mail.port=587
spring.mail.username=seu-usuario
spring.mail.password=sua-senha
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

spring.datasource.url=jdbc:mysql://localhost:3306/nome-do-banco
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update
```

# Utilização
Você pode usar esta API para enviar emails através de uma solicitação HTTP POST para a rota /email. O corpo da solicitação deve ser um JSON no seguinte formato:

```json

{
    "ownerRef": "Referência do usuário que está enviando",
    "emailFrom": "email origem(o que colocou nas configurações do SMTP)",
    "emailTo": "email destino",
    "subject": "assunto do email",
    "text": "conteúdo texto do email"
}
```

Certifique-se de fornecer os detalhes corretos do destinatário, assunto e corpo do email.

# Contribuição
Se você quiser contribuir para este projeto, fique à vontade para abrir um pull request. Será um prazer revisar suas contribuições!

# Contato
Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato através do email: joaojjbcosta@gmail.com.

Espero que isso te ajude a começar com seu microsserviço de envio de email em Java Spring Boot!
