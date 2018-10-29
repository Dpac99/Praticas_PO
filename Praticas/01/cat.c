#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "Animal.h"
#include "cat.h"


struct cat { 
    Animal _animal;
    double _purrLevel;
    double _fluff;
};

//Builder
Cat newCat (char* name, int age, double weight, double purr, double fluff) {
    Cat new = (Cat)malloc(sizeof(struct cat));
    new->_animal = newAnimal(age, name, weight);
    new->_fluff = fluff;
    new->_purrLevel = purr;
    return new;
}

//Destroyer
void destroyCat(Cat cat) {
    destroyAnimal(cat->_animal);
    free(cat);
}

//Acess
int getCatAge(Cat cat){ return getAnimalAge(cat->_animal); }
char* getCatName(Cat cat){ return getAnimalName(cat->_animal); }
double getCatWeight(Cat cat){ return getAnimalWeight(cat->_animal); }
double getCatPurrLevel(Cat cat){ return cat->_purrLevel; }
double getCatFluff(Cat cat){ return cat->_fluff; }

//Compare
int equalsCat(Cat one, Cat two) {
    return(
        equalsAnimal(one->_animal, two->_animal) &&
        getCatFluff(one) == getCatFluff(two) &&
        getCatPurrLevel(one) == getCatPurrLevel(two)
    );
}

//Print
void printCat(Cat cat){
    printf("CAT\nName: %s\nAge: %d\nWeight: %g\nFluffiness: %g\nPurr Level: %g\n\n", getCatName(cat), getCatAge(cat), getCatWeight(cat), getCatFluff(cat), getCatPurrLevel(cat));
}
