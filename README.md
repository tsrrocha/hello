# hello
Projeto simples destinado a orientar os estudantes do curso de **Introdução ao Desenvolvimento para Linux Embarcado usando o Yocto Project** a criarem um simples aplicativo, fazer a compilação e instalação em uma distribuição customizada para linux embarcado utilizando o Yocto Project.

Este projeto é uma receita (recipes) de software a ser utilizado pelo Yocto Project, Ele contem o arquivo *metadata* **helo_1.0.bb** de receita para o *OpenEmbedded Build System* construir o pacote de software e instalá-lo na distribuição customizada do linux embarcado.

### O código fonte do aplicativo
O código fonte do aplicativo está na pasta *hello-1.0* e será utilizado na receita de forma compactada ***.tar.gz*** para fins didático.

### O que o aplicativo faz?
Este aplicativo apenas escreve na saída padrão ***stdout*** uma simples mensagem.

### Árvore de arquivos do projeto:
+ **hello**<br />
  |  *hello_1.0.bb*<br/>
  +  **hello-1.0**<br/>
  |  *hello.c*<br/>
  |  *hello.h*<br/>
  |  *helloprint.c*<br/>
  |  *helloprint.h*<br/>
  |  *hello-1.0.tar.gz*<br/>
  
### Como gerar o código-fonte compactado?
Considerando que você, utilizando o console de comandos do linux, esteja dentro da pasta raiz do projeto: *hello*, execute os seguintes comandos (sem o carácter "**$**" ) para compactar o código-fonte que será utilizado pela receita ***hello_1.0.bb***.

`$ rm -f ./hello-1.0/hello-1.0.tar.gz` <br/>
`$ tar -czf hello-1.0.tar.gz ./hello-1.0`<br/>
`$ mv ./hello-1.0.tar.gz ./hello-1.0/`<br/>

**Observação:** Sempre que você alterar qualquer informação nos arquivos do projeto você deverá recompactar o código-fonte utilizando os comandos acima.

[URL do Projeto](https://github.com/tsrrocha/hello/tree/master "Hello")