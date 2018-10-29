#include <iostream>

class Animal {
    int _age;
    std::string _name;

public:
    Animal(int a, std::string n) : Animal(a) {
        _name = n;
    }
    Animal(int a): _age(a) {
    }
    std::string name() const {
        return _name;
    }
    int age() const {
        return _age;
    }
    void sleep(){
        std::cout << "Animal " << name() << " is sleeping\n";
    }
    bool operator==(const Animal &animal){
        return _age == animal._age && _name == animal._name;
    }
    friend std::ostream &operator<<(std::ostream &o, const Animal &animal){
        o << "Animal " << animal.name() <<" is " << animal.age() << " years old";
        return o;
    }
};

class Cat : public Animal {
    int _lives;

public:
    Cat(int a, std::string n, int l): Animal(a, n), _lives(l) {
    }
    void climb(){
        std::cout << "Cat " << name() << " is climbing\n";
    }
    int lives() const {
        return _lives;
    }
    bool operator==(const Cat &cat){
        return Animal::operator==(cat) && lives() == cat.lives();
    }
    friend std::ostream &operator<<(std::ostream &o, const Cat &cat){
        o << (Animal&)cat << ", is a cat and has " << cat.lives() << ((cat.lives() == 1)? " life" : " lives");
        return o;
    }
};

class Dog : public Animal {
    double _weight;

public:
    Dog(int a, std::string n, double w): Animal(a, n), _weight(w) {
    }
    void bark() {
        std::cout << "Dog " << name() << " is barking\n";
    }
    double weight() const {
        return _weight;
    }
    bool operator==(const Dog &dog){
        return Animal::operator==(dog) && weight() == dog.weight();
    }
    friend std::ostream &operator<<(std::ostream &o, const Dog &dog){
        o << (Animal&)dog << ", is a dog and weighs " << dog.weight() <<((dog.weight() == 1)? "kg": "kgs");
        return o;
    }
};

int main(){
    Animal* a1 = new Animal(2);
    std::cout << "a1: " << *a1 << "\n";
 
    Animal* a2 = new Animal(10, "Coelho");
    std::cout << "a2: " << *a2 << "\n";
 
    Animal* a3 = new Animal(10, "Coelho");
    std::cout << "a3: " << *a3 << "\n";
 
    Animal* a4 = new Animal(2, "Tareco");
    std::cout << "a4: " << *a4 << "\n";
 
    Dog* d1 = new Dog(3, "Bobi", 5.3);
    std::cout << "d1: " << *d1 << "\n";

    Dog* d2 = new Dog(1, "Rex", 1.0);
    std::cout <<"d2: "<<*d2<<"\n";

    Cat* c1 = new Cat(2, "Tareco", 9);
    std::cout << "c1: " << *c1 << "\n";
 
    Cat* c2 = new Cat(2, "Tareco", 1);
    std::cout << "c2: " << *c2 << "\n";
 
    std::cout << "a1 == c1? " << (*a1 == *c1 ? "true" : "false") << "\n";
    std::cout << "a2 == a3? " << (*a2 == *a3 ? "true" : "false") << "\n";
    std::cout << "c2 == c1? " << (*c2 == *c1 ? "true" : "false") << "\n"; 
    std::cout << "a4 == c1? " << (*a4 == *c1 ? "true" : "false") << "\n";
 
    a1->sleep();
    d1->sleep();
    c1->sleep();
    d1->bark();
    c1->climb();
 
    delete a1;
    delete a2;
    delete a3;
    delete a4;
    delete d1;
    delete c1;
    delete c2;
    return 0;
}
