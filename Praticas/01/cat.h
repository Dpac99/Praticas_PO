#ifndef CAT_H
#define CAT_H

typedef struct cat *Cat;

//Build and Destroy
Cat newCat (char* name, int age,  double weight, double purr, double fluff);
void destroyCat (Cat cat);

//Methods
int getCatAge(Cat cat);
char* getCatName(Cat cat);
double getCatWeight(Cat cat);
double getCatPurrLevel(Cat cat);
double getCatFluff(Cat cat);
int equalsCat(Cat one, Cat two);
void printCat(Cat cat);

#endif