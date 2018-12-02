#include <iostream>
#include <vector>

class Person;
class Company;
class Region;

class FlexyIrs {
public:
    virtual double taxPerson(Person *p) = 0;
    virtual double taxCompany(Company *c) = 0;
    virtual double taxRegion(Region *r) = 0;
};

class Taxpayer {
public:
    virtual double accept(FlexyIrs *irs) = 0;
};

class Person: public Taxpayer{
public:
    virtual double accept(FlexyIrs *irs){
        return irs->taxPerson(this);
    }
};

class Company : public Taxpayer{
    std::vector<Person*> _persons;
public:
 virtual double accept(FlexyIrs *irs){
        return irs->taxCompany(this);
    }

    //These methods wil be ommited in evaluation

    void addPerson(Person *p){
        _persons.push_back(p);
    }

    int getSize(){
        return _persons.size();
    }

    Person* getPerson(int pos){
        return _persons.at(pos); 
    };
};

class Region : public Taxpayer{
    std::vector<Company*> _companies;
public:
 virtual double accept(FlexyIrs *irs){
        return irs->taxRegion(this);
    }

    //These methods wil be ommited in evaluation

    void addPerson(Company *c){
        _companies.push_back(c);
    }

    int getSize(){
        return _companies.size();
    }

    Company* getPerson(int pos){
        return _companies.at(pos); 
    };
};

class FastTrack: public FlexyIrs{
    virtual double taxPerson(Person *p){
        return 1;
    }
    virtual double taxCompany(Company *c){
        double tax=0;
        int size = c->getSize();
        Person *current;
        for(int i =0; i<size; i++){
            current = c->getPerson(i);
            tax += current->accept(this);
        }
        if(size < 4){
            tax *= 0.6;
        }
        return tax;
    }
    virtual double taxRegion(Region *r){
        double tax=0;
        int size = r->getSize();
        Company *current;
        bool discount = false;
        for(int i =0; i<size; i++){
            current = r->getPerson(i);
            tax += current->accept(this);
            if(current->getSize() < 10){
                discount = true;
            }
        }
        if(discount){
            tax *= 0.8;
        }
        return tax;
    };
};

//Main will be ommited for evaluation

int main(){

    int i,j;

    FastTrack irs;
    Company* aux;

    Person p;
    Company c;
    for(i =0; i<3; i++){
        c.addPerson(new Person());
    }
    Region r;
    for(i = 0; i<10; i++){
        aux = new Company();
        for(j=0; j<8; j++){
            aux->addPerson(new Person());
        }
        r.addPerson(aux);
    }

    std::cout << "Person tax: " << p.accept(&irs) << std::endl;
    std::cout << "Company Tax (3 persons): " << c.accept(&irs) << std::endl;
    std::cout << "Region tax(10 companies, 8 persons each): " << r.accept(&irs) << std::endl;

    return 0;
}