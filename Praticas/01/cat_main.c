#include <stdio.h>
#include "cat.h"
#include "Animal.h"

int main () {
    Cat cat1 = newCat("Tareco", 7, 22.0, 1.2, 2.0);
    Cat cat2 = newCat("Pantufa", 10, 19.0, 2.2, 3.0);

    printCat(cat1);
    printCat(cat2);

    printf("cat1 == cat1? %s\n", equalsCat(cat1, cat1)? "yes" : "no");
    printf("cat1 == cat2? %s\n", equalsCat(cat1, cat2)? "yes" : "no");

    destroyCat(cat1);
    destroyCat(cat2);
}