#include <iostream>

class Engine {
public:
    Engine(){}

    void start() {
        std::cout<<"Engine started" << std::endl;
    }

    void stop() {
        std::cout<<"Engine stopped" << std::endl;
    }

    virtual std::string engineKind()  = 0;
};

class EconomyEngine: public Engine {
public:
    std::string engineKind() override {
        return "Economy";
    }
};

class XtremeEngine: public Engine {
public:
    std::string engineKind() override {
        return "Xtreme";
    }
};

class Car{
protected:
    EconomyEngine* _engine;
public:
    Car(): _engine(new EconomyEngine()) {}
    Car(EconomyEngine* engine): _engine(engine){}
    EconomyEngine* engine() const {
        return _engine;
    }
    void run(){
        engine()->start();
    }
    void halt(){
        engine()->stop();
    }
    virtual std::string range()const =0;
    friend std::ostream &operator<<(std::ostream &o, const  Car &car){
        o << "Car of range " << car.range() << ", engine " << car.engine()->engineKind();
        return o;
    }
    virtual ~Car(){
        delete _engine;
    }
};

class BasicCar: public Car{
public:
    BasicCar(): Car() {}
    virtual std::string range() const override {
        return "Low range car";
    }
};

class MediumCar: public Car{
public:
    MediumCar(): Car(){}
    MediumCar(EconomyEngine* e): Car(e) {}
    virtual std::string range() const override{
        return "Medium range car";
    }
    void setEngine(EconomyEngine* eng){
        delete engine();
        _engine = eng;
    }
};

class TopCar: public Car {
    XtremeEngine* _xtreme = nullptr;
public:
    TopCar(): Car(){}
    TopCar(EconomyEngine* e): Car(e){} 
    TopCar(XtremeEngine* xtreme): Car(), _xtreme(xtreme) {}
    TopCar(EconomyEngine* e, XtremeEngine* x): Car(e) {
        _xtreme = x;
    }
    virtual std::string range() const override{
        return "Top range car" + (secondEngine() != nullptr ? " has a second " + secondEngine()->engineKind() + " engine" : "") ;
    }
    XtremeEngine* secondEngine() const {
        return _xtreme;
    }
    void setEngine(EconomyEngine* eng){
        delete engine();
        _engine = eng;
    }
    void setSecondEngine(){
        if(secondEngine() == nullptr){
            _xtreme = new XtremeEngine;
        }
    }
    void setSecondEngine(XtremeEngine* xtreme){
        if(secondEngine() ==nullptr){
            _xtreme=xtreme;
        }
    }
    virtual ~TopCar(){
        if(secondEngine() != nullptr){
            delete _xtreme;
        }
    }
};

int main() {

    EconomyEngine* eng = new EconomyEngine();
    XtremeEngine* xtreme = new XtremeEngine();

    BasicCar* b1 = new BasicCar();
    MediumCar* m1 = new MediumCar(eng);
    TopCar* t1 = new TopCar();

    std::cout<< *b1 << std::endl;
    std::cout<< *m1 << std::endl;
    std::cout<< *t1 << std::endl;

    b1->run();
    b1->halt();

    m1->run();
    m1->halt();

    t1->run();
    t1->halt();

    t1->setSecondEngine(xtreme);

    std::cout << *t1 << std::endl;

    delete t1;
    delete m1;
    delete b1;

    return 0;
}
