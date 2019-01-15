/*==================================================
                    HELLO
  --------------------------------------------------


  ==================================================*/
  
  #include <stdio.h>
  #include <stdlib.h>
  #include "hello.h"

  void printHello( void ) {
      fprintf(stdout, "Hello - DEBUG - Ola, mundo legal!!!");
  }

  int main () {
      printHello();
      return (0);
  }