# hello
Projeto simples destinado a orientar os estudantes do curso de **Introdução ao Desenvolvimento para Linux Embarcado usando o Yocto Project** a criarem um simples aplicativo, fazer a compilação e instalação em uma distribuição customizada para linux embarcado utilizando o Yocto Project.

Este projeto é uma receita (recipes) de software a ser utilizado pelo Yocto Project, Ele contem o arquivo *metadata* **helo_1.0.bb** de receita para o *OpenEmbedded Build System* construir o pacote de software e instalá-lo na distribuição customizada do linux embarcado.

### O código fonte do aplicativo
O código fonte do aplicativo está na pasta *hello-1.0* e será utilizado na receita de forma compactada **.tar.gz** para fins didático.

### O que o aplicativo faz?
Este aplicativo apenas escreve na saída padrão **stdout** uma simples mensagem.

### Árvore de arquivos do projeto:
+ **hello**<br />
  |  *hello_1.0.bb*<br/>
  +  **hello-1.0**<br/>
  |  *hello.c*<br/>
  |  *hello.h*<br/>
  |  *hello-1.0.tar.gz*<br/>
  
