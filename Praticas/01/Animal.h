#ifndef animal_h
#define animal_h

typedef struct animal *Animal;

//Methods
int equalsAnimal(Animal first, Animal second);
char* getAnimalName(Animal animal);
int getAnimalAge(Animal animal);
double getAnimalWeight(Animal animal);
void printAnimal(Animal animal);

//Building and Destroying
Animal newAnimal(int age, char* name, double weight);
void destroyAnimal(Animal animal);

#endif