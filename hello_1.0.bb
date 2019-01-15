##################################################################################################################################
###
###   Receita para o pacote de software HELLO
###
##################################################################################################################################
SUMMARY = "Receita para o Software hello escrito em C"
DESCRIPTION = "Esta é uma receita apenas para fins didáticos que demonstra a instalação de um software escrito em C e instalado \
em uma distribuição customizada do linux para dispositivos embarcados. \
"

# 
SECTION = "examples"
# 
PRIORITY = "OPTIONAL"

# Licença a ser utilizada para este software
LICENSE = "MIT"
LIC_FILES_CHKSUM = "\ 
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
"

# Caminho para o código-fonte do software. Neste caso, iremos utilizar um código compactado em tar.gz
SRC_URI = "file://hello-1.0.tar.gz"

#
TARGET_CC_ARCH += "${LDFLAGS}"

# 
do_compile() {
  bbnote "Iniciando o processo de compilação do software ${PN}"

  ${CC} -c helloprint.c
  ${CC} -c hello.c
  ${CC} -o hello hello.o helloprint.o

  bbwarn "Finalizando o processo de compilação do software ${PN}"
}

do_install() {
  install -d ${D}${bindir}
  install -m 0755 hello ${D}${bindir}
}
