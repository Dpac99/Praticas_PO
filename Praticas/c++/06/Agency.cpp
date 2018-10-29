#include <iostream>
#include <vector>

using namespace std;

class Individual{
public:
    virtual void receiveAid(int amount) = 0;
    virtual int getAid() = 0;
};

class Collective: public Individual{
private:
    vector<Individual*> _group = std::vector<Individual*>();
public:
    void addIndividual(Individual* i){
        _group.push_back(i);
    }
    void receiveAid(int amount) override {
        int total = _group.size();
        if(amount <= 0 || total ==0){
            return;
        }
        amount /= total;
        for(int i=0; i< total; i++){
            _group.at(i)->receiveAid(amount);
        }
    }
    virtual int getAid() override{
        int total=0;
        for(int i=0; i<_group.size(); i++){
            total+= _group.at(i)->getAid();
        }
        return total;
    }
};

class Person: public Individual{
private:
    int _aid=0;
public:
    virtual void receiveAid(int amount) override{
        _aid += (amount? amount: 0);
    }
    virtual int getAid() override {
        return _aid; 
    }
};

class Village: public Collective{
public:
    void addPerson(Person* p){
        addIndividual(p);
    }
};

class Region: public Collective {
public:
    void addPerson(Person* p){
        addIndividual(p);
    }
    void addVillage(Village* v){
        addIndividual(v);
    }
};

int main(){
    Person* i1 = new Person();
    Person* i2 = new Person();
    Person* i3 = new Person();
    Person* i4 = new Person();
    Person* i5 = new Person();

    Person* p1 = new Person();
    Person* p2 = new Person();
    Person* p3 = new Person();
    Person* p4 = new Person();
    Person* p5 = new Person();

    Person* q1 = new Person();
    Person* q2 = new Person();
    Person* q3 = new Person();
    Person* q4 = new Person();
    Person* q5 = new Person();

    Village* v1 = new Village();
    Village* v2 = new Village();

    v1->addIndividual(p1);
    v1->addIndividual(p2);
    v1->addIndividual(p3);
    v1->addIndividual(p4);
    v1->addIndividual(p5);

    v2->addIndividual(q1);
    v2->addIndividual(q2);
    v2->addIndividual(q3);
    v2->addIndividual(q4);
    v2->addIndividual(q5);

    Region* r = new Region();
    
    r->addVillage(v1);
    r->addVillage(v2);

    r->addPerson(i1);
    r->addPerson(i2);
    r->addPerson(i3);
    r->addPerson(i4);
    r->addPerson(i5);

    r->receiveAid(7000);
    v1->receiveAid(500);
    v2->receiveAid(1000);
    i1->receiveAid(5);

    cout<<"Region: "<< r->getAid() << endl;
    cout <<"Village 1: " << v1->getAid() << endl;
    cout <<"Village 2: " << v2->getAid() << endl;
    
}
