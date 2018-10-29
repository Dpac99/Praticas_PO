#include <stdio.h>
#include "Animal.h"

int main() {
    Animal a1 = newAnimal(12, "Tareco", 3.4); 
    Animal a2 = newAnimal(1, "Piloto", 12.3);  
 
    printAnimal(a1);
    printAnimal(a2);
 
    printf("a1==a1? %s\n", equalsAnimal(a1, a1) ? "yes" : "no");
    printf("a1==a2? %s\n", equalsAnimal(a1, a2) ? "yes" : "no");
 
    destroyAnimal(a1);
    destroyAnimal(a2);
 
  return 0;
}