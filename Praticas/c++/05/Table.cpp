#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Printer{
public:
    virtual string format(int i) = 0;
};


class Table{
    vector<int> _vector;
public:
    Table(int s){
        _vector = vector<int>(s, 0);
    }

    int getValue(int pos){
        return _vector.at(pos);
    }

    void setValue(int pos, int value){
        _vector.at(pos) = value;
    }

    void setAll(int value){
        for(int i=0; i<_vector.size(); i++){
            _vector.at(i) = value;
        }
    }

    void print(Printer& p){
        for(int i=0; i<_vector.size(); i++){
            cout << p.format(_vector.at(i)) << endl;
        }
    }
};


class BracketsPrinter: public Printer{
public:
    virtual string format(int i) override {
        return "{" + to_string(i) + "}";
    }
};

class DuplicatePrinter: public Printer{
public:
    virtual string format(int i) override {
        return to_string(i) +" "+ to_string(i);
    }
};

int main(){
    Table* t = new Table(10);

    t->setAll(5);

    BracketsPrinter* b = new BracketsPrinter();
    DuplicatePrinter* d = new DuplicatePrinter();

    t->print(*b);
    t->print(*d);

    delete t;
    delete d;
    delete b;

    return 0;
}