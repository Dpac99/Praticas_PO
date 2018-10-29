#include "Animal.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct animal {
    char _name[16];
    int _age;
    double _weight;
};

Animal newAnimal (int age, char* name, double weight) {
    Animal new = (Animal)malloc(sizeof(struct animal));
    strcpy(new->_name, name);
    new->_age = age;
    new->_weight = weight;
    return new;
}

void destroyAnimal (Animal animal) {
    free(animal);
}

char* getAnimalName(Animal animal) {
    return animal->_name;
}

double getAnimalWeight(Animal animal) {
    return animal->_weight;
}

int getAnimalAge(Animal animal) {
    return animal->_age;
}

int equalsAnimal(Animal first, Animal second) {
    return (!strcmp(getAnimalName(first), getAnimalName(second)) && (getAnimalAge(first) ==getAnimalAge(second)) && (getAnimalWeight(first) == getAnimalWeight(second)) );
}

void printAnimal(Animal animal) {
    printf("Name: %s\nAge: %d\nWeight: %g\n\n", getAnimalName(animal), getAnimalAge(animal), getAnimalWeight(animal));
}
